package com.example.ra3.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.example.ra3.ui.theme.ListaCancionesScreen
import com.example.ra3.model.Cancion
import com.example.ra3.ui.theme.DetallesCancionScreen
import com.example.ra3.ui.theme.MenuScreen
import com.example.ra3.ui.theme.AcercaDeScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val selectedCancion = remember { mutableStateOf<Cancion?>(null) }

    NavHost(navController = navController, startDestination = "menu") {
        composable("menu") {
            MenuScreen(navController = navController, onSalir = { navController.popBackStack() })
        }
        composable("canciones") {
            ListaCancionesScreen(
                onCancionSelected = { cancion ->
                    selectedCancion.value = cancion
                    navController.navigate("detalles_cancion")
                },
                onSalir = { navController.popBackStack() }
            )
        }
        composable("detalles_cancion") {
            selectedCancion.value?.let { cancion ->
                DetallesCancionScreen(cancion = cancion, onSalir = { navController.popBackStack() })
            }
        }
        composable("acercaDe") {
            AcercaDeScreen(navController = navController)
        }
    }
}
