package me.akhil.walletdiary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.defaultComponentContext
import me.akhil.walletdiary.navigation.RootComponent
import me.akhil.walletdiary.navigation.RootContent

class WalletDiaryActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Create the root component
        val rootComponent = RootComponent(
            componentContext = defaultComponentContext()
        )

        setContent {
            WalletDiaryTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    // Use our Decompose-powered navigation
                    RootContent(rootComponent)
                }
            }
        }
    }
}
