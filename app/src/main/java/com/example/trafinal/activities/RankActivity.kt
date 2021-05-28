package com.example.trafinal.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.trafinal.adapters.GameAdapter
import com.example.trafinal.R
import kotlinx.android.synthetic.main.activity_rank.*


class RankActivity : AppCompatActivity (){
    lateinit var adapter: GameAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rank)

        adapter = GameAdapter()

        listGames.adapter = adapter
        listGames.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false)

    }

}