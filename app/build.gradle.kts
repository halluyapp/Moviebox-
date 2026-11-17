plugins {
    id("com.android.application")
}

fun String.asBuildConfigLiteral(): String =
    "\"" + replace("\\", "\\\\")
        .replace("\"", "\\\"")
        .replace("\n", "")
        .replace("\r", "") + "\""

val tmdbApiKey = System.getenv("TMDB_API_KEY")?.takeIf { it.isNotBlank() } ?: "ac21f10c473ba76edcd8983b1ae2eb89"
val tmdbAccessToken = System.getenv("TMDB_ACCESS_TOKEN")?.takeIf { it.isNotBlank() } ?: ""

android {
    namespace = "com.moviebox.frontend"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.moviebox.frontend"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "0.1.0"

        buildConfigField("String", "TMDB_API_KEY", tmdbApiKey.asBuildConfigLiteral())
        buildConfigField("String", "TMDB_ACCESS_TOKEN", tmdbAccessToken.asBuildConfigLiteral())
    }

    buildFeatures {
        buildConfig = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
