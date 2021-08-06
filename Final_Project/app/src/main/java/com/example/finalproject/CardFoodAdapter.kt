package com.example.finalproject

import android.content.Context
import android.content.Intent
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

class CardFoodAdapter(private val listFood: ArrayList<Food>, private val context: Context): RecyclerView.Adapter<CardFoodAdapter.CardViewViewHolder>() {
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
        holder.stock.text = food.stock
        holder.btnDetail.setOnClickListener{
            /**Toast.makeText(holder.itemView.context, "Detail under construction ", Toast.LENGTH_SHORT).show()
            */
            //Get Posisition

            val title : String = food.name
            val img : Int = food.photo
            val stock: String = food.stock
            val hargadetail : String = food.price
            val bahandet: String = food.bahan

            val intent = Intent(context, Detail::class.java)
            intent.putExtra("nama",title)
            intent.putExtra("gambar",img)
            intent.putExtra("stock",stock)
            intent.putExtra("harga",hargadetail)
            intent.putExtra("bahan",bahandet)
            context.startActivities(arrayOf(intent))
        }
        holder.btnBuy.setOnClickListener { Toast.makeText(holder.itemView.context, "Berhasil Membeli " + listFood[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }
    }

    override fun getItemCount(): Int {
        return listFood.size
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgItem: ImageView = itemView.findViewById(R.id.item_photo)
        var name: TextView = itemView.findViewById(R.id.nama_item)
        var harga: TextView = itemView.findViewById(R.id.harga_item)
        var btnDetail: Button = itemView.findViewById(R.id.detail)
        var btnBuy: Button = itemView.findViewById(R.id.buy)
        var stock: TextView = itemView.findViewById(R.id.stock)
    }

}