package com.example.ra3.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.ra3.model.Cancion

@Composable
fun DetallesCancionScreen(cancionId: Int) {
    // Implementa la función para obtener datos de una API
    val cancion: Cancion? = obtenerCancionPorId(cancionId)

    cancion?.let {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)) {
            Text(text = it.titulo)
            Image(painter = rememberImagePainter(it.urlImagen), contentDescription = null)
            Text(text = it.descripcion)
            Text(text = it.campoAdicional1)
            Text(text = it.campoAdicional2)
        }
    } ?: run {
        Text(text = "Error al cargar la canción.")
    }
}

// Ejemplo de función que obtendría la canción desde la API (esto debe ser implementado)
fun obtenerCancionPorId(cancionId: Int): Cancion? {
    // Lógica para obtener la canción desde la API
    return Cancion(
        id = cancionId,
        titulo = "Título de Ejemplo",
        urlImagen = "https://example.com/image.jpg",
        descripcion = "Descripción detallada de la canción.",
        campoAdicional1 = "Campo adicional 1",
        campoAdicional2 = "Campo adicional 2"
    )
}
