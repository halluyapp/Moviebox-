package com.moviebox.frontend;

import org.json.JSONObject;

public final class CatalogItem {
    public final long id;
    public final String title;
    public final String mediaType;
    public final String overview;
    public final String posterPath;
    public final String backdropPath;
    public final String releaseDate;
    public final double rating;

    public CatalogItem(long id, String title, String mediaType, String overview,
                       String posterPath, String backdropPath, String releaseDate, double rating) {
        this.id = id;
        this.title = title == null || title.trim().isEmpty() ? "Untitled" : title;
        this.mediaType = mediaType == null || mediaType.trim().isEmpty() ? "movie" : mediaType;
        this.overview = overview == null ? "" : overview;
        this.posterPath = posterPath == null ? "" : posterPath;
        this.backdropPath = backdropPath == null ? "" : backdropPath;
        this.releaseDate = releaseDate == null ? "" : releaseDate;
        this.rating = rating;
    }

    public static CatalogItem fromJson(JSONObject json, String fallbackType) {
        String type = json.optString("media_type", fallbackType);
        if ("person".equals(type) || type.isEmpty()) type = fallbackType;
        String title = json.optString("title", json.optString("name", "Untitled"));
        String date = json.optString("release_date", json.optString("first_air_date", ""));
        return new CatalogItem(
                json.optLong("id"), title, type,
                json.optString("overview", ""),
                json.optString("poster_path", ""),
                json.optString("backdrop_path", ""),
                date,
                json.optDouble("vote_average", 0.0)
        );
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        try {
            json.put("id", id);
            json.put("title", title);
            json.put("media_type", mediaType);
            json.put("overview", overview);
            json.put("poster_path", posterPath);
            json.put("backdrop_path", backdropPath);
            json.put("release_date", releaseDate);
            json.put("vote_average", rating);
        } catch (Exception ignored) {
            // All values are primitive or strings; a JSON failure is not expected.
        }
        return json;
    }

    public String year() {
        return releaseDate.length() >= 4 ? releaseDate.substring(0, 4) : "";
    }
}
