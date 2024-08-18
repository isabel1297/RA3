package com.example.ra3.repository

import com.example.ra3.model.Cancion
import com.example.ra3.network.CancionesApiService
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class CancionesRepository {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.tuweb.com/") // Cambia la URL base a la correcta
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    private val service = retrofit.create(CancionesApiService::class.java)

    suspend fun getCancionPorId(id: Int): Cancion {
        return service.getCancionPorId(id)
    }
}
