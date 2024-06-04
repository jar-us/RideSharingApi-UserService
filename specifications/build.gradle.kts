plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.openapi.generator)

}

dependencies {
    implementation(libs.jackson.core.get())
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
