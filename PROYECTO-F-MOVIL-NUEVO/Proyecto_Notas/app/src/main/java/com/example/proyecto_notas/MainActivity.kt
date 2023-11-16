package com.example.proyecto_notas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import com.example.proyecto_notas.Navegacion.AdministradorNavegacion
import com.example.proyecto_notas.ui.theme.Proyecto_NotasTheme
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass

@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Proyecto_NotasTheme {
                val windowSize = calculateWindowSizeClass(this)
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = androidx.compose.ui.Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {

                    AdministradorNavegacion()
                    //com.example.proyecto_notas.screens.NotasApp.Content(windowSize.widthSizeClass, navController = rememberNavController())
                }
            }
        }
    }
}


