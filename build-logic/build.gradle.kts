import org.gradle.kotlin.dsl.`kotlin-dsl`
import org.gradle.api.artifacts.VersionCatalogsExtension

plugins {
    `kotlin-dsl`
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

gradlePlugin {
    plugins {
        register("buildTime") {
            id = "me.akhil.plugins.gradle.buildtime"
            implementationClass = "me.akhil.plugins.gradle.buildtime.BuildTimePlugin"
        }
    }
}

dependencies {
    implementation("com.mixpanel:mixpanel-java:1.4.4")
}