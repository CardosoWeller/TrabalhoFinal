package com.example.trafinal.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.trafinal.models.Game
import com.example.trafinal.R
import com.example.trafinal.dao.GameDAO
import kotlinx.android.synthetic.main.item_game.view.*

class GameAdapter() : RecyclerView.Adapter<GameAdapter.ViewHolder>() {

    private val DAO = GameDAO()
    private var games = mutableListOf<Game>()

    init{

        DAO.getAll{ gamesAPI ->
            games = gamesAPI.toMutableList()
            notifyDataSetChanged()

            Log.i(games.toString() , "Jogos")
        }

    }

    /*fun add(game: Game){
        game.id = DAO.insertGame(game)
        games.add(game)
    }*/

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
            itemView.pointsTxt.text = "User:" + game.user
            itemView.nbQuestionTxt.text = "Point:" + game.points.toString()

        }
    }
}