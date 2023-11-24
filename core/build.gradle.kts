import com.vanniktech.maven.publish.SonatypeHost

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("org.jetbrains.compose")
    id("com.vanniktech.maven.publish")
}

kotlin {
    androidTarget {
        if(project.plugins.hasPlugin("com.vanniktech.maven.publish")) {
            publishLibraryVariants("release")
        }
    }
    jvm("desktop")
    js(IR) {
        browser()
    }

    macosX64()
    macosArm64()
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.ui)
            }
        }

        val commonTest by getting {
            dependencies {
                implementation(compose.ui)
                implementation(kotlin("test"))
            }
        }
    }
}

android {
    namespace = "dev.carlsen.flagkit"
    compileSdk = 34

    defaultConfig {
        minSdk = 21
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlin {
        jvmToolchain(17)
    }
}

mavenPublishing {
    publishToMavenCentral(SonatypeHost.S01)
    signAllPublications()

    coordinates("dev.carlsen.flagkit", "flagkit", "1.0.0-SNAPSHOT")

    pom {
        name.set("kmp-flagkit")
        description.set("Flag icons in ImageVector format for Kotlin Multiplatform.")
        inceptionYear.set("2023")
        url.set("https://github.com/acarlsen/kmp-flagkit/")
        licenses {
            license {
                name.set("The Apache License, Version 2.0")
                url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                distribution.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
            }
        }
        scm {
            url.set("https://github.com/acarlsen/kmp-flagkit/")
            connection.set("scm:git:git://github.com/acarlsen/kmp-flagkit.git")
            developerConnection.set("scm:git:ssh://git@github.com:acarlsen/kmp-flagkit.git")
        }
    }
}
