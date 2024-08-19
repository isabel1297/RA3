package com.example.ra3.model

import androidx.annotation.DrawableRes

data class Cancion(
    val id: Int,
    val titulo: String,
    @DrawableRes val imagen: Int,
    val descripcion: String,
    val autor: String
)
