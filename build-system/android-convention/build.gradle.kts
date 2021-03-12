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
    implementation("com.android.tools.build:gradle:7.0.0-alpha08")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.30")
    implementation("com.orcchg.boilerplate.mvvm:kotlin-convention")
}
