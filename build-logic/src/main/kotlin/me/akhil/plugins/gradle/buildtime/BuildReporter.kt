package me.akhil.plugins.gradle.buildtime

interface BuildReporter {
    fun report(buildData: BuildData)
}