package me.akhil.walletdiary.navigation

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.DefaultComponentContext
import com.arkivanov.essenty.lifecycle.LifecycleRegistry

fun DefaultComponentContext(): ComponentContext {
    val lifecycle = LifecycleRegistry()
    
    // In a real app, we would properly manage the lifecycle of this component
    // For example, by observing UIViewController lifecycle events
    lifecycle.resume()
    
    return DefaultComponentContext(lifecycle)
}
