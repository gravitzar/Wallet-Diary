package me.akhil.walletdiary.navigation

import androidx.compose.runtime.Composable
import com.arkivanov.decompose.extensions.compose.stack.Children
import com.arkivanov.decompose.extensions.compose.stack.animation.fade
import com.arkivanov.decompose.extensions.compose.stack.animation.plus
import com.arkivanov.decompose.extensions.compose.stack.animation.scale
import com.arkivanov.decompose.extensions.compose.stack.animation.stackAnimation
import me.akhil.walletdiary.screens.dashboard.DashboardScreen
import me.akhil.walletdiary.screens.settings.SettingsScreen

@Composable
fun RootContent(component: RootComponent) {
    Children(
        stack = component.stack,
        animation = stackAnimation(fade() + scale()),
    ) { child ->
        when (val instance = child.instance) {
            is RootComponent.Child.Dashboard -> DashboardScreen(instance.component)
            is RootComponent.Child.Settings -> SettingsScreen(instance.component)
        }
    }
}
