plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.spring.boot.core)
    alias(libs.plugins.spring.boot.dependency.management)
}

repositories {
    mavenCentral()
}
dependencies {
    implementation(libs.spring.boot.starter.data.jpa.get())
    implementation(libs.postgresql)
    implementation(libs.kotlin.reflection)
}

//tasks.withType<Jar> {
//    archiveBaseName.set("ridesharing-user-service-database")
//}

tasks.getByName<org.springframework.boot.gradle.tasks.bundling.BootJar>("bootJar") {
    enabled = false
}

tasks.getByName<Jar>("jar") {
    enabled = true
    archiveBaseName.set("ridesharing-user-service-database")
}
