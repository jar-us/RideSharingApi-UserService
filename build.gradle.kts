import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.9.24"
}


allprojects {
    group = "jar.us"
    version = findProperty("projectVersion")?.toString() ?: "0.0.1-SNAPSHOT"
    repositories {
        mavenCentral()
    }
}

subprojects {
    tasks.withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "17"
        }
    }
}