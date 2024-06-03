plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "RideSharingApi-UserService"
include("specifications")
include("database")
include("api")
include("app")
