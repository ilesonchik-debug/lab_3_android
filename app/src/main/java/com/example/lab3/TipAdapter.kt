
package com.example.lab3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TipAdapter(
    private val tips: List<Tip>,
    private val onTipClick: (Tip) -> Unit
) : RecyclerView.Adapter<TipAdapter.TipViewHolder>() {

    class TipViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        val tipImage: ImageView =
            itemView.findViewById(R.id.tipImage)

        val tipDay: TextView =
            itemView.findViewById(R.id.tipDay)

        val tipTitle: TextView =
            itemView.findViewById(R.id.tipTitle)

        val tipDescription: TextView =
            itemView.findViewById(R.id.tipDescription)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TipViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_tip, parent, false)

        return TipViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: TipViewHolder,
        position: Int
    ) {

        val tip = tips[position]
        val context = holder.itemView.context

        holder.tipImage.setImageResource(tip.imageRes)

        holder.tipDay.text =
            context.getString(R.string.day_number, tip.day)

        holder.tipTitle.text =
            context.getString(tip.titleRes)

        holder.tipDescription.text =
            context.getString(tip.shortDescriptionRes)

        holder.itemView.setOnClickListener {
            onTipClick(tip)
        }
    }

    override fun getItemCount(): Int {
        return tips.size
    }
}
