package com.example.trafinal.Activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.trafinal.Adapters.GamesAdapter
import com.example.trafinal.Models.Game
import com.example.trafinal.R
import kotlinx.android.synthetic.main.activity_game.*
import kotlinx.android.synthetic.main.activity_gameplay.*
import kotlinx.android.synthetic.main.activity_rank.*

class GameActivity : AppCompatActivity(){
    lateinit var adapter: GamesAdapter

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
        val newGame = Game(1, 2, 2,"Fácil")
        adapter.add(newGame)
        val intent = Intent(this , UserActivity::class.java)
        startActivity(intent)

    }
}