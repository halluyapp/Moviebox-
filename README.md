# MovieBox UI / Frontend Extraction

This archive was extracted from the user-provided APK `MovieBoxv3.0.16.0616.03[PR3MIUM].apk`. It is a frontend/UI-oriented recovery, not a clean original Android Studio project.

## Included

- `android-res/`: decoded Android resources, including XML layouts, themes, colors, dimensions, fonts, icons, posters/placeholders, drawables, animations, and player UI resources.
- `android-assets/`: selected interaction assets and UI bridge scripts.
- `source/`: best-effort JADX Java reconstruction of app-owned presentation modules: Home, Movie Detail, Search, User Center/Profile, Rooms, Posts, Short Video, UGC/Video Detail, Player, Subtitle, Member, Downloads/Transfer, Publish, Share, and related UI support.
- `smali-app/`: app-owned low-level fallback for classes that JADX could not reconstruct cleanly.
- `AndroidManifest.xml`: decoded application manifest for screen/activity wiring reference.

## Intentionally excluded

The archive does not include APK binaries, DEX files, native `.so` libraries, vendor SDK source, cryptographic keys/licenses, offline mini-app/media bundles, ad/network SDK payloads, analytics/telemetry data, or movie/catalog/user data.

## Important limitations

Decompilation is inherently best-effort. The recovered Java is not guaranteed to compile as-is: Kotlin/Compose-generated code, obfuscation, missing external dependencies, and decompiler errors remain. The XML/image/font resources are the most faithful part of this extraction. The package still references original app libraries and resource IDs; use it as a UI reference/source base rather than a drop-in build.

## Approximate contents

- Layout XML files: 1672
- Drawable/mipmap UI resources: 2278
- Font files: 5
- App-owned reconstructed source files: 3370
- App-owned Smali files: 6163


## Runnable Android front-end preview

A separate clean app module now lives under `app/`. It uses the recovered MovieBox palette and launcher mark as references, and provides a buildable catalogue UI with Home/discovery, TMDB-powered search/details, a local My List, profile/navigation surfaces, and a player shell. Playback, subtitles and downloads are intentionally unconnected and display “Coming soon.” The original recovered `source/`, `smali-app/`, and `android-res/` trees remain in place as reference material; they are not compiled directly because the extraction has no Gradle project or its original dependencies.

### TMDB and builds

At the user's request, the supplied TMDB v3 API key is embedded in `app/build.gradle.kts` and injected into the debug app at build time. It is therefore visible in the public Git history and extractable from the APK; making the repository private later will not erase existing public copies. The optional read access token is not embedded by default. If needed, set `TMDB_ACCESS_TOKEN` as a GitHub Actions secret or local environment variable. A real `.env` file should not be committed.

The `.github/workflows/android.yml` workflow uses JDK 17, Android SDK 35, AGP 8.7.3 and Gradle 8.9. It builds `:app:assembleDebug` on pushes to `main` and manual runs, and uploads `moviebox-frontend-debug` for 14 days. The APK is at `app/build/outputs/apk/debug/app-debug.apk` in the build workspace.
