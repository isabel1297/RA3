package com.example.ra3.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ra3.model.Cancion
import com.example.ra3.repository.CancionesRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CancionViewModel : ViewModel() {
    private val repository = CancionesRepository()

    private val _cancion = MutableStateFlow<Cancion?>(null)
    val cancion: StateFlow<Cancion?> = _cancion

    fun cargarCancion(cancionId: Int) {
        viewModelScope.launch {
            val result = repository.getCancionPorId(cancionId)
            _cancion.value = result
        }
    }
}
