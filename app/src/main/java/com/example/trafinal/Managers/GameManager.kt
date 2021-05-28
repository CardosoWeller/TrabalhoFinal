package com.example.trafinal.Managers

import androidx.appcompat.app.AppCompatActivity
import com.example.trafinal.Models.Game

class GameManager {

    companion object {
        fun getQuestion(i: Int): String {


            return "céu"
        }

        fun getRank(): List<Game>{
            return Game.getAll()
        }
    }
}