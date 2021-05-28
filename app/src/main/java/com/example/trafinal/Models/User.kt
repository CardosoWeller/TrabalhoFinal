package com.example.trafinal.Models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tabelaUsuario")
data class User(

    @ColumnInfo(name = "username") val userName : String,
    @ColumnInfo(name = "email") val email : String,
    @ColumnInfo(name = "senha") val passWord : String
){

    @PrimaryKey(autoGenerate = true)
    var id:Long? = null

    override fun equals(other:Any?) = other is User && this.id == other.id

}