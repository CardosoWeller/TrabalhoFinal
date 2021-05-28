package com.example.trafinal.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.trafinal.adapters.GameAdapter
import com.example.trafinal.models.Game
import com.example.trafinal.R
import kotlinx.android.synthetic.main.activity_gameplay.*

class GameActivity : AppCompatActivity(){
    lateinit var adapter: GameAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gameplay)

        //activity_gameplay

        btFinish.setOnClickListener{
            finishGame()
        }

        btAnswer1.setOnClickListener{
            finishGame()
        }

        btAnswer2.setOnClickListener{
            finishGame()
        }
        btAnswer3.setOnClickListener{
            finishGame()
        }
        btAnswer4.setOnClickListener{
            finishGame()
        }
    }


    fun starGame(i : Int){

    }

    fun finishGame(){
        val newGame = Game("Wellerson", 12)
        /*adapter.add(newGame)*/
        val intent = Intent(this , UserActivity::class.java)
        startActivity(intent)

    }
}