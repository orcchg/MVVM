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
    implementation(gradleBuild.kotlin.plugin)
}
