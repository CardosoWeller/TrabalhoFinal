package com.example.trafinal.Models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tabelaGame")
data class Game(
    @ColumnInfo(name = "id_user") val userId : Int,
    @ColumnInfo(name = "points") val points : Int,
    @ColumnInfo(name = "nb_question") val nbQuestion : Int,
    @ColumnInfo(name = "nivel") val nivel : String
){
    @PrimaryKey(autoGenerate = true)
    var id:Long? = null

}