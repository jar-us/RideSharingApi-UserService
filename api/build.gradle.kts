plugins {
    alias(libs.plugins.spring.boot.core)
    alias(libs.plugins.spring.boot.dependency.management)
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.spring.kotlin)
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.kotlin.stdlib.get())
    implementation(libs.spring.boot.starter.web.get())

    testImplementation(libs.spring.boot.starter.test.get())
}

tasks.withType<Jar> {
    archiveBaseName.set("ridesharing-user-service-api")
}

tasks.getByName<org.springframework.boot.gradle.tasks.bundling.BootJar>("bootJar") {
    enabled = false
}

tasks.getByName<Jar>("jar") {
    enabled = true
    archiveBaseName.set("ridesharing-user-service-api")
}
