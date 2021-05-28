package com.example.trafinal.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.trafinal.Models.Game
import com.example.trafinal.R
import kotlinx.android.synthetic.main.item_game.view.*

class GamesAdapter : RecyclerView.Adapter<GamesAdapter.ViewHolder>() {

    private val games = Game.getAll()

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