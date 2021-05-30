package com.example.trafinal.dao

import android.util.Log
import com.example.trafinal.models.Game
import com.example.trafinal.models.ReceberServidor
import com.example.trafinal.network.servicies.GameServicies
import com.google.gson.JsonObject
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

    fun getAll(finished: (receber : ReceberServidor) -> Unit){
        service.getAll().enqueue(object : Callback<ReceberServidor> {
            override fun onResponse(call: Call<ReceberServidor>, response: Response<ReceberServidor>) {

                val receber = response.body()!!


                finished(receber)

            }
            override fun onFailure(call: Call<ReceberServidor>, t: Throwable) {}

        })
    }
}