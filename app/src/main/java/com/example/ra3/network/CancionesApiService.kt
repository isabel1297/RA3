package com.example.ra3.network

import retrofit2.http.GET
import retrofit2.http.Path
import com.example.ra3.model.Cancion

interface CancionesApiService {
    @GET("canciones/{id}")
    suspend fun getCancionPorId(@Path("id") id: Int): Cancion
}
