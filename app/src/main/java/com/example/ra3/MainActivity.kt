package com.example.ra3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import com.example.ra3.model.Cancion
import com.example.ra3.ui.theme.RA3Theme
import com.example.ra3.navigation.AppNavigation
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Text

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
fun DetallesCancionScreen(cancion: Cancion) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "ID: ${cancion.id}")
        Text(text = "Título: ${cancion.titulo}")
        Image(
            painter = painterResource(id = cancion.imagen),
            contentDescription = null,
            modifier = Modifier.size(100.dp).padding(4.dp)
        )
        Text(text = "Descripción: ${cancion.descripcion}")
        Text(text = "Autor: ${cancion.autor}")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RA3Theme {
        DetallesCancionScreen(
            Cancion(
                id = 1,
                titulo = "Ejemplo",
                imagen = R.drawable.fantasmas,
                descripcion = "Descripción de ejemplo",
                autor = "Autor de ejemplo"
            )
        )
    }
}
