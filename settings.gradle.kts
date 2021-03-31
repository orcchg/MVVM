rootProject.name = "MVVM"

pluginManagement {
    repositories {
        google()
        mavenCentral()
    }

    resolutionStrategy {
        eachPlugin {
            val pluginId = requested.id.id

            if (pluginId.startsWith("org.jetbrains.kotlin")) {
                useVersion("1.4.30")
            } else if (pluginId.startsWith("com.android.")) {
                useModule("com.android.tools.build:gradle:7.0.0-alpha12")
            } else if (pluginId.startsWith("com.diffplug.spotless")) {
                useVersion("5.7.0")
            }
        }
    }
}

// https://docs.gradle.org/7.0-milestone-1/userguide/platforms.html
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        jcenter()
    }

    versionCatalogs {
        create("androidx") {
            version("annotation", "1.1.0")
            version("appcompat", "1.2.0")
            version("core-ktx", "1.3.2")
            version("lifecycle-ktx", "2.3.0")
            version("material", "1.3.0")
            alias("annotation").to("androidx.annotation", "annotation").versionRef("annotation")
            alias("appcompat").to("androidx.appcompat", "appcompat").versionRef("appcompat")
            alias("core-ktx").to("androidx.core", "core-ktx").versionRef("core-ktx")
            alias("lifecycle-livedata").to("androidx.lifecycle", "lifecycle-livedata-ktx").versionRef("lifecycle-ktx")
            alias("lifecycle-runtime").to("androidx.lifecycle", "lifecycle-runtime-ktx").versionRef("lifecycle-ktx")
            alias("material").to("com.google.android.material", "material").versionRef("material")
            bundle("androidx",
                listOf(
                    "annotation",
                    "appcompat",
                    "core-ktx",
                    "lifecycle-livedata",
                    "lifecycle-runtime",
                    "material"
                )
            )
        }
        create("di") {
            version("dagger", "2.32")
            alias("dagger").to("com.google.dagger", "dagger").versionRef("dagger")
            alias("daggerCompiler").to("com.google.dagger", "dagger-compiler").versionRef("dagger")
        }
        create("libs") {
            version("coroutines", "1.4.2")
            version("glide", "4.11.0")
            version("kotlin", "1.4.30")
            version("timber", "4.7.1")
            alias("coroutines-core").to("org.jetbrains.kotlinx", "kotlinx-coroutines-core").versionRef("coroutines")
            alias("coroutines-android").to("org.jetbrains.kotlinx", "kotlinx-coroutines-android").versionRef("coroutines")
            alias("glide").to("com.github.bumptech.glide", "glide").versionRef("glide")
            alias("kotlin").to("org.jetbrains.kotlin", "kotlin-stdlib").versionRef("kotlin")
            alias("timber").to("com.jakewharton.timber", "timber").versionRef("timber")
            bundle("coroutines", listOf("coroutines-core", "coroutines-android"))
        }
        create("network") {
            version("okhttp", "4.9.1")
            version("retrofit", "2.9.0")
            alias("okhttp").to("com.squareup.okhttp3", "okhttp").versionRef("okhttp")
            alias("okhttpLog").to("com.squareup.okhttp3", "logging-interceptor").versionRef("okhttp")
            alias("retrofit").to("com.squareup.retrofit2", "retrofit").versionRef("retrofit")
            alias("retrofitMoshi").to("com.squareup.retrofit2", "converter-moshi").versionRef("retrofit")
            bundle("okhttp", listOf("okhttp", "okhttpLog"))
            bundle("retrofit", listOf("retrofit", "retrofitMoshi"))
        }
        create("parser") {
            version("moshi", "1.9.3")
            alias("moshi-adapters").to("com.squareup.moshi", "moshi-adapters").versionRef("moshi")
            alias("moshi-kotlin").to("com.squareup.moshi", "moshi-kotlin").versionRef("moshi")
            alias("moshi-kotlinCodegen").to("com.squareup.moshi", "moshi-kotlin-codegen").versionRef("moshi")
            bundle("moshi", listOf("moshi-adapters", "moshi-kotlin"))
        }
        create("lint") {
            version("lint", "27.0.1")
            alias("lint-api").to("com.android.tools.lint", "lint-api").versionRef("lint")
            alias("lint-checks").to("com.android.tools.lint", "lint-checks").versionRef("lint")
            alias("lint-core").to("com.android.tools.lint", "lint").versionRef("lint")
            alias("lint-tests").to("com.android.tools.lint", "lint-tests").versionRef("lint")
            bundle("lint", listOf("lint-api", "lint-checks", "lint-core"))
        }
        create("view") {
            version("accompanist", "0.6.1")
            version("compose", "1.0.0-beta01")
            version("compose-activity", "1.3.0-alpha03")
            version("compose-navigation", "1.0.0-alpha0")
            alias("accompanist-coil").to("dev.chrisbanes.accompanist", "accompanist-coil").versionRef("accompanist")
            alias("compose-activity").to("androidx.activity", "activity-compose").versionRef("compose-activity")
            alias("compose-material").to("androidx.compose.material", "material").versionRef("compose")
            alias("compose-materialIcons").to("androidx.compose.material", "material-icons-extended").versionRef("compose")
            alias("compose-nav").to("androidx.navigation", "navigation-compose").versionRef("compose-navigation")
            alias("compose-runtime").to("androidx.compose.runtime", "runtime-livedata").versionRef("compose")
            alias("compose-ui").to("androidx.compose.ui", "ui").versionRef("compose")
            alias("compose-uiTools").to("androidx.compose.ui", "ui-tooling").versionRef("compose")
            alias("compose-tests").to("androidx.compose.ui", "ui-test-junit4").versionRef("compose")
            bundle("compose",
                listOf(
                    "compose-activity",
                    "compose-material",
                    "compose-materialIcons",
                    "compose-nav",
                    "compose-runtime",
                    "compose-ui",
                    "compose-uiTools"
                )
            )
        }
        create("test") {
            version("junit", "4.13")
            alias("junit").to("junit", "junit").versionRef("junit")
        }
        create("androidTest") {
            version("espresso", "3.2.0")
            version("junit", "1.1.1")
            alias("junit").to("androidx.test.ext", "junit").versionRef("junit")
            alias("espresso").to("androidx.test.espresso", "espresso-core").versionRef("espresso")
        }
    }
}

includeBuild("build-system")

include(":app")
include(":design")
include(":core:di_core_lib")
include(":core:network:api")
include(":core:network:impl")
include(":lint-rules")
include(":utility:android")
include(":utility:pure")
include(":feature:github_repo:api")
include(":feature:github_repo:impl")
include(":feature:github_repo:fake")
include(":feature:github_repo:ui")
include(":feature:github_repo:demo")
include(":feature:github_user_details:api")
include(":feature:github_user_details:fake")
include(":feature:github_user_details:impl")
include(":feature:github_user_details:ui")
include(":feature:github_user_details:demo")
include(":feature:github_user_followers:api")
include(":feature:github_user_followers:fake")
include(":feature:github_user_followers:impl")
include(":feature:github_user_followers:ui")
include(":feature:github_user_followers:demo")
include(":feature:github_user_gists:api")
include(":feature:github_user_gists:fake")
include(":feature:github_user_gists:impl")
include(":feature:github_user_gists:ui")
include(":feature:github_user_gists:demo")
include(":feature:github_user_list:api")
include(":feature:github_user_list:fake")
include(":feature:github_user_list:impl")
include(":feature:github_user_list:ui")
include(":feature:github_user_list:demo")
include(":feature:github_user_organizations:api")
include(":feature:github_user_organizations:fake")
include(":feature:github_user_organizations:impl")
include(":feature:github_user_organizations:ui")
include(":feature:github_user_organizations:demo")
include(":feature:github_user_profile:api")
include(":feature:github_user_profile:impl")
include(":feature:github_user_profile:fake")
include(":feature:github_user_profile:ui")
include(":feature:github_user_profile:demo")
