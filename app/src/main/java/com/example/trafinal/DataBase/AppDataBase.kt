package com.example.trafinal.DataBase

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.trafinal.DataBase.DAO.GameDAO
import com.example.trafinal.DataBase.DAO.UserDAO
import com.example.trafinal.Models.Game
import com.example.trafinal.Models.User

@Database(entities = [Game::class, User::class], version = 1)
abstract class AppDataBase: RoomDatabase() {
    abstract fun gameDAO() : GameDAO
    abstract fun userDAO() : UserDAO

}