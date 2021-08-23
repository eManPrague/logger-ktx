import org.gradle.api.JavaVersion

object Dependencies {

    object Versions {
        const val supportLib = "1.0.0"
        const val constraintlayout = "1.1.2"

        const val kotlin = "1.3.72"
        const val dokka = "1.5.0"

        const val gradle = "6.2.2"
        const val gradleBuildTools = "3.6.2"

        const val timber = "4.7.1"
        const val koin = "2.0.1"

        const val junit = "4.12"
        const val kotlinTest = "3.3.0"
    }

    /* =============================  ANDROID ============================= */

    object Android {
        const val applicationId = "cz.eman.logger.sample"

        const val minSdk = 21
        const val targetSdk = 28
        const val compileSdk = 28

        const val versionCode = 1

        const val testInstrumentRunner = "android.support.test.runner.AndroidJUnitRunner"
        val sourceCompatibilityJava = JavaVersion.VERSION_1_8
        val targetCompatibilityJava = JavaVersion.VERSION_1_8
    }

    /* =============================  BUILD-PLUGINS ======================= */

    object BuildPlugins {
        const val encoding = "UTF-8"
        const val gradle = Versions.gradle

        const val androidGradle = "com.android.tools.build:gradle:${Versions.gradleBuildTools}"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        const val dokka = "org.jetbrains.dokka:dokka-gradle-plugin:${Versions.dokka}"
    }

    /* =============================  KOTLIN ============================== */

    object Kotlin {
        const val kotlinStbLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    }

    /* =============================  LIBS ================================ */

    object Libs {
        const val appCompat = "androidx.appcompat:appcompat:${Versions.supportLib}"
        const val constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
        const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
        const val koin = "io.insert-koin:koin-core:${Versions.koin}"
    }

    /* =============================  TEST-LIBS =========================== */

    object TestLibs {
        const val junit = "junit:junit:${Versions.junit}"
        const val kotlinTest = "io.kotlintest:kotlintest-runner-junit5:${Versions.kotlinTest}"
    }
}
