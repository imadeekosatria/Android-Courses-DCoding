package com.example.finalproject

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Detail : AppCompatActivity() {
    companion object{
        const val EXTRA_Nama = "extra_nama"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val recNama : TextView = findViewById(R.id.nama_makanan)

        val nama = intent.getStringExtra(EXTRA_Nama)

        recNama.text = nama

    }
}