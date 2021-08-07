package com.example.finalproject

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.ActionBar

class About : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        //actionBar
        val backButton = supportActionBar
        backButton!!.title = "About Dev"
        backButton.setDisplayHomeAsUpEnabled(true)

        val ig : ImageButton = findViewById(R.id.instagram)
        ig.setOnClickListener(this)

        val wa : ImageButton = findViewById(R.id.whatsapp)
        wa.setOnClickListener(this)

        val fb : ImageButton = findViewById(R.id.facebook)
        fb.setOnClickListener(this)

        val linkedin : ImageButton = findViewById(R.id.linkedin)
        linkedin.setOnClickListener(this)


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.instagram->{
                val linkinstagram: Uri = Uri.parse("https://www.instagram.com/imadeekosatria/")
                val iginten  = Intent(Intent.ACTION_VIEW, linkinstagram)
                startActivity(iginten)
            }

            R.id.whatsapp->{
                val linkwhatsapp: Uri = Uri.parse("https://wa.me/081803634659")
                val wainten = Intent(Intent.ACTION_VIEW, linkwhatsapp)
                startActivity(wainten)
            }

            R.id.linkedin->{
                val linklinked: Uri = Uri.parse("https://www.linkedin.com/in/i-made-eko-satria-wiguna-8748871b6/")
                val liintent = Intent(Intent.ACTION_VIEW, linklinked)
                startActivity(liintent)
            }

            R.id.facebook->{
                val linkfacebook: Uri = Uri.parse("https://www.facebook.com/imadeeko.imadeeko")
                val fbintent = Intent(Intent.ACTION_VIEW, linkfacebook)
                startActivity(fbintent)
            }
        }
    }
}