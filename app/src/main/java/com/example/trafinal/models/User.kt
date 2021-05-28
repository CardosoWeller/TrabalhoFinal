package com.example.trafinal.models

import com.google.gson.annotations.SerializedName


data class User(

    @SerializedName("name") var userName : String,
    @SerializedName("email") var email : String,
    @SerializedName("password") var passWord : String
){

    var id:Long? = null

    override fun equals(other:Any?) = other is User && this.id == other.id

}