plugins {
    id("org.springframework.boot") version "3.3.0"
    id("io.spring.dependency-management") version "1.1.5"
    kotlin("jvm") version "1.9.24"
    kotlin("plugin.spring") version "1.9.24"
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation(kotlin("stdlib"))
    implementation(project(":specifications"))
    implementation(project(":database"))
    implementation(project(":api"))
}

tasks.withType<Jar> {
    archiveBaseName.set("ridesharing-user-service-app")
}



//plugins {
//    id("org.springframework.boot") version "3.3.0"
//    id("io.spring.dependency-management") version "1.1.5"
//    kotlin("jvm") version "1.9.24"
//    kotlin("plugin.spring") version "1.9.24"
//}
//
//dependencies {
//
//    implementation("org.springframework.boot:spring-boot-starter")
//    testImplementation("org.springframework.boot:spring-boot-starter-test")
//    implementation("org.springframework.boot:spring-boot-starter")
//    implementation("org.springframework.boot:spring-boot-starter-web")
//
//    // spring boot test dependencies
//    testImplementation("org.springframework.boot:spring-boot-starter-test")
//
//    implementation(kotlin("stdlib"))
//
//    implementation(project(":specifications"))
//    implementation(project(":database"))
//    implementation(project(":api"))
//
//}
//
//tasks.withType<Jar> {
//    archiveBaseName.set("ridesharing-user-service-app")
//}