package com.example.trafinal.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.trafinal.adapters.UserAdapter
import com.example.trafinal.models.User
import com.example.trafinal.R
import kotlinx.android.synthetic.main.activity_register.*


class RegisterActivity : AppCompatActivity(){

    lateinit var adapter: UserAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        adapter = UserAdapter(applicationContext)

        btReturn.setOnClickListener(){

        }

        btRegister.setOnClickListener(){
            val newUser = User(userNameTxt.text.toString(),emailTxt.text.toString() ,passWordTxt.text.toString())
            /*adapter.add(newUser)
            val intent = Intent(this , LoginActivity::class.java)
            startActivity(intent)*/
        }
    }

}