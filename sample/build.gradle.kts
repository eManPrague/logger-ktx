plugins {
    id("com.android.application")
    kotlin("android")
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
        targetCompatibility = Dependencies.Android.targetCompatibilityJava
    }
}

dependencies {
    implementation(project(":timber-ktx"))

    implementation(Dependencies.Kotlin.standardLibrary)
    implementation(Dependencies.Libs.appCompat)
    implementation(Dependencies.Libs.constraintLayout)

    testImplementation(Dependencies.TestLibs.junit)
}
