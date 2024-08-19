package com.example.ra3.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.tv.material3.Text
import com.example.ra3.R

@Composable
fun AcercaDeScreen(navController: NavController) {
    val equipo = listOf(
        Miembro("Erika Isabel Arcos Gomez", "9°", "B", R.drawable.erika),
        Miembro("Juan Luis Sánchez Gomez", "9°", "B", R.drawable.juanluis)
    )

    Column(
        modifier = Modifier
            .padding(16.dp)
            .background(MaterialTheme.colorScheme.background),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Acerca de",
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Información del curso
        Column(modifier = Modifier.padding(8.dp)) {
            Text("Materia: DESARROLLO PARA DISPOSITIVOS INTELIGENTES", fontSize = 16.sp)
            Text("Profesor: Dr. Armando Méndez Morales", fontSize = 16.sp)
            Text("Cuatrimestre: NOVENO", fontSize = 16.sp)
            Text("Año: 2024", fontSize = 16.sp)
        }

        // Lista de miembros
        LazyColumn(
            modifier = Modifier.padding(top = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(equipo) { miembro ->
                MiembroItem(miembro)
            }
        }

        // Botón de salir
        Button(
            onClick = { navController.navigate("menu") },
            modifier = Modifier
                .padding(top = 24.dp)
                .fillMaxWidth()
        ) {
            Text(text = "Salir al Menú")
        }
    }
}

@Composable
fun MiembroItem(miembro: Miembro) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = androidx.compose.material3.CardDefaults.cardColors( // Actualización para definir colores en la Card
            containerColor = MaterialTheme.colorScheme.surface
        )
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = miembro.urlFoto), // Usa painterResource para imágenes locales
                contentDescription = null,
                modifier = Modifier
                    .size(80.dp)
                    .padding(end = 16.dp)
            )
            Column {
                Text(text = miembro.nombre, style = MaterialTheme.typography.titleMedium)
                Text(text = "Grado: ${miembro.grado}", style = MaterialTheme.typography.bodyMedium)
                Text(text = "Grupo: ${miembro.grupo}", style = MaterialTheme.typography.bodyMedium)
            }
        }
    }
}
