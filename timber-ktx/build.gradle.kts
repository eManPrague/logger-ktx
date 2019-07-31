import com.jfrog.bintray.gradle.BintrayExtension
import org.jetbrains.dokka.gradle.DokkaTask

plugins {
    id("com.android.library")
    kotlin("android")
    id("org.jetbrains.dokka")
    id("digital.wup.android-maven-publish")
    id("com.github.dcendents.android-maven")
    id("com.jfrog.bintray")
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

fun findProperty(s: String) = project.findProperty(s) as String?

group = "${project.property("groupId")}"
version = "${project.version}"

val productionPublicName = "production"

bintray {
    user = findProperty("bintray.user")
    key = findProperty("bintray.apikey")
    publish = true
    setPublications(productionPublicName)
    pkg(delegateClosureOf<BintrayExtension.PackageConfig> {
        repo = "maven"
        name = "timber-ktx"
        userOrg = "emanprague"
        override = true
        websiteUrl = "https://www.emanprague.com/en/"
        githubRepo = "eManPrague/logger-ktx"
        vcsUrl = "https://github.com/eManPrague/logger-ktx"
        description = "Simple Logger Extensions written in Kotlin"
        setLabels("kotlin", "logger", "ktx", "android", "timber")
        setLicenses("MIT")
        desc = description
    })
}

/**
 *  Publish to nexus repo
 */
publishing {
    publications {
        register(productionPublicName, MavenPublication::class) {
            from(components["android"])
            groupId = "${project.property("groupId")}"
            artifactId = "timber-ktx"
            version = "${project.version}"
        }
    }

    repositories {
        maven(url = "http://dl.bintray.com/emanprague/maven")
    }
}

val dokka by tasks.getting(DokkaTask::class) {
    moduleName = "timber-ktx"
    outputFormat = "html" // html, md, javadoc,
    outputDirectory = "$buildDir/dokka/html"
    sourceDirs = files("src/main/kotlin")
}

val dokkaJavadoc = tasks.create<DokkaTask>("dokkaJavadoc") {
    outputFormat = "javadoc"
    outputDirectory = "$buildDir/dokka/javadoc"
    //processConfigurations = ["compile"]
    sourceDirs = files("src/main/kotlin")
    dependsOn(dokka)
}

tasks {


    val androidSourcesJar by creating(Jar::class) {
        archiveClassifier.set("sources")
        from(android.sourceSets["main"].java.srcDirs)
    }

    val androidDokkaHtmlJar by creating(Jar::class) {
        archiveClassifier.set("kdoc-html")
        from("$buildDir/dokka/html")
        dependsOn(dokka)
    }

    val androidDokkaJavadocJar by creating(Jar::class) {
        archiveClassifier.set("kdoc-javadoc")
        from("$buildDir/dokka/javadocs")
        dependsOn(dokkaJavadoc)
    }

    artifacts {
        add("archives", androidSourcesJar)
        add("archives", androidDokkaHtmlJar)
        add("archives", androidDokkaJavadocJar)
    }
}
