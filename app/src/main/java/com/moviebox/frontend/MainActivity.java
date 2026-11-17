package com.moviebox.frontend;

import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Runnable front-end preview built around the recovered MovieBox UI vocabulary.
 * TMDB is used for catalogue metadata only. Playback and downloads are intentionally disabled.
 */
public final class MainActivity extends Activity {
    private static final int BG = Color.rgb(7, 9, 13);
    private static final int SURFACE = Color.rgb(18, 21, 27);
    private static final int SURFACE_RAISED = Color.rgb(26, 30, 38);
    private static final int WHITE = Color.rgb(245, 247, 250);
    private static final int SECONDARY = Color.rgb(160, 167, 178);
    private static final int MUTED = Color.rgb(110, 118, 131);
    private static final int BLUE = Color.rgb(33, 102, 229);
    private static final int GREEN = Color.rgb(29, 209, 113);
    private static final String PREFS = "moviebox_frontend_preview";
    private static final String WATCHLIST = "watchlist_json";

    private TmdbClient tmdb;
    private PosterImageLoader images;
    private LinearLayout appShell;
    private FrameLayout pageHost;
    private LinearLayout bottomBar;
    private String activeTab = "Home";
    private CatalogItem currentHero;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(BG);
        getWindow().setNavigationBarColor(BG);
        getWindow().getDecorView().setSystemUiVisibility(0);
        tmdb = new TmdbClient(BuildConfig.TMDB_API_KEY, BuildConfig.TMDB_ACCESS_TOKEN);
        images = new PosterImageLoader();
        buildShell();
        showHome();
    }

    private void buildShell() {
        appShell = new LinearLayout(this);
        appShell.setOrientation(LinearLayout.VERTICAL);
        appShell.setBackgroundColor(BG);
        pageHost = new FrameLayout(this);
        appShell.addView(pageHost, new LinearLayout.LayoutParams(-1, 0, 1));
        bottomBar = makeBottomBar();
        appShell.addView(bottomBar, new LinearLayout.LayoutParams(-1, dp(66)));
        setContentView(appShell);
    }

    private LinearLayout makeBottomBar() {
        LinearLayout bar = new LinearLayout(this);
        bar.setGravity(Gravity.CENTER_VERTICAL);
        bar.setOrientation(LinearLayout.HORIZONTAL);
        bar.setPadding(dp(8), dp(5), dp(8), dp(5));
        bar.setBackgroundColor(Color.rgb(9, 11, 15));
        String[] labels = {"Home", "NovelHub", "Fight Zone", "Downloads", "Me"};
        String[] glyphs = {"⌂", "▤", "⚽", "↓", "●"};
        for (int i = 0; i < labels.length; i++) {
            final String label = labels[i];
            LinearLayout cell = new LinearLayout(this);
            cell.setOrientation(LinearLayout.VERTICAL);
            cell.setGravity(Gravity.CENTER);
            int selected = label.equals(activeTab) ? GREEN : MUTED;
            TextView icon = text(glyphs[i], 21, selected, true);
            TextView caption = text(label, 10, selected, label.equals(activeTab));
            cell.addView(icon);
            cell.addView(caption);
            cell.setContentDescription(label);
            cell.setOnClickListener(v -> navigateTab(label));
            bar.addView(cell, new LinearLayout.LayoutParams(0, -1, 1));
        }
        return bar;
    }

    private void navigateTab(String tab) {
        activeTab = tab;
        if ("Home".equals(tab)) showHome();
        else if ("Downloads".equals(tab)) showDownloads();
        else if ("Me".equals(tab)) showProfile();
        else showComingTab(tab);
    }

    private void show(View page, boolean showNavigation) {
        pageHost.removeAllViews();
        pageHost.addView(page, new FrameLayout.LayoutParams(-1, -1));
        appShell.removeView(bottomBar);
        bottomBar = makeBottomBar();
        bottomBar.setVisibility(showNavigation ? View.VISIBLE : View.GONE);
        if (showNavigation) appShell.addView(bottomBar, new LinearLayout.LayoutParams(-1, dp(66)));
    }

    private ScrollView newScrollPage() {
        ScrollView scroll = new ScrollView(this);
        scroll.setFillViewport(true);
        scroll.setClipToPadding(false);
        scroll.setBackgroundColor(BG);
        return scroll;
    }

    private LinearLayout verticalContent(ScrollView scroll) {
        LinearLayout content = new LinearLayout(this);
        content.setOrientation(LinearLayout.VERTICAL);
        content.setPadding(0, 0, 0, dp(20));
        scroll.addView(content, new ScrollView.LayoutParams(-1, -2));
        return content;
    }

    private void showHome() {
        activeTab = "Home";
        ScrollView scroll = newScrollPage();
        LinearLayout content = verticalContent(scroll);
        addHomeHeader(content);
        addCategoryChips(content);
        FrameLayout hero = createHero(content);
        addCatalogSection(content, "Trending Now", "trending");
        addCatalogSection(content, "Popular Movies", "movies");
        addCatalogSection(content, "Popular Series", "tv");
        addCatalogSection(content, "Top Rated", "top");
        show(scroll, true);

        tmdb.getTrending((items, error) -> {
            if (!items.isEmpty()) {
                currentHero = items.get(0);
                updateHero(hero, currentHero);
            } else if (!tmdb.isConfigured()) {
                setHeroFallback(hero, "Your next favourite", "Connect TMDB to load the live catalogue");
            }
        });
    }

    private void addHomeHeader(LinearLayout content) {
        LinearLayout header = new LinearLayout(this);
        header.setGravity(Gravity.CENTER_VERTICAL);
        header.setPadding(dp(18), dp(15), dp(18), dp(10));
        ImageView logo = new ImageView(this);
        logo.setImageResource(com.moviebox.frontend.R.drawable.moviebox_icon);
        logo.setScaleType(ImageView.ScaleType.CENTER_CROP);
        header.addView(logo, new LinearLayout.LayoutParams(dp(34), dp(34)));
        TextView brand = text("MovieBox", 22, WHITE, true);
        brand.setPadding(dp(9), 0, 0, 0);
        header.addView(brand, new LinearLayout.LayoutParams(0, -2, 1));
        TextView search = text("⌕", 29, WHITE, true);
        search.setGravity(Gravity.CENTER);
        search.setBackground(round(SURFACE_RAISED, dp(22)));
        search.setOnClickListener(v -> showSearch(""));
        header.addView(search, new LinearLayout.LayoutParams(dp(44), dp(44)));
        content.addView(header);
    }

    private void addCategoryChips(LinearLayout content) {
        HorizontalScrollView scroller = new HorizontalScrollView(this);
        scroller.setHorizontalScrollBarEnabled(false);
        LinearLayout chips = new LinearLayout(this);
        chips.setOrientation(LinearLayout.HORIZONTAL);
        chips.setPadding(dp(18), dp(5), dp(12), dp(12));
        String[] names = {"Fight Zone", "Live", "Trending", "Movie", "TV", "Anime", "ShortTV", "Kids", "Education", "Football", "Music", "Free Novels", "Western", "Asian", "Nollywood", "Game"};
        for (int i = 0; i < names.length; i++) {
            final String name = names[i];
            boolean selected = i == 2;
            TextView chip = text(name, 13, selected ? BG : SECONDARY, selected);
            chip.setGravity(Gravity.CENTER);
            chip.setPadding(dp(16), dp(9), dp(16), dp(9));
            chip.setBackground(round(selected ? GREEN : SURFACE, dp(20)));
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(-2, -2);
            lp.rightMargin = dp(8);
            chips.addView(chip, lp);
            chip.setOnClickListener(v -> showCategory(name));
        }
        scroller.addView(chips);
        content.addView(scroller);
    }

    private FrameLayout createHero(LinearLayout parent) {
        FrameLayout hero = new FrameLayout(this);
        hero.setBackground(round(SURFACE_RAISED, dp(20)));
        hero.setClipToOutline(true);
        LinearLayout.LayoutParams heroLp = new LinearLayout.LayoutParams(-1, dp(390));
        heroLp.setMargins(dp(16), dp(2), dp(16), dp(20));
        parent.addView(hero, heroLp);

        ImageView backdrop = new ImageView(this);
        backdrop.setScaleType(ImageView.ScaleType.CENTER_CROP);
        backdrop.setBackgroundColor(SURFACE_RAISED);
        backdrop.setTag("hero_backdrop");
        hero.addView(backdrop, new FrameLayout.LayoutParams(-1, -1));
        View shade = new View(this);
        GradientDrawable gradient = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM,
                new int[]{0x14000000, 0x26000000, 0xF207090D});
        shade.setBackground(gradient);
        hero.addView(shade, new FrameLayout.LayoutParams(-1, -1));

        LinearLayout detail = new LinearLayout(this);
        detail.setOrientation(LinearLayout.VERTICAL);
        detail.setGravity(Gravity.BOTTOM);
        detail.setPadding(dp(20), dp(24), dp(20), dp(22));
        FrameLayout.LayoutParams detailsLp = new FrameLayout.LayoutParams(-1, -2, Gravity.BOTTOM);
        hero.addView(detail, detailsLp);
        TextView eyebrow = text("MOVIEBOX ORIGINALS & TRENDING", 10, GREEN, true);
        eyebrow.setLetterSpacing(0.12f);
        detail.addView(eyebrow);
        TextView title = text("Discover what to watch", 27, WHITE, true);
        title.setMaxLines(2);
        title.setTag("hero_title");
        LinearLayout.LayoutParams titleLp = new LinearLayout.LayoutParams(-1, -2);
        titleLp.topMargin = dp(6);
        detail.addView(title, titleLp);
        TextView meta = text("Movies  •  Series  •  Stories", 13, SECONDARY, false);
        meta.setTag("hero_meta");
        LinearLayout.LayoutParams metaLp = new LinearLayout.LayoutParams(-1, -2);
        metaLp.topMargin = dp(5);
        detail.addView(meta, metaLp);
        LinearLayout buttons = new LinearLayout(this);
        buttons.setGravity(Gravity.CENTER_VERTICAL);
        LinearLayout.LayoutParams buttonsLp = new LinearLayout.LayoutParams(-1, -2);
        buttonsLp.topMargin = dp(14);
        detail.addView(buttons, buttonsLp);
        TextView play = actionButton("▶  Play", true);
        play.setOnClickListener(v -> {
            if (currentHero != null) showPlayer(currentHero);
            else comingSoon("Playback is not enabled in this preview.");
        });
        buttons.addView(play, new LinearLayout.LayoutParams(dp(124), dp(44)));
        TextView more = actionButton("More info", false);
        LinearLayout.LayoutParams moreLp = new LinearLayout.LayoutParams(dp(120), dp(44));
        moreLp.leftMargin = dp(10);
        buttons.addView(more, moreLp);
        more.setOnClickListener(v -> { if (currentHero != null) showDetails(currentHero); });
        return hero;
    }

    private void updateHero(FrameLayout hero, CatalogItem item) {
        if (hero == null || item == null) return;
        View imageView = hero.getChildAt(0);
        if (imageView instanceof ImageView) images.loadBackdrop(item.backdropPath, (ImageView) imageView);
        for (int i = 0; i < hero.getChildCount(); i++) {
            View child = hero.getChildAt(i);
            if (child instanceof LinearLayout) {
                LinearLayout detail = (LinearLayout) child;
                for (int j = 0; j < detail.getChildCount(); j++) {
                    View inner = detail.getChildAt(j);
                    if (inner instanceof TextView && "hero_title".equals(inner.getTag())) ((TextView) inner).setText(item.title);
                    if (inner instanceof TextView && "hero_meta".equals(inner.getTag())) {
                        String rating = item.rating > 0 ? String.format("★ %.1f", item.rating) : "Popular now";
                        ((TextView) inner).setText(rating + (item.year().isEmpty() ? "" : "  •  " + item.year()) + "  •  " + ("tv".equals(item.mediaType) ? "Series" : "Movie"));
                    }
                    if (inner instanceof LinearLayout) {
                        LinearLayout buttons = (LinearLayout) inner;
                        if (buttons.getChildCount() > 0) buttons.getChildAt(0).setOnClickListener(v -> showPlayer(item));
                        if (buttons.getChildCount() > 1) buttons.getChildAt(1).setOnClickListener(v -> showDetails(item));
                    }
                }
            }
        }
    }

    private void setHeroFallback(FrameLayout hero, String title, String meta) {
        if (hero == null) return;
        for (int i = 0; i < hero.getChildCount(); i++) {
            View child = hero.getChildAt(i);
            if (child instanceof LinearLayout) {
                LinearLayout detail = (LinearLayout) child;
                for (int j = 0; j < detail.getChildCount(); j++) {
                    View inner = detail.getChildAt(j);
                    if (inner instanceof TextView && "hero_title".equals(inner.getTag())) ((TextView) inner).setText(title);
                    if (inner instanceof TextView && "hero_meta".equals(inner.getTag())) ((TextView) inner).setText(meta);
                }
            }
        }
    }

    private void addCatalogSection(LinearLayout content, String title, String type) {
        LinearLayout section = new LinearLayout(this);
        section.setOrientation(LinearLayout.VERTICAL);
        LinearLayout heading = new LinearLayout(this);
        heading.setGravity(Gravity.CENTER_VERTICAL);
        heading.setPadding(dp(18), dp(3), dp(18), dp(9));
        TextView label = text(title, 19, WHITE, true);
        heading.addView(label, new LinearLayout.LayoutParams(0, -2, 1));
        TextView seeAll = text("See all  ›", 12, SECONDARY, false);
        heading.addView(seeAll);
        seeAll.setOnClickListener(v -> showCategory(title));
        section.addView(heading);

        HorizontalScrollView scroller = new HorizontalScrollView(this);
        scroller.setHorizontalScrollBarEnabled(false);
        LinearLayout row = new LinearLayout(this);
        row.setOrientation(LinearLayout.HORIZONTAL);
        row.setPadding(dp(18), 0, dp(8), dp(5));
        scroller.addView(row);
        section.addView(scroller);
        content.addView(section);
        LinearLayout.LayoutParams sectionLp = (LinearLayout.LayoutParams) section.getLayoutParams();
        sectionLp.bottomMargin = dp(19);
        section.setLayoutParams(sectionLp);
        loadRow(type, row);
    }

    private void loadRow(String type, LinearLayout row) {
        if (!tmdb.isConfigured()) {
            TextView hint = text("Add TMDB credentials as Actions secrets to load the live catalogue.", 12, MUTED, false);
            hint.setPadding(dp(2), dp(9), dp(18), dp(12));
            row.addView(hint);
            return;
        }
        TmdbClient.ListCallback callback = (items, error) -> {
            row.removeAllViews();
            if (items.isEmpty()) {
                TextView hint = text(error == null ? "No titles found" : "Catalogue unavailable — try again shortly", 12, MUTED, false);
                hint.setPadding(dp(2), dp(10), dp(16), dp(10));
                row.addView(hint);
                return;
            }
            for (CatalogItem item : items) row.addView(createPosterCard(item));
        };
        if ("movies".equals(type)) tmdb.getPopularMovies(callback);
        else if ("tv".equals(type)) tmdb.getPopularTv(callback);
        else if ("top".equals(type)) tmdb.getTopRated(callback);
        else if ("anime".equals(type)) tmdb.getAnime(callback);
        else tmdb.getTrending(callback);
    }

    private View createPosterCard(CatalogItem item) {
        LinearLayout card = new LinearLayout(this);
        card.setOrientation(LinearLayout.VERTICAL);
        card.setFocusable(true);
        card.setClickable(true);
        LinearLayout.LayoutParams cardLp = new LinearLayout.LayoutParams(dp(122), -2);
        cardLp.rightMargin = dp(10);
        card.setLayoutParams(cardLp);

        FrameLayout imageBox = new FrameLayout(this);
        imageBox.setBackground(round(SURFACE_RAISED, dp(9)));
        imageBox.setClipToOutline(true);
        card.addView(imageBox, new LinearLayout.LayoutParams(-1, dp(178)));
        ImageView poster = new ImageView(this);
        poster.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageBox.addView(poster, new FrameLayout.LayoutParams(-1, -1));
        images.loadPoster(item.posterPath, poster);
        if (item.rating > 0) {
            TextView rating = text("★ " + String.format("%.1f", item.rating), 10, WHITE, true);
            rating.setPadding(dp(7), dp(4), dp(7), dp(4));
            rating.setBackground(round(0xCC090B0F, dp(11)));
            FrameLayout.LayoutParams ratingLp = new FrameLayout.LayoutParams(-2, -2, Gravity.TOP | Gravity.END);
            ratingLp.setMargins(0, dp(7), dp(6), 0);
            imageBox.addView(rating, ratingLp);
        }
        TextView title = text(item.title, 12, WHITE, true);
        title.setMaxLines(1);
        title.setEllipsize(android.text.TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams titleLp = new LinearLayout.LayoutParams(-1, -2);
        titleLp.topMargin = dp(7);
        card.addView(title, titleLp);
        TextView subtitle = text((item.year().isEmpty() ? "" : item.year() + "  •  ") + ("tv".equals(item.mediaType) ? "Series" : "Movie"), 10, MUTED, false);
        subtitle.setMaxLines(1);
        LinearLayout.LayoutParams subLp = new LinearLayout.LayoutParams(-1, -2);
        subLp.topMargin = dp(2);
        card.addView(subtitle, subLp);
        card.setOnClickListener(v -> showDetails(item));
        return card;
    }

    private void showCategory(String category) {
        if ("ShortTV".equals(category)) { showShorts(); return; }
        if ("Fight Zone".equals(category) || "Live".equals(category) || "Football".equals(category)
                || "Music".equals(category) || "Education".equals(category) || "Free Novels".equals(category)
                || "Game".equals(category)) { showComingTab(category); return; }
        activeTab = "Home";
        ScrollView scroll = newScrollPage();
        LinearLayout content = verticalContent(scroll);
        addPageHeader(content, category, () -> showHome());
        if ("Movie".equals(category)) {
            addCatalogSection(content, "Popular Movies", "movies");
            addCatalogSection(content, "Top Rated", "top");
        } else if ("TV".equals(category)) {
            addCatalogSection(content, "Popular Series", "tv");
            addCatalogSection(content, "Trending Now", "trending");
        } else if ("Anime".equals(category)) {
            addCatalogSection(content, "Anime Movies", "anime");
            addCatalogSection(content, "Popular Series", "tv");
        } else {
            addCatalogSection(content, "Trending Now", "trending");
            addCatalogSection(content, "Popular Movies", "movies");
            addCatalogSection(content, "Popular Series", "tv");
        }
        show(scroll, true);
    }

    private void showSearch(String initialQuery) {
        activeTab = "Home";
        ScrollView scroll = newScrollPage();
        LinearLayout content = verticalContent(scroll);
        LinearLayout header = new LinearLayout(this);
        header.setGravity(Gravity.CENTER_VERTICAL);
        header.setPadding(dp(16), dp(14), dp(16), dp(10));
        TextView back = text("‹", 32, WHITE, false);
        back.setGravity(Gravity.CENTER);
        header.addView(back, new LinearLayout.LayoutParams(dp(38), dp(44)));
        back.setOnClickListener(v -> showHome());
        EditText input = new EditText(this);
        input.setSingleLine(true);
        input.setTextColor(WHITE);
        input.setHintTextColor(MUTED);
        input.setHint("Search movies, series and anime");
        input.setTextSize(14);
        input.setPadding(dp(12), 0, dp(10), 0);
        input.setBackground(round(SURFACE_RAISED, dp(11)));
        input.setImeOptions(EditorInfo.IME_ACTION_SEARCH);
        header.addView(input, new LinearLayout.LayoutParams(0, dp(46), 1));
        TextView go = text("Search", 13, GREEN, true);
        go.setPadding(dp(12), 0, 0, 0);
        header.addView(go);
        content.addView(header);

        TextView resultHeading = text("Discover", 20, WHITE, true);
        resultHeading.setPadding(dp(18), dp(15), dp(18), dp(11));
        content.addView(resultHeading);
        LinearLayout results = new LinearLayout(this);
        results.setOrientation(LinearLayout.VERTICAL);
        results.setPadding(dp(16), 0, dp(16), dp(20));
        content.addView(results);
        Runnable doSearch = () -> {
            String query = input.getText().toString().trim();
            if (query.isEmpty()) return;
            resultHeading.setText("Results for “" + query + "”");
            if (!tmdb.isConfigured()) {
                results.removeAllViews();
                results.addView(text("Add TMDB credentials in GitHub Actions to search the live catalogue.", 13, MUTED, false));
                return;
            }
            results.removeAllViews();
            results.addView(text("Searching…", 13, MUTED, false));
            tmdb.search(query, (items, error) -> {
                results.removeAllViews();
                if (items.isEmpty()) {
                    results.addView(text(error == null ? "No results found" : "Search is temporarily unavailable", 13, MUTED, false));
                    return;
                }
                for (CatalogItem item : items) results.addView(createSearchResult(item));
            });
        };
        go.setOnClickListener(v -> doSearch.run());
        input.setOnEditorActionListener((view, actionId, event) -> {
            if (actionId == EditorInfo.IME_ACTION_SEARCH) { doSearch.run(); return true; }
            return false;
        });
        if (initialQuery != null && !initialQuery.isEmpty()) {
            input.setText(initialQuery);
            input.setSelection(input.length());
            input.postDelayed(doSearch, 250);
        }
        show(scroll, true);
    }

    private View createSearchResult(CatalogItem item) {
        LinearLayout row = new LinearLayout(this);
        row.setGravity(Gravity.CENTER_VERTICAL);
        row.setPadding(0, dp(7), 0, dp(7));
        ImageView poster = new ImageView(this);
        poster.setScaleType(ImageView.ScaleType.CENTER_CROP);
        poster.setBackground(round(SURFACE_RAISED, dp(7)));
        row.addView(poster, new LinearLayout.LayoutParams(dp(66), dp(94)));
        images.loadPoster(item.posterPath, poster);
        LinearLayout details = new LinearLayout(this);
        details.setOrientation(LinearLayout.VERTICAL);
        details.setPadding(dp(13), 0, 0, 0);
        row.addView(details, new LinearLayout.LayoutParams(0, -2, 1));
        details.addView(text(item.title, 15, WHITE, true));
        addGap(details, 5);
        details.addView(text((item.year().isEmpty() ? "" : item.year() + "  •  ") + ("tv".equals(item.mediaType) ? "TV Series" : "Movie"), 12, SECONDARY, false));
        addGap(details, 5);
        details.addView(text(item.rating > 0 ? "★ " + String.format("%.1f", item.rating) : "", 12, GREEN, true));
        row.setOnClickListener(v -> showDetails(item));
        return row;
    }

    private void showDetails(CatalogItem item) {
        ScrollView scroll = newScrollPage();
        LinearLayout content = verticalContent(scroll);
        FrameLayout hero = new FrameLayout(this);
        hero.setBackgroundColor(SURFACE_RAISED);
        ImageView backdrop = new ImageView(this);
        backdrop.setScaleType(ImageView.ScaleType.CENTER_CROP);
        hero.addView(backdrop, new FrameLayout.LayoutParams(-1, -1));
        images.loadBackdrop(item.backdropPath, backdrop);
        View fade = new View(this);
        fade.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM,
                new int[]{0x40000000, 0xF207090D}));
        hero.addView(fade, new FrameLayout.LayoutParams(-1, -1));
        TextView back = text("‹", 34, WHITE, true);
        back.setGravity(Gravity.CENTER);
        back.setBackground(round(0x66090B0F, dp(22)));
        FrameLayout.LayoutParams backLp = new FrameLayout.LayoutParams(dp(44), dp(44), Gravity.TOP | Gravity.START);
        backLp.setMargins(dp(16), dp(16), 0, 0);
        hero.addView(back, backLp);
        back.setOnClickListener(v -> showHome());
        content.addView(hero, new LinearLayout.LayoutParams(-1, dp(280)));

        TextView type = text("MOVIEBOX  •  " + ("tv".equals(item.mediaType) ? "SERIES" : "MOVIE"), 10, GREEN, true);
        type.setLetterSpacing(0.12f);
        type.setPadding(dp(18), dp(18), dp(18), dp(6));
        content.addView(type);
        TextView title = text(item.title, 27, WHITE, true);
        title.setPadding(dp(18), 0, dp(18), dp(5));
        content.addView(title);
        String meta = (item.year().isEmpty() ? "" : item.year()) + (item.rating > 0 ? "   •   ★ " + String.format("%.1f", item.rating) : "") + "   •   " + ("tv".equals(item.mediaType) ? "TV Series" : "Movie");
        TextView details = text(meta, 13, SECONDARY, false);
        details.setPadding(dp(18), dp(4), dp(18), dp(12));
        content.addView(details);

        LinearLayout actions = new LinearLayout(this);
        actions.setPadding(dp(18), dp(5), dp(18), dp(9));
        TextView play = actionButton("▶  Play", true);
        actions.addView(play, new LinearLayout.LayoutParams(0, dp(48), 1));
        play.setOnClickListener(v -> showPlayer(item));
        TextView save = actionButton(isSaved(item) ? "✓  My List" : "+  My List", false);
        LinearLayout.LayoutParams saveLp = new LinearLayout.LayoutParams(0, dp(48), 1);
        saveLp.leftMargin = dp(8);
        actions.addView(save, saveLp);
        save.setOnClickListener(v -> {
            toggleSaved(item);
            save.setText(isSaved(item) ? "✓  My List" : "+  My List");
            Toast.makeText(this, isSaved(item) ? "Added to My List" : "Removed from My List", Toast.LENGTH_SHORT).show();
        });
        content.addView(actions);

        TextView download = text("⇩  Download", 13, SECONDARY, true);
        download.setGravity(Gravity.CENTER);
        download.setBackground(round(SURFACE, dp(10)));
        LinearLayout.LayoutParams downloadLp = new LinearLayout.LayoutParams(-1, dp(44));
        downloadLp.setMargins(dp(18), 0, dp(18), dp(12));
        content.addView(download, downloadLp);
        download.setOnClickListener(v -> comingSoon("Downloads are coming soon in this front-end preview."));

        TextView synopsisTitle = text("Overview", 18, WHITE, true);
        synopsisTitle.setPadding(dp(18), dp(14), dp(18), dp(6));
        content.addView(synopsisTitle);
        TextView overview = text(item.overview.isEmpty() ? "No overview is available for this title yet." : item.overview, 14, SECONDARY, false);
        overview.setLineSpacing(dp(3), 1f);
        overview.setPadding(dp(18), 0, dp(18), dp(18));
        content.addView(overview);

        TextView castLabel = text("Cast & crew", 18, WHITE, true);
        castLabel.setPadding(dp(18), dp(4), dp(18), dp(4));
        content.addView(castLabel);
        TextView castHint = text("Title details and credits are provided by TMDB.", 12, MUTED, false);
        castHint.setPadding(dp(18), dp(5), dp(18), dp(15));
        content.addView(castHint);
        addCatalogSection(content, "You may also like", "trending");
        tmdb.getDetails(item, (loaded, error) -> {
            if (loaded != null) overview.setText(loaded.overview.isEmpty() ? "No overview is available for this title yet." : loaded.overview);
        });
        show(scroll, false);
    }

    private void showPlayer(CatalogItem item) {
        LinearLayout page = new LinearLayout(this);
        page.setOrientation(LinearLayout.VERTICAL);
        page.setBackgroundColor(BG);
        LinearLayout top = new LinearLayout(this);
        top.setGravity(Gravity.CENTER_VERTICAL);
        top.setPadding(dp(15), dp(8), dp(15), dp(8));
        TextView back = text("‹", 32, WHITE, true);
        back.setGravity(Gravity.CENTER);
        top.addView(back, new LinearLayout.LayoutParams(dp(42), dp(46)));
        back.setOnClickListener(v -> showDetails(item));
        TextView title = text(item.title, 16, WHITE, true);
        title.setMaxLines(1);
        title.setEllipsize(android.text.TextUtils.TruncateAt.END);
        top.addView(title, new LinearLayout.LayoutParams(0, -2, 1));
        TextView more = text("⋮", 24, WHITE, true);
        top.addView(more);
        more.setOnClickListener(v -> comingSoon("Player settings are coming soon."));
        page.addView(top);

        FrameLayout playerSurface = new FrameLayout(this);
        playerSurface.setBackgroundColor(Color.BLACK);
        LinearLayout.LayoutParams surfaceLp = new LinearLayout.LayoutParams(-1, dp(235));
        surfaceLp.topMargin = dp(12);
        page.addView(playerSurface, surfaceLp);
        ImageView backdrop = new ImageView(this);
        backdrop.setScaleType(ImageView.ScaleType.CENTER_CROP);
        playerSurface.addView(backdrop, new FrameLayout.LayoutParams(-1, -1));
        images.loadBackdrop(item.backdropPath, backdrop);
        View dim = new View(this);
        dim.setBackgroundColor(0x88000000);
        playerSurface.addView(dim, new FrameLayout.LayoutParams(-1, -1));
        TextView play = text("▶", 28, WHITE, true);
        play.setGravity(Gravity.CENTER);
        play.setBackground(round(0xAA10141B, dp(34)));
        FrameLayout.LayoutParams playLp = new FrameLayout.LayoutParams(dp(68), dp(68), Gravity.CENTER);
        playerSurface.addView(play, playLp);
        play.setOnClickListener(v -> comingSoon("Video playback is coming soon. No stream is connected."));
        TextView soon = text("COMING SOON", 11, WHITE, true);
        soon.setGravity(Gravity.CENTER);
        soon.setLetterSpacing(0.16f);
        soon.setBackground(round(0xCC090B0F, dp(14)));
        FrameLayout.LayoutParams soonLp = new FrameLayout.LayoutParams(-2, dp(30), Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL);
        soonLp.bottomMargin = dp(14);
        soonLp.setMargins(dp(12), 0, dp(12), dp(14));
        playerSurface.addView(soon, soonLp);

        LinearLayout controls = new LinearLayout(this);
        controls.setGravity(Gravity.CENTER_VERTICAL);
        controls.setPadding(dp(18), dp(13), dp(18), dp(9));
        TextView progressTime = text("00:00", 11, SECONDARY, false);
        controls.addView(progressTime);
        View track = new View(this);
        track.setBackground(round(0xFF404651, dp(3)));
        LinearLayout.LayoutParams trackLp = new LinearLayout.LayoutParams(0, dp(3), 1);
        trackLp.setMargins(dp(10), 0, dp(10), 0);
        controls.addView(track, trackLp);
        controls.addView(text("--:--", 11, SECONDARY, false));
        page.addView(controls);

        TextView coming = text("Playback is not connected", 18, WHITE, true);
        coming.setPadding(dp(20), dp(18), dp(20), dp(4));
        page.addView(coming);
        TextView description = text("This preview includes the MovieBox player interface only. Streaming, subtitles and downloads are disabled.", 13, SECONDARY, false);
        description.setPadding(dp(20), dp(3), dp(20), dp(16));
        page.addView(description);
        LinearLayout tools = new LinearLayout(this);
        tools.setPadding(dp(16), 0, dp(16), 0);
        String[] toolLabels = {"Quality", "Subtitles", "Episode list"};
        for (String label : toolLabels) {
            TextView tool = text(label, 12, SECONDARY, false);
            tool.setGravity(Gravity.CENTER);
            tool.setBackground(round(SURFACE, dp(9)));
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(0, dp(42), 1);
            lp.setMargins(dp(4), 0, dp(4), 0);
            tools.addView(tool, lp);
            tool.setOnClickListener(v -> comingSoon(label + " controls are coming soon."));
        }
        page.addView(tools);
        page.addView(new View(this), new LinearLayout.LayoutParams(-1, 0, 1));
        TextView footer = text("MovieBox  •  Player preview", 11, MUTED, false);
        footer.setGravity(Gravity.CENTER);
        footer.setPadding(0, dp(12), 0, dp(20));
        page.addView(footer);
        show(page, false);
    }

    private void showShorts() {
        activeTab = "Home";
        ScrollView scroll = newScrollPage();
        LinearLayout content = verticalContent(scroll);
        addPageHeader(content, "Short TV", () -> showHome());
        TextView intro = text("Short-form stories, ready when you are", 13, SECONDARY, false);
        intro.setPadding(dp(18), 0, dp(18), dp(16));
        content.addView(intro);
        addCatalogSection(content, "Popular Series", "tv");
        addCatalogSection(content, "Trending Today", "trending");
        show(scroll, true);
    }

    private void showMyList() {
        activeTab = "Me";
        ScrollView scroll = newScrollPage();
        LinearLayout content = verticalContent(scroll);
        addPageHeader(content, "My List", () -> showHome());
        List<CatalogItem> items = readSavedItems();
        if (items.isEmpty()) {
            addEmptyState(content, "♡", "Your list is empty", "Save movies and series to keep them close.");
        } else {
            for (CatalogItem item : items) content.addView(createSearchResult(item));
        }
        show(scroll, true);
    }

    private void showDownloads() {
        activeTab = "Downloads";
        ScrollView scroll = newScrollPage();
        LinearLayout content = verticalContent(scroll);
        addPageHeader(content, "Downloads", () -> showHome());
        addEmptyState(content, "↓", "Coming soon", "Downloads are not connected in this front-end preview.");
        show(scroll, true);
    }

    private void showComingTab(String title) {
        activeTab = "NovelHub".equals(title) ? "NovelHub" : "Fight Zone".equals(title) ? "Fight Zone" : "Home";
        ScrollView scroll = newScrollPage();
        LinearLayout content = verticalContent(scroll);
        addPageHeader(content, title, () -> showHome());
        addEmptyState(content, "✦", "Coming soon", title + " is shown as a front-end placeholder in this preview.");
        show(scroll, true);
    }

    private void showProfile() {
        activeTab = "Me";
        ScrollView scroll = newScrollPage();
        LinearLayout content = verticalContent(scroll);
        addPageHeader(content, "Me", () -> showHome());
        LinearLayout profile = new LinearLayout(this);
        profile.setGravity(Gravity.CENTER_VERTICAL);
        profile.setPadding(dp(18), dp(14), dp(18), dp(18));
        TextView avatar = text("M", 23, WHITE, true);
        avatar.setGravity(Gravity.CENTER);
        avatar.setBackground(roundGradient(dp(30)));
        profile.addView(avatar, new LinearLayout.LayoutParams(dp(60), dp(60)));
        LinearLayout names = new LinearLayout(this);
        names.setOrientation(LinearLayout.VERTICAL);
        names.setPadding(dp(13), 0, 0, 0);
        names.addView(text("MovieBox guest", 17, WHITE, true));
        names.addView(text("Sign in and profile features are coming soon", 11, SECONDARY, false));
        profile.addView(names, new LinearLayout.LayoutParams(0, -2, 1));
        TextView arrow = text("›", 28, SECONDARY, false);
        profile.addView(arrow);
        profile.setBackground(round(SURFACE, dp(14)));
        LinearLayout.LayoutParams profileLp = new LinearLayout.LayoutParams(-1, -2);
        profileLp.setMargins(dp(16), dp(8), dp(16), dp(18));
        content.addView(profile, profileLp);

        addProfileOption(content, "♡", "My List", "Saved movies and series", () -> showMyList());
        addProfileOption(content, "◷", "Watch history", "Coming soon", () -> comingSoon("Watch history is coming soon."));
        addProfileOption(content, "⚙", "Settings", "Playback and app preferences", () -> comingSoon("Settings are coming soon."));
        addProfileOption(content, "ⓘ", "About MovieBox", "Catalogue preview", () -> new AlertDialog.Builder(this)
                .setTitle("MovieBox front-end preview")
                .setMessage(getString(R.string.tmdb_attribution) + "\n\nPlayback and downloads are not connected.")
                .setPositiveButton("OK", null).show());
        TextView attribution = text(getString(R.string.tmdb_attribution), 10, MUTED, false);
        attribution.setGravity(Gravity.CENTER);
        attribution.setPadding(dp(24), dp(22), dp(24), dp(20));
        content.addView(attribution);
        show(scroll, true);
    }

    private void addProfileOption(LinearLayout content, String icon, String title, String subtitle, Runnable action) {
        LinearLayout row = new LinearLayout(this);
        row.setGravity(Gravity.CENTER_VERTICAL);
        row.setPadding(dp(17), dp(13), dp(16), dp(13));
        TextView glyph = text(icon, 20, GREEN, true);
        glyph.setGravity(Gravity.CENTER);
        row.addView(glyph, new LinearLayout.LayoutParams(dp(35), dp(38)));
        LinearLayout copy = new LinearLayout(this);
        copy.setOrientation(LinearLayout.VERTICAL);
        copy.setPadding(dp(10), 0, 0, 0);
        copy.addView(text(title, 14, WHITE, true));
        copy.addView(text(subtitle, 11, MUTED, false));
        row.addView(copy, new LinearLayout.LayoutParams(0, -2, 1));
        row.addView(text("›", 24, MUTED, false));
        row.setOnClickListener(v -> action.run());
        content.addView(row);
        View divider = new View(this);
        divider.setBackgroundColor(0xFF20242C);
        LinearLayout.LayoutParams dividerLp = new LinearLayout.LayoutParams(-1, dp(1));
        dividerLp.setMargins(dp(18), 0, dp(18), 0);
        content.addView(divider, dividerLp);
    }

    private void addPageHeader(LinearLayout content, String title, Runnable backAction) {
        LinearLayout header = new LinearLayout(this);
        header.setGravity(Gravity.CENTER_VERTICAL);
        header.setPadding(dp(14), dp(12), dp(18), dp(12));
        TextView back = text("‹", 32, WHITE, false);
        back.setGravity(Gravity.CENTER);
        header.addView(back, new LinearLayout.LayoutParams(dp(42), dp(44)));
        back.setOnClickListener(v -> backAction.run());
        TextView heading = text(title, 21, WHITE, true);
        header.addView(heading, new LinearLayout.LayoutParams(0, -2, 1));
        content.addView(header);
    }

    private void addEmptyState(LinearLayout content, String glyph, String title, String message) {
        LinearLayout empty = new LinearLayout(this);
        empty.setOrientation(LinearLayout.VERTICAL);
        empty.setGravity(Gravity.CENTER);
        empty.setPadding(dp(26), dp(70), dp(26), dp(80));
        TextView icon = text(glyph, 48, GREEN, false);
        icon.setGravity(Gravity.CENTER);
        empty.addView(icon);
        TextView heading = text(title, 19, WHITE, true);
        heading.setGravity(Gravity.CENTER);
        LinearLayout.LayoutParams headingLp = new LinearLayout.LayoutParams(-1, -2);
        headingLp.topMargin = dp(16);
        empty.addView(heading, headingLp);
        TextView body = text(message, 13, SECONDARY, false);
        body.setGravity(Gravity.CENTER);
        body.setLineSpacing(dp(3), 1f);
        LinearLayout.LayoutParams bodyLp = new LinearLayout.LayoutParams(-1, -2);
        bodyLp.topMargin = dp(8);
        empty.addView(body, bodyLp);
        content.addView(empty, new LinearLayout.LayoutParams(-1, -2));
    }

    private void toggleSaved(CatalogItem item) {
        JSONArray saved = new JSONArray();
        List<CatalogItem> items = readSavedItems();
        boolean removed = false;
        for (CatalogItem current : items) {
            if (current.id == item.id && current.mediaType.equals(item.mediaType)) {
                removed = true;
                continue;
            }
            saved.put(current.toJson());
        }
        if (!removed) saved.put(item.toJson());
        getSharedPreferences(PREFS, MODE_PRIVATE).edit().putString(WATCHLIST, saved.toString()).apply();
    }

    private boolean isSaved(CatalogItem item) {
        for (CatalogItem current : readSavedItems()) {
            if (current.id == item.id && current.mediaType.equals(item.mediaType)) return true;
        }
        return false;
    }

    private List<CatalogItem> readSavedItems() {
        List<CatalogItem> items = new ArrayList<>();
        String raw = getSharedPreferences(PREFS, MODE_PRIVATE).getString(WATCHLIST, "[]");
        try {
            JSONArray array = new JSONArray(raw);
            for (int i = 0; i < array.length(); i++) {
                JSONObject item = array.optJSONObject(i);
                if (item != null) items.add(CatalogItem.fromJson(item, "movie"));
            }
        } catch (Exception ignored) { }
        return items;
    }

    private void comingSoon(String message) {
        new AlertDialog.Builder(this)
                .setTitle(getString(R.string.coming_soon))
                .setMessage(message)
                .setPositiveButton("OK", null)
                .show();
    }

    private TextView actionButton(String label, boolean primary) {
        TextView view = text(label, 14, primary ? BG : WHITE, true);
        view.setGravity(Gravity.CENTER);
        view.setBackground(primary ? roundGradient(dp(10)) : round(SURFACE_RAISED, dp(10)));
        view.setClickable(true);
        view.setFocusable(true);
        return view;
    }

    private TextView text(String value, float size, int color, boolean bold) {
        TextView view = new TextView(this);
        view.setText(value);
        view.setTextSize(size);
        view.setTextColor(color);
        view.setTypeface(Typeface.create("sans-serif", bold ? Typeface.BOLD : Typeface.NORMAL));
        view.setIncludeFontPadding(true);
        return view;
    }

    private GradientDrawable round(int color, int radius) {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setColor(color);
        drawable.setCornerRadius(radius);
        return drawable;
    }

    private GradientDrawable roundGradient(int radius) {
        GradientDrawable drawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{BLUE, GREEN});
        drawable.setCornerRadius(radius);
        return drawable;
    }

    private void addGap(LinearLayout layout, int heightDp) {
        layout.addView(new View(this), new LinearLayout.LayoutParams(1, dp(heightDp)));
    }

    private int dp(float value) {
        return Math.round(value * getResources().getDisplayMetrics().density);
    }

    @Override public void onBackPressed() {
        if (bottomBar.getVisibility() != View.VISIBLE || !"Home".equals(activeTab)) {
            showHome();
            return;
        }
        super.onBackPressed();
    }
}
