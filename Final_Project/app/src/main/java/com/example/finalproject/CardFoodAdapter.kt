package com.example.finalproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardFoodAdapter(private val listFood: ArrayList<Food>): RecyclerView.Adapter<CardFoodAdapter.CardViewViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardFoodAdapter.CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_food, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardFoodAdapter.CardViewViewHolder, position: Int) {
        val food = listFood[position]
        Glide.with(holder.itemView.context)
            .load(food.photo)
            .apply(RequestOptions().override(350,550))
            .into(holder.imgItem)

        holder.name.text = food.name
        holder.harga.text = food.price
        holder.btnFavorite.setOnClickListener{ Toast.makeText(holder.itemView.context, "Favorite " +listFood[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()}
        holder.btnBuy.setOnClickListener { Toast.makeText(holder.itemView.context, "Berhasil Membeli " + listFood[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }
        holder.itemView.setOnClickListener{ Toast.makeText(holder.itemView.context, " " +listFood[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()}
    }

    override fun getItemCount(): Int {
        return listFood.size
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgItem: ImageView = itemView.findViewById(R.id.item_photo)
        var name: TextView = itemView.findViewById(R.id.nama_item)
        var harga: TextView = itemView.findViewById(R.id.harga_item)
        var btnFavorite: Button = itemView.findViewById(R.id.favorite)
        var btnBuy: Button = itemView.findViewById(R.id.buy)
    }
}