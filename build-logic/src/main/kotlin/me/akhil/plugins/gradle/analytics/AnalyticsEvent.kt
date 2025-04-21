package me.akhil.plugins.gradle.analytics

data class AnalyticsEvent(
    val name: String,
    val properties: Map<String, Any?>
)