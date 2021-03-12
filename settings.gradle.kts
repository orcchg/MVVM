rootProject.name = "MVVM"

pluginManagement {
    repositories {
        google()
        jcenter()
    }

    resolutionStrategy {
        eachPlugin {
            val pluginId = requested.id.id

            if (pluginId.startsWith("org.jetbrains.kotlin")) {
                useVersion("1.4.30")
            } else if (pluginId.startsWith("com.android.")) {
                useModule("com.android.tools.build:gradle:7.0.0-alpha08")
            } else if (pluginId.startsWith("com.diffplug.spotless")) {
                useVersion("5.7.0")
            }
        }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        jcenter() // Warning: this repository is going to shut down soon
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
