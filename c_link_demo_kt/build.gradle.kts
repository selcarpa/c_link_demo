import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    kotlin("multiplatform") version "1.9.21"
}

group = "one.tain"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    google()
}



kotlin {
    fun KotlinNativeTarget.config() {
        binaries {
            executable {
                entryPoint = "main"
            }
        }
    }

    linuxX64("linuxX64") {
        config()
        compilations["main"].cinterops {
            @Suppress("LocalVariableName") val c_lib_demo by creating
        }
    }
}



