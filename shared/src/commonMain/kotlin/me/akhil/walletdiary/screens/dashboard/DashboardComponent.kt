package me.akhil.walletdiary.screens.dashboard

import com.arkivanov.decompose.ComponentContext

class DashboardComponent(
    componentContext: ComponentContext,
    val onSettingsClick: () -> Unit
) : ComponentContext by componentContext {
    // This is where we'd implement the dashboard business logic
    // For now, we're keeping it simple
    
    fun onSettingsClicked() {
        onSettingsClick()
    }
}
