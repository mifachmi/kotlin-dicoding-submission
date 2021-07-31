package com.example.dicodingkotlinsubmission

object DataMenu {
    private val namaMenu = arrayOf(
        "Nasi Goreng Seafood Spesial",
        "Nasi Pecel Pincuk",
        "Nasi Rawon Setan",
        "Batagor Bandung",
        "Cimol",
        "Air Mineral",
        "Aneka Jus",
        "Es Cincau",
        "Es Dawet",
        "Sop Durian"
    )

    private val detailMenu = arrayOf(
        "Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng, margarin, atau mentega. Biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya; seperti telur, ayam, dan kerupuk.",
        "Pecel atau pecal (Hanacaraka: ꦥꦼꦕꦼꦭ꧀) merupakan makanan yang dikombinasikan dengan bumbu sambal kacang sebagai bahan utamanya dan dicampur dengan aneka jenis sayuran. Makanan ini populer terutama di wilayah DI Yogyakarta, Jawa Tengah, dan Jawa Timur.",
        "Rawon adalah masakan Indonesia berupa sup daging berkuah hitam sebagai campuran bumbu khas yang mengandung kluwek. Rawon, meskipun dikenal sebagai masakan khas Jawa Timur, dikenal pula oleh masyarakat Jawa Tengah sebelah timur.",
        "Batagor merupakan nama makanan dari singkatan bakso, tahu, dan goreng. Makanan khas Sunda ini adalah adaptasi dari hidangan Tionghoa-Indonesia. Jenis yang paling dikenal luas adalah batagor Bandung. Batagor terdiri dari adonan bakso ikan tenggiri yang diisi ke dalam tahu dan kulit pangsit, kemudian digoreng.",
        "Cimol merupakan salah satu jajanan yang berbahan dasar tepung kanji. Jajanan dengan bahan dasar tepung aci atau tepung kanji memang cukup fenomenal. Hanya dengan bahan-bahan yang sederhana, jajanan seperti cilok, cimol, dan cireng memiliki banyak penggemar dari seantero nusantara.",
        "Air mineral merupakan air yang telah dilengkapi dengan kandungan mineral dan senyawa alami lain di dalamnya. Tidak semua sumber air dapat menghasilkan air mineral. Air mineral hanya bisa didapatkan dari sumber air yang terletak di daerah yang kaya akan mineral.",
        "Sari buah atau jus (fruit juice) adalah cairan yang terdapat secara alami dalam buah-buahan. Sari buah populer dikonsumsi manusia sebagai minuman. Sari buah merupakan hasil pengepresan, penghancuran atau ekstraksi buah segar yang telah masak melalui proses penyaringan.",
        "Es cincau adalah sejenis minuman penyegar dengan bahan utama gel yang mirip agar-agar yang dikenal sebagai cincau. Potongan cincau ditambah dengan sirup, santan (atau susu) dan es serut sehingga menjadi minuman penyegar.",
        "Dawet merupakan minuman khas Jawa yang terbuat dari tepung beras ataupun tepung beras ketan, disajikan dengan es parut serta gula merah cair dan santan. Rasa minuman ini manis dan gurih.",
        "Es durian ini diracik dengan cara mangkuk diberi isian atau langsung diberi es serut dan sedikit sirop merah. Es kemudian diratakan hingga permukaannya datar. Barulah disiram durian halus dan dikucuri susu kental manis cokelat. Kalau dilihat selintas penampilannya sama."
    )

    private val hargaMenu = doubleArrayOf(
        20000.0,
        18000.0,
        15000.0,
        10000.0,
        7000.0,
        5000.0,
        8000.0,
        12000.0,
        12000.0,
        15000.0
    )

    private val fotoMenu = intArrayOf(
        R.drawable.nasi_goreng,
        R.drawable.nasi_pecel,
        R.drawable.nasi_rawon,
        R.drawable.batagor,
        R.drawable.cimol,
        R.drawable.air_mineral,
        R.drawable.aneka_jus,
        R.drawable.es_cincau,
        R.drawable.es_dawet,
        R.drawable.sop_durian
    )

    val listData: ArrayList<Menu>
        get() {
            val list = arrayListOf<Menu>()
            for (position in namaMenu.indices) {
                val menuResto = Menu()
                menuResto.menuName = namaMenu[position]
                menuResto.detailMenu = detailMenu[position]
                menuResto.menuPrice = hargaMenu[position]
                menuResto.menuPhotos = fotoMenu[position]
                list.add(menuResto)
            }
            return list
        }
}