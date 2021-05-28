package com.example.trafinal.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_login.*
import android.content.Intent
import android.widget.Toast
import com.example.trafinal.Adapters.UserAdapter
import com.example.trafinal.R

class LoginActivity : AppCompatActivity(){

    lateinit var adapter: UserAdapter
    override fun onCreate(savedInstanceState : Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val info = intent.extras?.getString("info")

        Log.i("Info", "LoginActivity.onCreate")


        btLogin.setOnClickListener{

            adapter = UserAdapter(applicationContext)
            Log.i(passTxt.text.toString(), "pass")
            Log.i(userTxt.text.toString(), "User")

            Log.i(adapter.search(userTxt.text.toString(), passTxt.text.toString()).toString(), "User")

            /*if(user.userName != null){
                val intent = Intent(this, UserActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
            }*/
        }


        btRegister.setOnClickListener{
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
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