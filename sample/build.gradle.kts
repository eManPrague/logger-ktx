plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(Dependencies.Android.compileSdk)

    defaultConfig {
        applicationId = Dependencies.Android.applicationId

        minSdkVersion(Dependencies.Android.minSdk)
        targetSdkVersion(Dependencies.Android.targetSdk)

        versionCode = Dependencies.Android.versionCode
        versionName = "${project.version}"

        testInstrumentationRunner = Dependencies.Android.testInstrumentRunner
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
        }
    }

    sourceSets {
        getByName("main").java.srcDirs("src/main/kotlin")
        getByName("test").java.srcDirs("src/test/kotlin")
    }

    compileOptions {
        sourceCompatibility = Dependencies.Android.sourceCompatibilityJava
        setTargetCompatibility(Dependencies.Android.targetCompatibilityJava)
    }
}

dependencies {
    implementation(project(":timber-ktx"))

    // Support Libraries
    implementation(Dependencies.Libs.appCompat)

    // Kotlin
    implementation(Dependencies.Kotlin.kotlinStbLib)

    // Tests
    implementation(Dependencies.Libs.constraintlayout)
    testImplementation(Dependencies.TestLibs.junit)
}
