package com.example.trafinal.Activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.trafinal.Adapters.UserAdapter
import com.example.trafinal.Models.User
import com.example.trafinal.R
import kotlinx.android.synthetic.main.activity_register.*


class RegisterActivity : AppCompatActivity(){

    lateinit var adapter: UserAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        btReturn.setOnClickListener(){

        }

        btRegister.setOnClickListener(){
            val newUser = User(userNameTxt.text.toString(),emailTxt.text.toString() ,passWordTxt.text.toString())
            adapter.add(newUser)

        }
    }

}