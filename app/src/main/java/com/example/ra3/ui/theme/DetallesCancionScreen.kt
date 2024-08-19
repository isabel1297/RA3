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
fun DetallesCancionScreen(cancion: Cancion) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "ID: ${cancion.id}")
        Text(text = "Título: ${cancion.titulo}")
        Image(painter = painterResource(id = cancion.imagen), contentDescription = null, modifier = Modifier.size(100.dp).padding(4.dp))
        Text(text = "Descripción: ${cancion.descripcion}")
        Text(text = "Autor: ${cancion.autor}")
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
