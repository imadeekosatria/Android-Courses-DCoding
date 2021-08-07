package com.example.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class Detail : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val actionBar : androidx.appcompat.app.ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

        val share : ImageButton = findViewById(R.id.share)
        share.setOnClickListener {
            Toast.makeText(applicationContext, "Share, tidak tau apa yang harus di share Maap 🤦‍♂️", Toast.LENGTH_LONG).show()
        }

        val beli : Button = findViewById(R.id.beli)
        beli.setOnClickListener {
            Toast.makeText(applicationContext, "Berhasil beli 👏", Toast.LENGTH_SHORT).show()
        }

        val favorit : Button = findViewById(R.id.favorite)
        favorit.setOnClickListener {
            Toast.makeText(applicationContext, "Favorite 🤍", Toast.LENGTH_SHORT).show()
        }
        //Bind
        val nama :TextView = findViewById(R.id.nama_makanan)
        val gambar :ImageView = findViewById(R.id.detail_gambar)
        val harga : TextView = findViewById(R.id.harga_detail)
        val stock : TextView = findViewById(R.id.stock_detail)
        val bahan : TextView = findViewById(R.id.detail_bahan)
        //Get Data
        val intent = intent
        val detitle =intent.getStringExtra("nama")
        val degambar = intent.getIntExtra("gambar",0)
        val deharga = intent.getStringExtra("harga")
        val destock = intent.getStringExtra("stock")
        val detbahan = intent.getStringExtra("bahan")

        actionBar.title = detitle
        nama.text = detitle
        gambar.setImageResource(degambar)
        harga.text = deharga
        stock.text = destock
        bahan.text = detbahan


    }

}