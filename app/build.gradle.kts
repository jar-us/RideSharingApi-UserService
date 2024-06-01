plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    kotlin("jvm")
    kotlin("plugin.spring")
}

group = "jar.us"
version = findProperty("projectVersion")?.toString() ?: "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":specifications"))
    implementation(kotlin("stdlib"))
    implementation("org.springframework.boot:spring-boot-starter")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType<Jar> {
    archiveBaseName.set("ridesharing-user-service-app")
}