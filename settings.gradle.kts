pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoresMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "ScreenAI"
include(":app")