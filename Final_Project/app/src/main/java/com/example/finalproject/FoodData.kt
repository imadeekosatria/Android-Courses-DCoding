package com.example.finalproject

object FoodData {
    private val foodName = arrayOf(
        "Bebek Panggang",
        "Rendang",
        "Soto Ayam Semarang",
        "Ayam Geprek",
        "Mie Ayam Jamur",
        "Kepiting Saos Padang",
        "Sayap Ayam Barbecue",
        "Kerang Saos Padang",
        "Ikan Laut Bakar",
        "Bakso Sapi"
    )

    private val bahan = arrayOf(
        "1 ekor Bebek,\n4 liter Air.\n\nBumbu untuk ungkepan:\n\n100 gram Jahe,\n3 ruas Kunyit,\n1 sdt Ketumbar,\n5 siung Bawang Putih,\n1 sdm Garam.\n\nBumbu untuk presto:\n\n3 batang Sereh (Geprek),\n5 lembar Daun Salam,\n3 siung Bawang Putih (Geprek),\n5 lembar Daun Jeruk.\n\nBumbu oven yang di oleskan:\n\n10 sdm Kecap Manis,\n3 siung Bawang Putih (Haluskan),\n2 sdm Penyedap Rasa,\n100 gram Mentega (Secukupnya).",
        "Bumbu Halus:\n\n20 siung Bawang Merah,\n15 siung Bawang Putih,\n5 buah Kemiri,\n1 ruas Kunyit,\n7 buah Cabe Merah Besar (boleh lebih, opsional),\n7 buah Cabe Merah Keriting (boleh lebih, opsional),\n3 ruas Jahe,\nsecukupnya Gula Merah.\n\nBahan Ungkep Daging:\n\n6 siung Bawang Putih,\n3 Ruas Jahe,\n1/2 Gula Merah.\n\nBahan Ungkep Rendang:\n\n2 batang Sereh,\n3 lembar Daun Salam,\n3 lembar Daun jeruk,\n1 bungkus Bumbu Kaldu Sapi,\n1 liter Santan,\nsecukupnya Garam.",
        "250 gr ayam (sayap dan dada),\n2 lembar Daun jeruk,\n2 lembar daun salam,\n1 batang serai, geprek,\n5 butir cengkeh,\n1 btg kecil kayu manis,\n1-1,5 ltr Air.\n\nBumbu halus:\n\n5 siung bawang merah,\n4 siung bawang putih,\n1 sdt merica,\n1 ruas jahe,\n1/2 sdt jinten bubuk,\nGaram, kaldu jamur.\n\nBahan pelengkap:\n\nNasi putih,\nSoun rebus,\nJeruk nipis,\nBawang putih goreng,\nBawang merah goreng,\nIrisan Daun bawang,\nSambal rawit,\nSate telur puyuh,\nTempe goreng/perkedel.",
        "1/2 kg sayap ayam,\ntepung serbaguna(merk apa aja) 3 sachet ukuran @150gr,\nbumbu marinasi,\n8 siung bawang putih,\nsecukupnya garam & merica,\nsambal,\n20 buah cabe rawit,\n10 siung bawang putih,\nsecukupnya minyak goreng,\nsecukupnya gula,garam,penyedap rasa.\n",
        "Bahan semur:\n\n1 kg dada ayam,\n1 kaleng jamur tiram,\n10 butir telur ayam rebus,\nKecap manis, kecap asin, saos tiram, garam, kaldu, lada bubuk.\n\nBahan pelengkap:\n\n1 batang sere,\n5 lembar daun salam,\n4 lembar daun jeruk,\n4 cm kayu manis,\n2 buah cengkeh,\n1 buah bunga Lawang,\n3 buah kapulaga,\n\nBahan kuah:\n4 liter air,\n20 buah ceker ayam,\n1 batang sere,\n4 lembar daun salam,\nsecukupnya Garam dan kaldu.\n\nBahan sambal Ijo:\n\nsecukupnya Cabe rawit Ijo.\n\nBahan minyak bawang:\n\n50 gr kulit ayam,\n200 ml minyak goreng,\n5 siung bawang putih\n\nBahan bumbu halus semur:\n\n20 siung bawang merah,\n4 siung bawang putih,\n3 buah kemiri,\n8 cm kunyit,\n1 ruas jahe,\n1 sdt pala bubuk.\n\nBahan mie ayam:\n\n350 gr Tepung terigu protein tinggi,\n150 gr protein rendah,\n1 butir telur,\n1/2 sdt garam,\nsecukupnya Air.\n\nBahan penyajian:\n\nsecukupnya Sawi,\nsecukupnya Tauge,\nKulit pangsit.\n",
        "1 kg kepiting,\n2 sdm Tepung maizena,\nJahe digeprek,\n250 ml air,\n6 sdm saos tomat,\n1 sdm saus tiram,\nsecukupnya Merica bubuk,\nsecukupnya Gula pasir,\nsecukupnya Garam,\nsesuai selera Kaldu jamur.\n\nBumbu Halus:\n\n15 cabe keriting,\n6 siung bawang putih,\n8 siung bawang merah.\n",
        "1 kg sayap ayam,\n1 buah lemon/jeruk nipis,\n1 ibu jari jahe,\n4 siung bawang,\n2 sendok makan madu,\n2 sendok makan saus tomat,\n2 sendok makan saus barbecue,\n1/2 sendok teh merica bubuk,\n1 sendok teh garam.\n",
        "1/4 kg kerang,\n2 lembar daun salam,\n1 sdm garam,\n800 ml air.\n\nBahan Saos :\n\n1 buah bawang bombay,\n2 sdm saos tiram,\n5 buah cabe merah,\n4 sdm saos sambal,\n3 sdm saos tomat,\n1/2 sdt lada bubuk,\n1 sdm gulpas,\n1 sdm maizena,\n2 sdm air,\n3 batang daun bawang,\n30 gr fibercreme.\n\nBumbu Halus :\n\n5 siung bawang putih,\n4 siung bawang merah,\n1 ruas jahe,\n10 buah cabe rawit merah,\n",
        "3 ekor ikan laut,\n1 bh Jeruk nipis,\n4 sdm mentega.\n\nBumbu halus:\n\n11 siung bawang putih,\n8 siung bawang merah,\n1/2 sdm ketumbar,\n1/4 sdt merica,\n9 sdm kecap manis,\nsecukupnya Gula garam air.\n",
        "Bakso Sapi:\n\n500 gr daging sapi,\n3 siung bawang putih, halus,\n3 sdm bawang merah goreng,\n120 ml air es,\n100 gr tepung tapioka,\n1 buah putih telur,\n1 sdm garam,\n1 sdt kaldu jamur,\n1/2 sdt gula,\n1/2 sdt merica.\n\nKuah Bakso:\n\n1 batang bawang pre,\n2 sdm bawang putih goreng,\n2 sdm bawang merah goreng,\nsecukupnya Garam, gula, merica dan kaldu jamur,\nPelengkap:\n\nMie kuning,\nPangsit,\nBihun,\nSambal.\n"
    )

    private val foodPrice = arrayOf("Rp25.000",
        "Rp30.000",
        "Rp15.000",
        "Rp20.000",
        "Rp12.000",
        "Rp30.000",
        "Rp20.000",
        "Rp28.000",
        "Rp20.000",
        "Rp18.000"
    )

    private val foodImages = intArrayOf(
        R.drawable.bebek_panggang,
        R.drawable.rendang2,
        R.drawable.soto_ayam_semarang,
        R.drawable.ayam_geprek,
        R.drawable.mie_ayam_jamur,
        R.drawable.kepiting,
        R.drawable.sayap_ayam_barbecue,
        R.drawable.kerang_saos_padang,
        R.drawable.ikan_laut_bakar,
        R.drawable.bakso_sapi
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