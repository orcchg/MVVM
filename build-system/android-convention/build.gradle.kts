plugins {
    `kotlin-dsl`
}

group = "com.orcchg.boilerplate.mvvm"

repositories {
    google()
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(gradleBuild.android.plugin)
    implementation(gradleBuild.kotlin.plugin)
    implementation("com.orcchg.boilerplate.mvvm:kotlin-convention")
}
