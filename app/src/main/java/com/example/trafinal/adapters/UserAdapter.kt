package com.example.trafinal.adapters

import android.content.Context
import android.util.Log
import com.example.trafinal.dao.UserDAO
import com.example.trafinal.models.User

class UserAdapter(context: Context)  {

    private val DAO : UserDAO = UserDAO()
    private var userLogin: User? = null
    private lateinit var user : User


    init{

        DAO.getUser{userFromAPI ->
            user = userFromAPI
        }


    }

    fun add(user: User){
       DAO.insertUser(user) { userAPI ->
           Log.i(user.toString() , "User")

       }
    }

    /*fun search(userName : String, passWord: String) : User? {
       userLogin = DAO.findUser(userName,passWord)
       return userLogin
    }*/


}