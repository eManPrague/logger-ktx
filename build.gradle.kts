import org.gradle.kotlin.dsl.repositories

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Dependencies.BuildPlugins.androidGradle)
        // Kotlin Grade plugin
        classpath(Dependencies.BuildPlugins.kotlin)
        // Build Tool to generate Kotlin KDoc documentation
        classpath(Dependencies.BuildPlugins.dokka)
        classpath(Dependencies.BuildPlugins.mavenPublish)
        classpath(Dependencies.BuildPlugins.androidMavenGradle)
        classpath(Dependencies.BuildPlugins.bintrayGradle)
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

/*task wrapper(type: Wrapper) {
    gradleVersion versions.gradle
    //noinspection UnnecessaryQualifiedReference
    distributionType Wrapper.DistributionType.ALL
}*/

tasks.create<Delete>("clean") {
    delete(rootProject.buildDir)
}

