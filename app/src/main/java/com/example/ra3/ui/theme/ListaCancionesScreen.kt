package com.example.ra3.ui.theme

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items // Asegúrate de importar esto
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.ra3.model.Cancion

@Composable
fun ListaCancionesScreen(navController: NavController) {
    val canciones = listOf(
        Cancion(1, "Canción 1", "Descripción 1", "url_imagen_1", "Campo adicional 1", "Campo adicional 2"),
        // Agrega al menos 8 canciones aquí
    )

    LazyColumn {
        items(canciones) { cancion ->
            Button(onClick = { navController.navigate("detalles/${cancion.id}") }) {
                Text(text = cancion.titulo)
            }
        }
    }
}
