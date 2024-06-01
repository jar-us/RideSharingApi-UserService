plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
}

group = "jar.us"
version = findProperty("projectVersion")?.toString() ?: "0.0.1-SNAPSHOT"

dependencies {
    implementation(project(":specifications"))
    implementation(kotlin("stdlib"))
    implementation("org.springframework.boot:spring-boot-starter")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Jar> {
    archiveBaseName.set("ridesharing-user-service-app")
}