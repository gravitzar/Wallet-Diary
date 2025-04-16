package me.akhil.walletdiary

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.ComposeUIViewController
import com.arkivanov.decompose.DefaultComponentContext
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.extensions.compose.stack.animation.predictiveback.PredictiveBackGestureIcon
import com.arkivanov.decompose.extensions.compose.stack.animation.predictiveback.PredictiveBackGestureOverlay
import com.arkivanov.essenty.backhandler.BackDispatcher
import com.arkivanov.essenty.backhandler.BackEvent
import com.arkivanov.essenty.lifecycle.ApplicationLifecycle
import me.akhil.walletdiary.navigation.RootComponent
import me.akhil.walletdiary.navigation.RootContent
import platform.UIKit.UIViewController

@OptIn(ExperimentalDecomposeApi::class)
fun rootViewController(): UIViewController = ComposeUIViewController {
    val backDispatcher = remember { BackDispatcher() }
    val rootComponent = remember {
        RootComponent(
            DefaultComponentContext(
                lifecycle = ApplicationLifecycle(),
                backHandler = backDispatcher,
            )
        )
    }

    PredictiveBackGestureOverlay(
        backDispatcher = backDispatcher,
        backIcon = { progress: Float, _: BackEvent.SwipeEdge ->
            PredictiveBackGestureIcon(
                imageVector = Icons.Default.ArrowBackIosNew,
                progress = progress,
            )
        },
        modifier = Modifier.fillMaxSize(),
    ) {
        RootContent(
            component = rootComponent,
        )
    }
}