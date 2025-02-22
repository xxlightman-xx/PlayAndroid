// Top-level build file where you can add configuration options common to all sub-projects/modules.
ext {
    extra["versionCode"] = 37
    extra["versionName"] = "5.1.5"

    extra["sdkVersion"] = 34
    extra["minSdkVersion"] = 24

    extra["hiltVersion"] = "2.48.1"

    extra["testInstrumentationRunner"] = "androidx.test.runner.AndroidJUnitRunner"
    extra["consumerProguardFiles"] = "consumer-rules.pro"

    extra["javaVersion"] = JavaVersion.VERSION_17

    extra["coreKtx"] = "androidx.core:core-ktx:1.13.0-alpha01"
    extra["appcompat"] = "androidx.appcompat:appcompat:1.6.1"
    extra["kotlinVersion"] = "org.jetbrains.kotlin:kotlin-stdlib:1.9.20"
    extra["junit"] = "junit:junit:4.13.2"
    extra["extJunit"] = "androidx.test.ext:junit:1.1.5"
    extra["espressoCore"] = "androidx.test.espresso:espresso-core:3.5.1"
}

plugins {
    id("com.android.application") version "8.1.1" apply false
    id("com.android.library") version "8.1.1" apply false
    kotlin("android") version "1.9.20" apply false
    id("com.google.devtools.ksp") version "1.9.20-1.0.14" apply false
    id("com.google.dagger.hilt.android") version "2.48.1" apply false
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildFile)
}