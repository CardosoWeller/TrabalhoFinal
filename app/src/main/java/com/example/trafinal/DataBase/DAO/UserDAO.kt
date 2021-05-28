package com.example.trafinal.DataBase.DAO

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.trafinal.Models.User


@Dao
interface UserDAO {

    @Query("SELECT * FROM tabela_usuario")
    fun getAll(): List<User>

    @Query("SELECT * FROM tabela_usuario WHERE id_user IN (:ids)")
    fun getAllByIds(ids : IntArray) : List<User>

    @Insert
    fun insertUser(user : User) : Long

    @Query("SELECT * FROM tabela_usuario WHERE username IN (:username) AND senha (:password)")
    fun findUser(username:String,password:String)

    @Delete
    fun deleteUser(user : User)


}