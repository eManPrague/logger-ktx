applyProperties("local.properties")

buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(Dependencies.BuildPlugins.androidGradle)
        classpath(Dependencies.BuildPlugins.kotlin)
        classpath(Dependencies.BuildPlugins.dokka)
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
