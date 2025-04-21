package me.akhil.plugins.gradle.buildtime.report

import me.akhil.plugins.gradle.buildtime.BuildData
import me.akhil.plugins.gradle.buildtime.BuildReporter

class ConsoleReporter : BuildReporter {
    override fun report(buildData: BuildData) {
        println(buildData)
    }
}