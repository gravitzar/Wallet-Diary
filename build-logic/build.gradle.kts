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
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")
    implementation("com.squareup.okhttp3:mockwebserver:4.12.0")
}