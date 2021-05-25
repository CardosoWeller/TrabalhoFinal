package com.example.trafinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState : Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val info = intent.extras?.getString("info")

        Log.i("Info", "LoginActivity.onCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.i("Info", "LoginActivity.onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("info", "LoginActivity.onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Info", "LoginActivity.onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Info", "LoginActivity.onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Info", "LoginActivity.onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Info", "LoginActivity.onDestroy")
    }


}