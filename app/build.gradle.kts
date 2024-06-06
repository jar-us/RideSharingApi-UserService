plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.spring.boot.core)
    alias(libs.plugins.spring.boot.dependency.management)
    alias(libs.plugins.spring.kotlin)
}

dependencies {
    implementation(libs.spring.boot.starter.core.get())
    implementation(libs.kotlin.stdlib.get())
    implementation(libs.spring.boot.starter.data.jpa)
    implementation(project(":specifications"))
    implementation(project(":database"))
    implementation(project(":api"))
    testImplementation(libs.spring.boot.starter.test.get())
}

tasks.withType<Jar> {
    archiveBaseName.set("ridesharing-user-service-app")
}