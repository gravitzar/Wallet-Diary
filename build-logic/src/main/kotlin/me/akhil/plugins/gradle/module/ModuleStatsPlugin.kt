package me.akhil.plugins.gradle.module

import org.gradle.api.Plugin
import org.gradle.api.Project

class ModuleStatsPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.afterEvaluate {
            tasks.register("reportModuleStatistics") {
                doLast {
                    GradleStatisticsReportProcess.create().executeReport(project)
                }
            }
        }
    }
}