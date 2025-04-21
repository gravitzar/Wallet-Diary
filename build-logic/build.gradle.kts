import org.gradle.kotlin.dsl.`kotlin-dsl`
import org.gradle.api.artifacts.VersionCatalogsExtension

plugins {
    `kotlin-dsl`
}

// Allow accessing libs from the root project's version catalog
// Note: This requires Gradle 7.4+ and specific setup.
// Alternatively, declare versions directly or use another sharing mechanism.
// For simplicity, we'll assume direct access works or versions are clear.
//val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

gradlePlugin {
    plugins {

    }
}

dependencies {
} 