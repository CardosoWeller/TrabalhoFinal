package com.example.trafinal.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.trafinal.R
import kotlinx.android.synthetic.main.activity_user.*

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        btPlay.setOnClickListener{
            val intent = Intent(this , GameOptionActivity::class.java)
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