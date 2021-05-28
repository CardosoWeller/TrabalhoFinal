package com.example.trafinal.Models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "tabela_usuario")
data class User(

    @ColumnInfo(name = "username") val userName : String,
    @ColumnInfo(name = "email") val email : String,
    @ColumnInfo(name = "senha") val passWord : String
){
    @PrimaryKey(autoGenerate = true)
    val id_user:Long? = null
}