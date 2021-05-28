package com.example.trafinal.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.example.trafinal.DataBase.AppDataBase
import com.example.trafinal.DataBase.DAO.GameDAO
import com.example.trafinal.Models.Game
import com.example.trafinal.R
import kotlinx.android.synthetic.main.item_game.view.*

class GamesAdapter(context:Context) : RecyclerView.Adapter<GamesAdapter.ViewHolder>() {

    private val DAO : GameDAO
    private val games: MutableList<Game>

    init{
        //criar a instancia da database

        val db = Room.databaseBuilder(
            context,
            AppDataBase::class.java,
            "bancoDeDados.db"
        )
            .allowMainThreadQueries()
            .build()

        DAO = db.gameDAO()

        games = DAO.getAll().toMutableList()
    }

    fun add(game: Game){
        game.id_game = DAO.insertGame(game)
        games.add(game)
    }

    override fun getItemCount() = games.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item_game, parent, false)
        )


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val game = games[position]
        holder.fillView(game)
    }


    class ViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){
        fun fillView(game : Game){
            itemView.pointsTxt.text = "Points:" + game.points.toString()
            itemView.nbQuestionTxt.text = "Number questions:" + game.nbQuestion.toString()
            itemView.nivelTxt.text = "Level" + game.nivel
        }
    }
}