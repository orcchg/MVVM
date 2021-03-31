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
    implementation(gradleBuild.agp)
    implementation(gradleBuild.ktgp)
    implementation("com.orcchg.boilerplate.mvvm:kotlin-convention")
}
