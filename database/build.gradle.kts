plugins {
    kotlin("jvm")
}

repositories {
    mavenCentral()
}
dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.postgresql:postgresql")
}

tasks.withType<Jar> {
    archiveBaseName.set("ridesharing-user-service-database")
}