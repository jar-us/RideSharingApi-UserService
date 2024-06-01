plugins {
    kotlin("jvm")
    id("org.openapi.generator") version ("7.5.0")
}

group = "jar.us"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}


openApiGenerate {
    generatorName.set("kotlin")
    inputSpec.set("$projectDir/src/main/resources/user-service-openapi.yml")
    outputDir.set("$projectDir/src/main/kotlin/jar/us/userservice/") // Set the output directory
    modelPackage.set("view.model") // Set the package for the model classes
    modelNameSuffix.set("ViewModel")
    configOptions.set(mapOf("dateLibrary" to "java8"))
    globalProperties.set(
        mapOf(
            "modelDocs" to "false", // Disable model documentation generation
            "modelTests" to "false", // Disable model tests generation
            "models" to "" // Enable model generation
        )
    )
}