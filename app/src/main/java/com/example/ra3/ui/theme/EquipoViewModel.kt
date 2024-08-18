package com.example.ra3.ui.theme

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ra3.R
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

// Define un modelo de datos para un miembro del equipo
data class Miembro(
    val nombre: String,
    val grado: String,
    val grupo: String,
    val urlFoto: Int // Cambiado a String para representar una URL
)

// Define el ViewModel
class EquipoViewModel : ViewModel() {

    private val _equipo = MutableStateFlow<List<Miembro>>(emptyList())
    val equipo: StateFlow<List<Miembro>> = _equipo

    init {
        loadEquipoData()
    }

    private fun loadEquipoData() {
        // Aquí puedes realizar una llamada a una API o cargar los datos de algún repositorio
        viewModelScope.launch {
            val miembros = listOf(
                Miembro("Erika Isabel Arcos Gomez", "9°", "B", R.drawable.erika),
                // Agrega otros miembros aquí
            )
            _equipo.value = miembros
        }
    }
}
