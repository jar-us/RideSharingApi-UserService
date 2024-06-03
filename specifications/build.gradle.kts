plugins {
    kotlin("jvm")
    id("org.openapi.generator") version ("7.5.0")
}

dependencies {
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.17.1")
}

openApiGenerate {
    generatorName.set("kotlin")
    inputSpec.set("$projectDir/src/main/resources/user-service-openapi.yml")
    outputDir.set("$projectDir/src/main/kotlin/jar/us/userservice/") // Set the output directory
    modelPackage.set("view.model") // Set the package for the model classes
    modelNameSuffix.set("ViewModel")
    configOptions.set(
        mapOf(
            "dateLibrary" to "java8",
            "serializationLibrary" to "jackson"
        )
    )

    globalProperties.set(
        mapOf(
            "modelDocs" to "false", // Disable model documentation generation
            "modelTests" to "false", // Disable model tests generation
            "models" to "" // Enable model generation
        )
    )

}

tasks.withType<Jar> {
    archiveBaseName.set("ridesharing-user-service-specifications")
}
