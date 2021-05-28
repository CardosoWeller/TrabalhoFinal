package com.example.trafinal.Models

data class Game(
    val gameId : Int,
    val userId : Int,
    val points : Int,
    val nbQuestion : Int,
    val nivel : String
){
    companion object{
        fun getAll(): List<Game>{
            return listOf(
                Game (1,1,5, 2,"Facil"),
                Game (2,3,5, 2,"Facil"),
                Game (3,2,5, 2,"Facil")
            )
        }
    }
}