package com.example.trafinal.Adapters

import android.content.Context
import androidx.room.Room
import com.example.trafinal.DataBase.AppDataBase
import com.example.trafinal.DataBase.DAO.UserDAO
import com.example.trafinal.Models.User

class UserAdapter(context: Context)  {

    private val DAO : UserDAO

    init{
        //criar a instancia da database

        val db = Room.databaseBuilder(
            context,
            AppDataBase::class.java,
            "bancoDeDados.db"
        )
            .allowMainThreadQueries()
            .build()

        DAO = db.userDAO()

    }

    fun add(user: User){
        DAO.insertUser(user)
    }

    fun search(userName : String, passWord: String) : Boolean{
        DAO.findUser(userName,passWord)
            return true
    }
}