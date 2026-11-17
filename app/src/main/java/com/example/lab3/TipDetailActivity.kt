
package com.example.lab3

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TipDetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_TIP_DAY = "extra_tip_day"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_tip_detail)

        val day = intent.getIntExtra(EXTRA_TIP_DAY, -1)

        val tip = TipRepository.tips.find {
            it.day == day
        }

        if (tip == null) {
            finish()
            return
        }

        val detailImage =
            findViewById<ImageView>(R.id.detailImage)

        val detailDay =
            findViewById<TextView>(R.id.detailDay)

        val detailTitle =
            findViewById<TextView>(R.id.detailTitle)

        val detailDescription =
            findViewById<TextView>(R.id.detailDescription)

        detailImage.setImageResource(tip.imageRes)

        detailDay.text =
            getString(R.string.day_number, tip.day)

        detailTitle.text =
            getString(tip.titleRes)

        detailDescription.text =
            getString(tip.fullDescriptionRes)

        detailImage.contentDescription =
            getString(tip.titleRes)
    }
}
