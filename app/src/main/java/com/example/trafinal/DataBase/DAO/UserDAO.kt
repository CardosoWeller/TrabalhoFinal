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
    fun insertGame(user : User) : Long

    @Delete
    fun deleteGame(user : User)


}