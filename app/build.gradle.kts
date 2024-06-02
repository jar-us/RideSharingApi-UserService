plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
}

dependencies {
    implementation(project(":specifications"))
    implementation(project(":database"))
    implementation(kotlin("stdlib"))
    implementation("org.springframework.boot:spring-boot-starter")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Jar> {
    archiveBaseName.set("ridesharing-user-service-app")
}