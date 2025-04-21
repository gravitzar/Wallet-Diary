package me.akhil.plugins.gradle.module

data class ModuleMetadata(
    val moduleName: String,
    val type: ModuleType
)

enum class ModuleType {
    Api,
    Implementation,
    App
}