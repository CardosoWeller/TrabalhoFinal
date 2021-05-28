package com.example.trafinal.network.servicies

import com.example.trafinal.models.User
import retrofit2.Call
import retrofit2.http.*

interface UserServicies {

    //fun getAll() : Call<List<User>>

    @GET("people/{id}")
    fun getUser(@Path("id") id : Long): Call <User>

    @POST("users")
    @Headers("Content-Type: application/json")
    fun insertUser(@Body user : User) : Call<User>

    @PATCH("users/{id}")
    @Headers("Content-Type: application/json")
    fun updateUser(@Path("id") id:Long, @Body user : User): Call <User>

    @DELETE("users/{id}")
    fun deleteUser(@Path("id") id:Long) : Call<Void>

}

