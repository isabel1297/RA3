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

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val selectedCancion = remember { mutableStateOf<Cancion?>(null) }

    NavHost(navController = navController, startDestination = "lista_canciones") {
        composable("lista_canciones") {
            ListaCancionesScreen(
                onCancionSelected = { cancion ->
                    selectedCancion.value = cancion
                    navController.navigate("detalles_cancion")
                },
                onSalir = { /* Handle back navigation */ }
            )
        }
        composable("detalles_cancion") {
            selectedCancion.value?.let { cancion ->
                DetallesCancionScreen(cancion = cancion, onSalir = { navController.popBackStack() })
            }
        }
    }
}
