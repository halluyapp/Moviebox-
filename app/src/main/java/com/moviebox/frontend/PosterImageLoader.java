package com.moviebox.frontend;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class PosterImageLoader {
    private static final String IMAGE_ROOT = "https://image.tmdb.org/t/p/";
    private static final ExecutorService EXECUTOR = Executors.newFixedThreadPool(4);
    private static final android.util.LruCache<String, Bitmap> CACHE = new android.util.LruCache<String, Bitmap>(24 * 1024 * 1024) {
        @Override protected int sizeOf(String key, Bitmap value) { return value.getByteCount(); }
    };

    public void loadPoster(String path, ImageView view) { load(path, "w500", view); }
    public void loadBackdrop(String path, ImageView view) { load(path, "w1280", view); }

    private void load(String path, String size, ImageView view) {
        if (path == null || path.trim().isEmpty()) {
            view.setImageDrawable(new ColorDrawable(Color.rgb(28, 32, 40)));
            return;
        }
        String url = IMAGE_ROOT + size + path;
        view.setTag(url);
        Bitmap cached = CACHE.get(url);
        if (cached != null) {
            view.setImageBitmap(cached);
            return;
        }
        view.setImageDrawable(new ColorDrawable(Color.rgb(28, 32, 40)));
        EXECUTOR.execute(() -> {
            Bitmap bitmap = null;
            HttpURLConnection connection = null;
            try {
                connection = (HttpURLConnection) new URL(url).openConnection();
                connection.setConnectTimeout(10000);
                connection.setReadTimeout(12000);
                connection.setInstanceFollowRedirects(true);
                try (InputStream stream = connection.getInputStream()) {
                    bitmap = BitmapFactory.decodeStream(stream);
                }
                if (bitmap != null) CACHE.put(url, bitmap);
            } catch (Exception ignored) {
                // Keep the branded placeholder when image retrieval is unavailable.
            } finally {
                if (connection != null) connection.disconnect();
            }
            Bitmap result = bitmap;
            if (result != null) view.post(() -> {
                if (url.equals(view.getTag())) view.setImageBitmap(result);
            });
        });
    }
}
