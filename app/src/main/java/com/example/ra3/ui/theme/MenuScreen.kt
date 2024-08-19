package com.example.ra3.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.tv.material3.ExperimentalTvMaterial3Api

@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun MenuScreen(navController: NavHostController, onSalir: () -> Unit) {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = { navController.navigate("canciones") }) {
                Text("Lista de Canciones")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.navigate("acercaDe") }) {
                Text("Acerca de...")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { /* Lógica para salir de la app */ }) {
                Text("Salir")
            }
        }
    }
}


