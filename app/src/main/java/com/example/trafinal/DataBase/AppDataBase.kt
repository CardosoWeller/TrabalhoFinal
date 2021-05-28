package com.example.trafinal.DataBase

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.trafinal.DataBase.DAO.GameDAO
import com.example.trafinal.Models.Game

@Database(entities = [Game::class], version = 1)
abstract class AppDataBase: RoomDatabase() {
    abstract fun gameDAO() : GameDAO
}