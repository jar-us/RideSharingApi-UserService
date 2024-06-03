plugins {
    id("org.springframework.boot") version "3.3.0" // Add this line
    id("io.spring.dependency-management") version "1.1.5"
    kotlin("jvm") version "1.9.24"
    kotlin("plugin.spring") version "1.9.24" // Add this line
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    // Spring Boot starter dependencies
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")

    // Spring Boot test dependencies
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Jar> {
    archiveBaseName.set("ridesharing-user-service-api")
}

// Disable the bootJar task to avoid the need for a main class
tasks.getByName<org.springframework.boot.gradle.tasks.bundling.BootJar>("bootJar") {
    enabled = false
}

tasks.getByName<Jar>("jar") {
    enabled = true
    archiveBaseName.set("ridesharing-user-service-api")
}

//plugins {
//    id("io.spring.dependency-management") version "1.1.5"
//    kotlin("jvm") version "1.9.24"
//}
//
//repositories {
//    mavenCentral()
//}
//
//dependencies {
//    implementation(kotlin("stdlib"))
//    implementation("org.springframework.boot:spring-boot-starter")
//    implementation("org.springframework.boot:spring-boot-starter-web")
//    testImplementation("org.springframework.boot:spring-boot-starter-test")
//}
//
//tasks.withType<Jar> {
//    archiveBaseName.set("ridesharing-user-service-api")
//}
//

//plugins {
//    id("io.spring.dependency-management") version "1.1.5"
//    kotlin("jvm") version "1.9.24"
//}
//
//repositories    {
//    mavenCentral()
//}
//
//
//dependencies {
//    implementation(kotlin("stdlib"))
//    // spring boot starter dependencies
//
//    implementation("org.springframework.boot:spring-boot-starter")
//    implementation("org.springframework.boot:spring-boot-starter-web")
//
//    // spring boot test dependencies
//    testImplementation("org.springframework.boot:spring-boot-starter-test")
//}
//
//tasks.withType<Jar> {
//    archiveBaseName.set("ridesharing-user-service-api")
//}