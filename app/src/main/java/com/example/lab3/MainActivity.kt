package com.example.lab3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val recyclerView =
            findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager =
            LinearLayoutManager(this)

        recyclerView.adapter = TipAdapter(
            tips = TipRepository.tips,
            onTipClick = { tip ->

                val intent = Intent(
                    this,
                    TipDetailActivity::class.java
                )

                intent.putExtra(
                    TipDetailActivity.EXTRA_TIP_DAY,
                    tip.day
                )

                startActivity(intent)
            }
        )
    }
}
