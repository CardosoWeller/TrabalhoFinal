package com.example.trafinal.DataBase.DAO

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.trafinal.Models.User


@Dao
interface UserDAO {

    @Query("SELECT * FROM tabelaUsuario")
    fun getAll(): List<User>

    @Query("SELECT * FROM tabelaUsuario WHERE id IN (:ids)")
    fun getAllByIds(ids : IntArray) : List<User>

    @Insert
    fun insertUser(user : User) : Long

    @Query("SELECT * FROM tabelaUsuario WHERE username LIKE :username AND senha LIKE:password")
    fun findUser(username:String,password:String) : User

    @Delete
    fun deleteUser(user : User)


}