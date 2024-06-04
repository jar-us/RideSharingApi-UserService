plugins {
    alias(libs.plugins.kotlin.jvm)
}

repositories {
    mavenCentral()
}
dependencies {
    implementation(libs.spring.boot.starter.data.jpa.get())
    implementation(libs.postgresql)
}

tasks.withType<Jar> {
    archiveBaseName.set("ridesharing-user-service-database")
}