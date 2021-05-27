package com.example.trafinal

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_user.*

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        btPlay.setOnClickListener{
            val intent = Intent(this , GameActivity::class.java)
            startActivity(intent)
        }

        btRank.setOnClickListener{
            val intent = Intent(this, RankActivity::class.java)
            startActivity(intent)
        }

        btExit.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

    }

}