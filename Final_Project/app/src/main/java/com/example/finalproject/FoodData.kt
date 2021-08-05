package com.example.finalproject

object FoodData {
    private val foodName = arrayOf("Bebek Panggang",
        "Barbecue",
        "Barbacue Potong",
        "Bebek Panggang Cina",
        "Mie Ayam",
        "Rendang",
        "Kepiting",
        "Waffle",
        "Ice Cream",
        "Strawberry Dessert"
    )

    private val foodPrice = arrayOf("Rp25.000",
        "Rp30.000",
        "Rp25.000",
        "Rp28.000",
        "Rp12.000",
        "Rp25.000",
        "Rp35.000",
        "Rp20.000",
        "Rp15.000",
        "Rp18.000"
    )

    private val foodImages = intArrayOf(R.drawable.bebek_panggang,
        R.drawable.barbecue,
        R.drawable.barbecue_potong,
        R.drawable.bebek_panggang_cina,
        R.drawable.mie_ayam,
        R.drawable.rendang,
        R.drawable.kepiting,
        R.drawable.waffle,
        R.drawable.ice_cream,
        R.drawable.strawberry_dessert
    )

    private val stock = arrayOf("Tersedia",
        "Tersedia",
        "Tersedia",
        "Tersedia",
        "Tersedia",
        "Tersedia",
        "Tersedia",
        "Tersedia",
        "Tersedia",
        "Tersedia",)
    val listData: ArrayList<Food>
        get(){
            val list = arrayListOf<Food>()
            for (position in foodName.indices){
                val food = Food()
                food.name = foodName[position]
                food.price = foodPrice[position]
                food.photo = foodImages[position]
                food.stock = stock[position]
                list.add(food)
            }
            return list
        }
}