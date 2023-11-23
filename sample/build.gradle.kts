import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.compose.desktop.application.tasks.AbstractNativeMacApplicationPackageTask
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget


plugins {
    kotlin("multiplatform")
    id("com.android.application")
    id("org.jetbrains.compose")
}

kotlin {
    androidTarget()
    jvm("desktop")

    val macOsConfiguration: KotlinNativeTarget.() -> Unit = {
        binaries {
            executable {
                entryPoint = "main"
                freeCompilerArgs += listOf(
                    "-linker-option", "-framework", "-linker-option", "Metal"
                )
            }
        }
    }
    macosX64(macOsConfiguration)
    macosArm64(macOsConfiguration)

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "sample"
            isStatic = true
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                //implementation("dev.carlsen.flagkit:flagkit:1.0")
                implementation(project(":core"))

                implementation(compose.material)
                implementation(compose.runtime)
            }
        }

        val androidMain by getting {
            dependencies {
                implementation(compose.material)
                implementation("androidx.activity:activity-compose:1.8.1")
                implementation("androidx.appcompat:appcompat:1.6.1")
                implementation("androidx.core:core-ktx:1.12.0")
            }
        }

        val desktopMain by getting {
            dependencies {
                implementation(compose.desktop.currentOs)
            }
        }
    }
}

android {
    compileSdk = 34
    namespace = "dev.carlsen.flagkit.sample"
    defaultConfig {
        applicationId = "org.jetbrains.TodoAppLite"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlin {
        jvmToolchain(17)
    }
}

compose.desktop {
    application {
        mainClass = "dev.carlsen.flagkit.sample.MainKt"
        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "kmp-flagkit"
            packageVersion = "1.0.0"

            windows {
                menuGroup = "kmp-flagkit"
                upgradeUuid = "92E66CE0-261E-4231-8463-AE9E245D6E50"
            }
        }
    }
}

compose.desktop.nativeApplication {
    targets(kotlin.targets.getByName("macosX64"))
    distributions {
        targetFormats(TargetFormat.Dmg)
        packageName = "kmp-flagkit"
        packageVersion = "1.0.0"
    }
}

afterEvaluate {
    val baseTask = "createDistributableNative"
    listOf("debug", "release").forEach {
        val createAppTaskName = baseTask + it.capitalize() + "macosX64".capitalize()

        val createAppTask = tasks.findByName(createAppTaskName) as? AbstractNativeMacApplicationPackageTask?
            ?: return@forEach

        val destinationDir = createAppTask.destinationDir.get().asFile
        val packageName = createAppTask.packageName.get()

        tasks.create("runNative" + it.capitalize()) {
            group = createAppTask.group
            dependsOn(createAppTaskName)
            doLast {
                ProcessBuilder("open", destinationDir.absolutePath + "/" + packageName + ".app").start().waitFor()
            }
        }
    }
}
