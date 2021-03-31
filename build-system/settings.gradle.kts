rootProject.name = "build-system"

dependencyResolutionManagement {
    versionCatalogs {
        create("gradleBuild") {
            version("android-plugin", "7.0.0-alpha12")
            version("kotlin-plugin", "1.4.30")
            alias("agp").to("com.android.tools.build", "gradle").versionRef("android-plugin")
            alias("ktgp").to("org.jetbrains.kotlin", "kotlin-gradle-plugin").versionRef("kotlin-plugin")
        }
    }
}

include(":android-convention")
include(":kotlin-convention")
