package com.example.ra3.ui.theme

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items // Asegúrate de importar esto
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.ra3.R
import com.example.ra3.model.Cancion

@Composable
fun ListaCancionesScreen(onCancionSelected: (Cancion) -> Unit) {
    val canciones = listOf(
        Cancion("001", "Rosa Pastel", R.drawable.imagen_rosa_pastel, "La canción fue compuesta por Denisse Guerrero, Edgar Huerta y Ricardo Arreola, integrantes del grupo, con la colaboración del cantautor tapatio Saulo López Lauren", "Belanova"),
        Cancion("002", "Más flow más cash", R.drawable.imagen_mas_flow, "Es una canción de hip-hop/rap de 2014 de Millonario y W. Corona. Puedes escucharla en Spotify y ver el video musical en Shazam", "W. corona"),
        Cancion("003", "Vivir de amor", R.drawable.imagen_vivir_de_amor, "", "Gesed"),
        Cancion("004", "Problema", R.drawable.imagen_problema, "Presenta una referencia a la aplicación de redes sociales basada en videos TikTok, transmitiendo: “Pa 'mí tú ere' un desafío como lo 'de TikTok / Tú ere' un problema y yo amo lo 'conflicto'”, se escucha en un extracto de la canción", "Daddy Yankee"),
        Cancion("005", "La vuelta al mundo", R.drawable.imagen_vuelta_al_mundo, "La canción gira en torno a una mujer que es descrita como un 'problema', pero de una manera que sugiere fascinación y atracción por parte del narrador.", "Daddy Yankee"),
        Cancion("006", "Fantasmas", R.drawable.imagen_fantasmas, "Recuerda a seres queridos que ya no se encuentran con nosotros. El artista regiomontano había adelantado fragmentos del sencillo a través de sus redes desde hace varias semanas.", "HUMBE"),
        Cancion("007", "Si no estás", R.drawable.imagen_si_no_estas, "Si no estás es una balada acompañada de un piano que llega directamente al corazoncito y que habla sobre una historia de desamor. Esa sensación de estar perdido cuando esa persona que quieres te hace daño y se distancia de ti. Una letra con la que miles de personas se han sentido identificados en los últimos días", "Iñigo Quintero"),
        Cancion("008", "Por el contrario", R.drawable.imagen_por_el_contrario, "La canción 'POR EL CONTRARIO', interpretada por Becky G en colaboración con Ángela Aguilar y Leonardo Aguilar, es una expresión lírica del dolor y la lucha interna que sigue a una ruptura amorosa. La letra refleja un corazón que intenta sanar, pero que se encuentra atrapado en el recuerdo de un amor pasado.", "Becky G")
    )

    LazyColumn {
        items(canciones) { cancion ->
            Button(onClick = { onCancionSelected(cancion) }) {
                Text(text = cancion.titulo)
            }
        }
    }
}
