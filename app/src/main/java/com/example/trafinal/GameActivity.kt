package com.example.trafinal

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_game.*
import kotlinx.android.synthetic.main.activity_gameplay.*


class GameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)


        btEasy.setOnClickListener{

            starGame(1)
        }

        btMedium.setOnClickListener{

            starGame(2)

        }
        btHard.setOnClickListener{

            starGame(3)

        }

        btReturn.setOnClickListener{
            val intent = Intent(this , UserActivity::class.java)
            startActivity(intent)
        }


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
        setContentView(R.layout.activity_gameplay)
        val  game = GameManager()

        game.getQuestion(i)

        //questionTxt.setText(game.getQuestion(i))
    }

    fun finishGame(){

    }
}