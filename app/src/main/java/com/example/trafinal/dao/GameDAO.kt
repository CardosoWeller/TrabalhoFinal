package com.example.trafinal.dao

import com.example.trafinal.models.Game
import com.example.trafinal.network.servicies.GameServicies
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class GameDAO{

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://super-trivia-server.herokuapp.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service = retrofit.create(GameServicies::class.java)

    fun getAll(finished: (game: List<Game>) -> Unit){
        service.getAll().enqueue(object : Callback<List<Game>> {
            override fun onResponse(call: Call<List<Game>>, response: Response<List<Game>>) {
                val games = response.body()!!
                finished(games)

            }
            override fun onFailure(call: Call<List<Game>>, t: Throwable) {}

        })
    }
}