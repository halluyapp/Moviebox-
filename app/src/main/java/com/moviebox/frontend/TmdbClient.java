package com.moviebox.frontend;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** Catalogue-only TMDB client. It does not request video streams or download media. */
public final class TmdbClient {
    public interface ListCallback { void onResult(List<CatalogItem> items, String error); }
    public interface ItemCallback { void onResult(CatalogItem item, String error); }

    private static final String API_ROOT = "https://api.themoviedb.org/3";
    private final String apiKey;
    private final String accessToken;
    private final ExecutorService executor = Executors.newFixedThreadPool(3);
    private final Handler main = new Handler(Looper.getMainLooper());

    public TmdbClient(String apiKey, String accessToken) {
        this.apiKey = apiKey == null ? "" : apiKey.trim();
        this.accessToken = accessToken == null ? "" : accessToken.trim();
    }

    public boolean isConfigured() { return !accessToken.isEmpty() || !apiKey.isEmpty(); }

    public void getTrending(ListCallback callback) {
        getList("/trending/all/day", "all", callback);
    }

    public void getPopularMovies(ListCallback callback) {
        getList("/movie/popular", "movie", callback);
    }

    public void getPopularTv(ListCallback callback) {
        getList("/tv/popular", "tv", callback);
    }

    public void getTopRated(ListCallback callback) {
        getList("/movie/top_rated", "movie", callback);
    }

    public void getAnime(ListCallback callback) {
        getList("/discover/movie?with_genres=16&sort_by=popularity.desc", "movie", callback);
    }

    public void search(String query, ListCallback callback) {
        getList("/search/multi", "all", query, callback);
    }

    public void getDetails(CatalogItem item, ItemCallback callback) {
        String type = "tv".equals(item.mediaType) ? "tv" : "movie";
        request("/" + type + "/" + item.id, "", new ItemCallback() {
            @Override public void onResult(CatalogItem result, String error) {
                if (result == null) callback.onResult(item, error);
                else callback.onResult(result, error);
            }
        });
    }

    private void getList(String path, String fallbackType, ListCallback callback) {
        getList(path, fallbackType, "", callback);
    }

    private void getList(String path, String fallbackType, String query, ListCallback callback) {
        executor.execute(() -> {
            try {
                JSONObject root = requestJson(path, query);
                JSONArray results = root.optJSONArray("results");
                List<CatalogItem> items = new ArrayList<>();
                if (results != null) {
                    for (int i = 0; i < results.length(); i++) {
                        JSONObject object = results.optJSONObject(i);
                        if (object == null) continue;
                        CatalogItem item = CatalogItem.fromJson(object, fallbackType);
                        if (!"person".equals(item.mediaType)) items.add(item);
                    }
                }
                main.post(() -> callback.onResult(items, null));
            } catch (Exception exception) {
                String message = exception.getMessage() == null ? "Could not load catalogue" : exception.getMessage();
                main.post(() -> callback.onResult(new ArrayList<>(), message));
            }
        });
    }

    private void request(String path, String query, ItemCallback callback) {
        executor.execute(() -> {
            try {
                JSONObject object = requestJson(path, query);
                String type = path.startsWith("/tv/") ? "tv" : "movie";
                CatalogItem item = CatalogItem.fromJson(object, type);
                main.post(() -> callback.onResult(item, null));
            } catch (Exception exception) {
                String message = exception.getMessage() == null ? "Could not load title details" : exception.getMessage();
                main.post(() -> callback.onResult(null, message));
            }
        });
    }

    private JSONObject requestJson(String path, String query) throws Exception {
        Uri.Builder builder = Uri.parse(API_ROOT + path).buildUpon().appendQueryParameter("language", "en-US");
        if (query != null && !query.trim().isEmpty()) {
            builder.appendQueryParameter("query", query.trim());
            if (path.startsWith("/search/")) builder.appendQueryParameter("include_adult", "false");
        }
        if (accessToken.isEmpty() && !apiKey.isEmpty()) builder.appendQueryParameter("api_key", apiKey);
        URL url = new URL(builder.build().toString());
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setConnectTimeout(12000);
        connection.setReadTimeout(15000);
        connection.setRequestProperty("Accept", "application/json");
        if (!accessToken.isEmpty()) connection.setRequestProperty("Authorization", "Bearer " + accessToken);
        int code = connection.getResponseCode();
        InputStream stream = code >= 200 && code < 300 ? connection.getInputStream() : connection.getErrorStream();
        StringBuilder body = new StringBuilder();
        if (stream != null) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {
                String line;
                while ((line = reader.readLine()) != null) body.append(line);
            }
        }
        connection.disconnect();
        if (code < 200 || code >= 300) throw new IllegalStateException("TMDB returned HTTP " + code);
        return new JSONObject(body.toString());
    }
}
