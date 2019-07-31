import org.gradle.api.JavaVersion

object Dependencies {

    object Versions {
        const val supportLib = "1.0.0"
        const val constraintlayout = "1.1.2"

        const val kotlin = "1.3.21"
        const val dokka = "0.9.17"

        const val gradle = "5.2.1"
        const val gradleBuildTools = "3.3.1"
        const val mavenPublish = "3.6.2"

        const val timber = "4.7.1"
        const val junit = "4.12"
        const val kotlinTest = "3.3.0"
        const val mavenGradleGithub = "1.5"
        const val bintrayGradle = "1.8.4"
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
        const val mavenPublish = "digital.wup:android-maven-publish:${Versions.mavenPublish}"
        const val androidMavenGradle = "com.github.dcendents:android-maven-gradle-plugin:${Versions.mavenGradleGithub}"
        const val bintrayGradle = "com.jfrog.bintray.gradle:gradle-bintray-plugin:${Versions.bintrayGradle}"
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
    }

    /* =============================  TEST-LIBS =========================== */

    object TestLibs {
        const val junit = "junit:junit:${Versions.junit}"
        const val kotlinTest = "io.kotlintest:kotlintest-runner-junit5:${Versions.kotlinTest}"
    }
}
