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
