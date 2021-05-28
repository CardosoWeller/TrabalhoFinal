package com.example.trafinal.Models

import com.google.gson.annotations.SerializedName

data class Question(
    @SerializedName("id") var id : Int,
    @SerializedName("id_category") var category : Int,
    @SerializedName("") var nbQuestion : Int,
    @SerializedName("nivel") var nivel : Int,
    @SerializedName("pergunta") var  pergunta : String,
    @SerializedName("respostas") var respostas : Array<String>
){

}