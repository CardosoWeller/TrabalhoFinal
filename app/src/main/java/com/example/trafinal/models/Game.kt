package com.example.trafinal.models

import com.google.gson.annotations.SerializedName


data class Game(
    @SerializedName("user") val user : String,
    @SerializedName("score") val points : Int

    ){

    var id:Long? = null

}