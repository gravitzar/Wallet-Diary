package me.akhil.walletdiary.screens.settings

import com.arkivanov.decompose.ComponentContext

class SettingsComponent(
    componentContext: ComponentContext,
    val onBackClick: () -> Unit
) : ComponentContext by componentContext {
    // This is where we'd implement the settings business logic
    // For now, we're keeping it simple
    
    fun onBackClicked() {
        onBackClick()
    }
}
