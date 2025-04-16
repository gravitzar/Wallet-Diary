package me.akhil.walletdiary.navigation

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.router.stack.pop
import com.arkivanov.decompose.router.stack.push
import com.arkivanov.decompose.router.stack.pushNew
import com.arkivanov.decompose.value.Value
import kotlinx.serialization.Serializable
import me.akhil.walletdiary.screens.dashboard.DashboardComponent
import me.akhil.walletdiary.screens.settings.SettingsComponent

class RootComponent(
    componentContext: ComponentContext
) : ComponentContext by componentContext {

    private val navigation = StackNavigation<Config>()

    val stack: Value<ChildStack<Config, Child>> = childStack(
        source = navigation,
        initialConfiguration = Config.Dashboard,
        handleBackButton = true, // Pop the back stack on back button press
        childFactory = ::createChild,
        serializer = Config.serializer()
    )

    private fun createChild(config: Config, componentContext: ComponentContext): Child {
        return when (config) {
            is Config.Dashboard -> Child.Dashboard(
                DashboardComponent(
                    componentContext = componentContext,
                    onSettingsClick = { navigation.pushNew(Config.Settings) }
                )
            )

            is Config.Settings -> Child.Settings(
                SettingsComponent(
                    componentContext = componentContext,
                    onBackClick = { navigation.pop() }
                )
            )
        }
    }

    sealed class Child {
        data class Dashboard(val component: DashboardComponent) : Child()
        data class Settings(val component: SettingsComponent) : Child()
    }

    @Serializable
    sealed class Config {
        @Serializable
        data object Dashboard : Config()

        @Serializable
        data object Settings : Config()
    }
}
