package com.example.trafinal.network.servicies

import com.example.trafinal.models.Game
import retrofit2.Call
import retrofit2.http.GET

interface GameServicies {

    @GET("ranking")
    fun getAll() : Call<List<Game>>




}