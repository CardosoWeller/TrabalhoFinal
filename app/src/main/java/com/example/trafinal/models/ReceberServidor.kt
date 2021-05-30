package com.example.trafinal.models

import com.google.gson.JsonObject
import com.google.gson.annotations.SerializedName

data class ReceberServidor(
    @SerializedName("status") val status : String,
    @SerializedName("data") val data : JsonObject
){

}