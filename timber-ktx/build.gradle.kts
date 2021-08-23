plugins {
    id("com.android.library")
    kotlin("android")
    id("org.jetbrains.dokka")
    id("maven-publish")
}

android {
    compileSdkVersion(Dependencies.Android.compileSdk)

    defaultConfig {
        minSdkVersion(Dependencies.Android.minSdk)
        targetSdkVersion(Dependencies.Android.targetSdk)

        versionCode = Dependencies.Android.versionCode
        versionName = "${project.version}"

        testInstrumentationRunner = Dependencies.Android.testInstrumentRunner

    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
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
    // Kotlin
    implementation(Dependencies.Kotlin.kotlinStbLib)

    // Timber
    api(Dependencies.Libs.timber)
    compileOnly(Dependencies.Libs.koin) {
        exclude(group = "org.jetbrains.kotlin")
    }

    // Tests
    testImplementation(Dependencies.TestLibs.junit)
}

group = "${project.property("groupId")}"
version = "${project.version}"

val dokka by tasks.dokkaHtml
val dokkaHtmlJar by tasks.creating(Jar::class) {
    archiveClassifier.set("kdoc-html")
    from(dokka.outputDirectory)
    dependsOn(dokka)
}

val sourcesJar by tasks.creating(Jar::class) {
    archiveClassifier.set("sources")
    from(android.sourceSets["main"].java.srcDirs)
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("release") {
                from(components["release"])
                artifact(dokkaHtmlJar)
                artifact(sourcesJar)
            }
        }

        repositories {
            maven(url = "https://nexus.eman.cz/repository/maven-public") {
                name = "Nexus"

                credentials {
                    username = getPropertyOrNull("nexus.username")
                    password = getPropertyOrNull("nexus.password")
                }
            }
        }
    }
}
