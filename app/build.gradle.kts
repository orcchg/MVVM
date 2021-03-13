plugins {
    id("convention.android-app")
}

android {
    defaultConfig {
        applicationId = "com.orcchg.boilerplate.mvvm"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.0.0-beta01"
    }
//    dynamicFeatures = mutableSetOf(
//        ":feature:github_repo:github_repo:ui",
//        ":feature:github_user_details:github_user_details:ui",
//        ":feature:github_user_followers:github_user_followers:ui",
//        ":feature:github_user_gists:github_user_gists:ui",
//        ":feature:github_user_list:github_user_list:ui",
//        ":feature:github_user_organizations:github_user_organizations:ui",
//        ":feature:github_user_profile:github_user_profile:ui"
//    )
}

dependencies {
    val compose_version = "1.0.0-beta01"

    implementation("androidx.core:core-ktx:1.3.2")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("com.google.android.material:material:1.3.0")
    implementation("androidx.compose.ui:ui:$compose_version")
    implementation("androidx.compose.material:material:$compose_version")
    implementation("androidx.compose.ui:ui-tooling:$compose_version")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.0")
    implementation("androidx.activity:activity-compose:1.3.0-alpha04")
    testImplementation("junit:junit:4.+")
    androidTestImplementation("androidx.test.ext:junit:1.1.2")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
}