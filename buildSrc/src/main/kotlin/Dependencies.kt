import org.gradle.api.JavaVersion
import kotlin.String

object Dependencies {

    object Versions {

        val supportLib = "1.0.0"
        val constraintlayout = "1.1.2"

        val kotlin = "1.3.21"
        val dokka = "0.9.17"

        val gradle = "5.2.1"
        val gradleBuildTools = "3.3.1"
        val mavenPublish = "3.6.2"

        val timber = "4.7.1"
        val junit = "4.12"
        val kotlinTest = "3.3.0"
        val mavenGradleGithub = "1.5"
        val bintrayGradle = "1.8.4"
    }

    /* =============================  ANDROID ============================= */

    object Android {
        val applicationId = "cz.eman.logger.sample"

        val minSdk = 21
        val targetSdk = 28
        val compileSdk = 28

        val versionCode = 1

        val testInstrumentRunner = "android.support.test.runner.AndroidJUnitRunner"
        val sourceCompatibilityJava = JavaVersion.VERSION_1_8
        val targetCompatibilityJava = JavaVersion.VERSION_1_8
    }

    /* =============================  BUILD-PLUGINS ======================= */

    object BuildPlugins {
        val encoding = "UTF-8"
        val gradle = Versions.gradle

        val androidGradle = "com.android.tools.build:gradle:${Versions.gradleBuildTools}"
        val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        val dokka = "org.jetbrains.dokka:dokka-gradle-plugin:${Versions.dokka}"
        val mavenPublish = "digital.wup:android-maven-publish:${Versions.mavenPublish}"
        val androidMavenGradle = "com.github.dcendents:android-maven-gradle-plugin:${Versions.mavenGradleGithub}"
        val bintrayGradle = "com.jfrog.bintray.gradle:gradle-bintray-plugin:${Versions.bintrayGradle}"
    }

    /* =============================  KOTLIN ============================== */

    object Kotlin {
        val kotlinStbLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    }

    /* =============================  LIBS ================================ */

    object Libs {
        val appCompat = "androidx.appcompat:appcompat:${Versions.supportLib}"
        val constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
        val timber = "com.jakewharton.timber:timber:${Versions.timber}"
    }

    /* =============================  TEST-LIBS =========================== */

    object TestLibs {
        val junit = "junit:junit:${Versions.junit}"
        val kotlinTest = "io.kotlintest:kotlintest-runner-junit5:${Versions.kotlinTest}"
    }
}