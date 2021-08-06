package com.example.finalproject

import android.app.ActionBar
import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import android.widget.ImageView
import android.widget.TextView

class Detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val actionBar : androidx.appcompat.app.ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayHomeAsUpEnabled(true)

        //Bind
        val nama :TextView = findViewById(R.id.nama_makanan)
        val gambar :ImageView = findViewById(R.id.detail_gambar)
        val harga : TextView = findViewById(R.id.harga_detail)
        val stock : TextView = findViewById(R.id.stock_detail)
        val bahan : TextView = findViewById(R.id.detail_bahan)
        //Get Data
        var intent = intent
        val detitle =intent.getStringExtra("nama")
        val degambar = intent.getIntExtra("gambar",0)
        val deharga = intent.getStringExtra("harga")
        val destock = intent.getStringExtra("stock")
        val detbahan = intent.getStringExtra("bahan")

        actionBar.setTitle(detitle)
        nama.text = detitle
        gambar.setImageResource(degambar)
        harga.text = deharga
        stock.text = destock
        bahan.text = detbahan


    }
}