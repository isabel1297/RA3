package com.example.ra3.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import com.example.ra3.R

@Composable
fun AcercaDeScreen(viewModel: EquipoViewModel) {
    val equipo = listOf(
        Miembro("Erika Isabel Arcos Gomez", "9°", "B", R.drawable.erika),
        Miembro("Juan Luis Sánchez Gomez", "9°", "B", R.drawable.juanluis) // Agrega la imagen de Juan Luis aquí
        // Agrega otros miembros aquí
    )


    Column {
        Text("Materia: DESARROLLO PARA DISPOSITIVOS INTELIGENTES")
        Text("Profesor: Dr. Armando Méndez Morales")
        Text("Cuatrimestre: NOVENO")
        Text("Año: 2024")
        LazyColumn {
            items(equipo) { miembro ->
                MiembroItem(miembro)
            }
        }
    }
}

@Composable
fun MiembroItem(miembro: Miembro) {
    Column(
        modifier = Modifier.padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = miembro.urlFoto), // Usa painterResource para imágenes locales
            contentDescription = null,
            modifier = Modifier
                .size(100.dp)
                .padding(4.dp)
        )
        Text(text = miembro.nombre)
        Text(text = "Grado: ${miembro.grado}")
        Text(text = "Grupo: ${miembro.grupo}")
    }
}
