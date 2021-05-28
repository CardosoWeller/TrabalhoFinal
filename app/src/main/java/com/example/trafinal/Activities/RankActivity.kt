package com.example.trafinal.Activities

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.trafinal.Adapters.GamesAdapter
import com.example.trafinal.R
import kotlinx.android.synthetic.main.activity_rank.*


class RankActivity : AppCompatActivity (){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rank)

        var gAdapter = GamesAdapter()

        listGames.adapter = gAdapter
        listGames.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false)

    }

}