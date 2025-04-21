package me.akhil.plugins.gradle.buildtime

import me.akhil.plugins.gradle.analytics.AnalyticsReporter
import org.gradle.api.Plugin
import org.gradle.api.Project

class BuildTimePlugin : Plugin<Project> {
    override fun apply(project: Project) {
        val buildTimeListener = BuildTimeListener(BuildDataFactory, reporter())
        project.gradle.addBuildListener(buildTimeListener)
    }

    private fun reporter(): BuildReporter {
        return BuildReporter(AnalyticsReporter.create("Build Time Plugin"))
    }
}