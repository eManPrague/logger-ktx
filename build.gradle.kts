applyProperties("local.properties")

buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(Dependencies.BuildPlugins.android)
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

tasks.getByName<Wrapper>("wrapper") {
    gradleVersion = Dependencies.Versions.gradle
    distributionType = Wrapper.DistributionType.BIN
}

tasks.create<Delete>("clean") {
    delete(rootProject.buildDir)
}
