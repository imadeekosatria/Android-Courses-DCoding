package com.example.finalproject

object FoodData {
    private val foodName = arrayOf("Bebek Panggang",
        "Rendang",
        "Soto Ayam Semarang",
        "Ayam Geprek",
        "Mie Ayam Jamur",
        "Kepiting Saos Padang"
    )

    private val bahan = arrayOf(
        "1 ekor Bebek,\n4 liter Air.\n\nBumbu untuk ungkepan:\n\n100 gram Jahe,\n3 ruas Kunyit,\n1 sdt Ketumbar,\n5 siung Bawang Putih,\n1 sdm Garam.\n\nBumbu untuk presto:\n\n3 batang Sereh (Geprek),\n5 lembar Daun Salam,\n3 siung Bawang Putih (Geprek),\n5 lembar Daun Jeruk.\n\nBumbu oven yang di oleskan:\n\n10 sdm Kecap Manis,\n3 siung Bawang Putih (Haluskan),\n2 sdm Penyedap Rasa,\n100 gram Mentega (Secukupnya).",
        "Bumbu Halus,\n 20 siung Bawang Merah,\n 15 siung Bawang Putih,\n 5 buah Kemiri,\n 1 ruas Kunyit,\n7 buah Cabe Merah Besar (boleh lebih, opsional),\n7 buah Cabe Merah Keriting (boleh lebih, opsional),\n3 ruas Jahe,\n secukupnya Gula Merah.\n\n Bahan Ungkep Daging:\n\n6 siung Bawang Putih,\n3 Ruas Jahe,\n1/2 Gula Merah.\n\n Bahan Ungkep Rendang:\n\n 2 batang Sereh,\n3 lembar Daun Salam,\n3 lembar Daun jeruk,\n1 bungkus Bumbu Kaldu Sapi,\n1 liter Santan,\n secukupnya Garam.",
        "250 gr ayam (sayap dan dada),\n2 lembar Daun jeruk,\n2 lembar daun salam,\n1 batang serai, geprek,\n5 butir cengkeh,\n1 btg kecil kayu manis,\n1-1,5 ltr Air.\n\n Bumbu halus:\n5 siung bawang merah,\n4 siung bawang putih,\n1 sdt merica,\n1 ruas jahe,\n1/2 sdt jinten bubuk,\n Garam, kaldu jamur.\n\n Bahan pelengkap:\n Nasi putih,\n Soun rebus,\n Jeruk nipis,\n Bawang putih goreng,\n Bawang merah goreng,\n Irisan Daun bawang,\n Sambal rawit,\n Sate telur puyuh,\n Tempe goreng/perkedel.",
        "1/2 kg sayap ayam,\n tepung serbaguna(merk apa aja) 3 sachet ukuran @150gr,\n bumbu marinasi,\n 8 siung bawang putih,\n secukupnya garam& merica,\n sambal,\n 20 buah cabe rawit,\n 10 siung bawang putih,\n secukupnya minyak goreng,\n secukupnya gula,garam,penyedap rasa.\n",
        "Bahan semur:\n\n 1 kg dada ayam,\n 1 kaleng jamur tiram,\n 10 butir telur ayam rebus,\n Kecap manis, kecap asin, saos tiram, garam, kaldu, lada bubuk.\n\n Bahan pelengkap:\n 1 batang sere,\n 5 lembar daun salam,\n 4 lembar daun jeruk,\n 4 cm kayu manis,\n 2 buah cengkeh,\n 1 buah bunga Lawang,\n 3 buah kapulaga,\n\n Bahan kuah:\n 4 liter air,\n 20 buah ceker ayam,\n 1 batang sere,\n 4 lembar daun salam,\n secukupnya Garam dan kaldu.\n\n Bahan sambal Ijo:\n secukupnya Cabe rawit Ijo.\n\n Bahan minyak bawang:\n 50 gr kulit ayam,\n 200 ml minyak goreng,\n 5 siung bawang putih\n\n Bahan bumbu halus semur:\n 20 siung bawang merah,\n 4 siung bawang putih,\n 3 buah kemiri,\n 8 cm kunyit,\n 1 ruas jahe,\n 1 sdt pala bubuk.\n\n Bahan mie ayam:\n 350 gr Tepung terigu protein tinggi,\n 150 gr protein rendah,\n 1 butir telur,\n 1/2 sdt garam,\n secukupnya Air.\n\n Bahan penyajian:\n secukupnya Sawi,\n secukupnya Tauge,\n Kulit pangsit.\n",
        "1 kg kepiting,\n 2 sdm Tepung maizena,\n Jahe digeprek,\n 250 ml air,\n 6 sdm saos tomat,\n 1 sdm saus tiram,\n secukupnya Merica bubuk,\n secukupnya Gula pasir,\n secukupnya Garam,\n sesuai selera Kaldu jamur.\n\n Bumbu Halus:\n 15 cabe keriting,\n 6 siung bawang putih,\n 8 siung bawang merah.\n"
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
        R.drawable.rendang,
        R.drawable.mie_ayam,
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
                food.bahan = bahan[position]
                list.add(food)
            }
            return list
        }
}