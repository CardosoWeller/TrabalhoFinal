package com.example.trafinal.dao

import com.example.trafinal.models.User
import com.example.trafinal.network.servicies.UserServicies
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class UserDAO{
    val retrofit = Retrofit.Builder()
        .baseUrl("https://super-trivia-server.herokuapp.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val service = retrofit.create(UserServicies::class.java)

    fun getUser(finished: (user: User) -> Unit){
        service.getUser(1).enqueue(object : Callback<User> {
            override fun onFailure(call: Call<User>, t: Throwable) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onResponse(call: Call<User>, response: Response<User>) {
                val user = response.body()!!
                finished(user)

            }

        })
    }

    fun insertUser(user : User , finished: (user: User) -> Unit){
        service.insertUser(user).enqueue(object : Callback<User>{
            override fun onResponse(call: Call<User>, response: Response<User>) {
                val user = response.body()!!
                finished(user)
            }

            override fun onFailure(call: Call<User>, t: Throwable) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })

    }
}