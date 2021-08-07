package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var rvFood: RecyclerView
    private var list: ArrayList<Food> = arrayListOf()

    //Main
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvFood = findViewById(R.id.rv_food)
        rvFood.setHasFixedSize(true)

        list.addAll(FoodData.listData)
        showcardFood()
    }
    //CardView
    private fun showcardFood(){
        rvFood.layoutManager = LinearLayoutManager(this)
        val cardFoodAdapter = CardFoodAdapter(list,this)
        rvFood.adapter = cardFoodAdapter

    }

    //About
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.about,menu)
        return super.onCreateOptionsMenu(menu)
    }
    //Move Activity
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_about -> {
                val moveIntent = Intent(this@MainActivity, About::class.java)
                startActivity(moveIntent)
            }
        }
        return super.onOptionsItemSelected(item)
    }



}