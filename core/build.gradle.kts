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
