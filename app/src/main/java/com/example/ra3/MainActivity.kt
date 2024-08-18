package com.example.ra3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.tv.material3.ExperimentalTvMaterial3Api
import com.example.ra3.ui.theme.DetallesCancionScreen
import com.example.ra3.ui.theme.ListaCancionesScreen
import com.example.ra3.ui.theme.MenuScreen
import com.example.ra3.ui.theme.AcercaDeScreen
import com.example.ra3.ui.theme.EquipoViewModel
import com.example.ra3.ui.theme.RA3Theme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalTvMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RA3Theme {
                AppNavigation()
            }
        }
    }
}

@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val equipoViewModel = EquipoViewModel() // Crear o inyectar tu ViewModel aquí

    NavHost(navController = navController, startDestination = "menu") {
        composable("menu") { MenuScreen(navController) }
        composable("canciones") { ListaCancionesScreen(navController) }
        composable("detalles/{cancionId}") { backStackEntry ->
            DetallesCancionScreen(backStackEntry.arguments?.getInt("cancionId") ?: 0)
        }
        composable("acercaDe") { AcercaDeScreen(equipoViewModel) }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RA3Theme {
        AppNavigation()
    }
}
