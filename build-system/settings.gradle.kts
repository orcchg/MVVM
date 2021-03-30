rootProject.name = "build-system"

include("android-convention")
include("kotlin-convention")

dependencyResolutionManagement {
    versionCatalogs {
        create("gradleBuild") {
            version("android-plugin", "7.0.0-alpha12")
            version("kotlin-plugin", "1.4.31")
            alias("android-plugin").to("com.android.tools.build", "gradle").versionRef("android-plugin")
            alias("kotlin-plugin").to("org.jetbrains.kotlin", "kotlin-gradle-plugin").versionRef("kotlin-plugin")
        }
    }
}
