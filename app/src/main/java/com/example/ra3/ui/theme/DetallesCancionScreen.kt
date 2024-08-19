package com.example.ra3.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.ui.res.painterResource
import androidx.tv.material3.Button
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Text
import com.example.ra3.model.Cancion

@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun DetallesCancionScreen(cancion: Cancion, onSalir: () -> Unit) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "ID: ${cancion.id}",
            style = MaterialTheme.typography.bodyLarge
        )
        Text(
            text = "Título: ${cancion.titulo}",
            style = MaterialTheme.typography.bodyLarge
        )
        Image(
            painter = painterResource(id = cancion.imagen),
            contentDescription = null,
            modifier = Modifier
                .size(100.dp)
                .padding(4.dp)
        )
        Text(
            text = "Descripción: ${cancion.descripcion}",
            style = MaterialTheme.typography.bodyMedium
        )
        Text(
            text = "Autor: ${cancion.autor}",
            style = MaterialTheme.typography.bodyMedium
        )
        // Botón de salir
        Button(onClick = { onSalir() }) {
            Text(text = "Salir")
        }
    }
}
