package com.example.myfoodlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter :RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    private val foodName = arrayOf("AKPU", "AMALA", "EBA","FRIED RICE","JOLOF RICE", "MOI-MOI", "NOODLES", "TUWO")
    private val foodPrice = arrayOf("#250","#650", "#300","#400","#750","#550","#150","#450","600")
    private val image= intArrayOf(
        R.drawable.akpu,
        R.drawable.amala,
        R.drawable.eba,
        R.drawable.fr,
        R.drawable.jolof,
        R.drawable.moi,
        R.drawable.noodlels,
        R.drawable.tuwo
    )


    inner class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){

        var image: ImageView = itemView.findViewById(R.id.image)
        var foodName:TextView = itemView.findViewById(R.id.food_name)
        var foodPrice:TextView = itemView.findViewById(R.id.food_price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v:View = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycle_model,parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.foodName.text=foodName[position]
        holder.foodPrice.text=foodPrice[position]
        holder.image.setImageResource(image[position])
    }

    override fun getItemCount(): Int {
        return foodName.size
    }
}
