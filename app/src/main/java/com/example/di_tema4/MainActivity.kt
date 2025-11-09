package com.example.di_tema4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import com.example.di_tema4.ui.theme.DI_Tema4Theme
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DI_Tema4Theme() { // Tema de Material 3
                var showSplash by rememberSaveable { mutableStateOf(true) }

                if (showSplash) {
                    SplashScreen(onTimeout = { showSplash = false })
                } else {
                    //HomeScreen()
                    ShopScreen()
                }
            }
        }
    }
}

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            "Bienvenido al Mercado",
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

