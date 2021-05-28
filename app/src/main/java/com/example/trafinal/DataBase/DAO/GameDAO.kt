package com.example.trafinal.DataBase.DAO

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.trafinal.Models.Game

@Dao
interface GameDAO {

    @Query("SELECT * FROM tabela_game")
    fun getAll(): List<Game>

    @Query("SELECT * FROM tabela_game WHERE id_user IN (:ids)")
    fun getAllByIds(ids : IntArray) : List<Game>

    @Insert
    fun insertGame(game : Game) : Long

    @Delete
    fun deleteGame(game : Game)

}