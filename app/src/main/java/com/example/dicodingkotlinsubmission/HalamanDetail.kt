package com.example.dicodingkotlinsubmission

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class HalamanDetail : AppCompatActivity(), View.OnClickListener {

    private lateinit var colorDrawable: ColorDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_detail)

        supportActionBar?.setTitle("")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#FFC300")))

        val nama: TextView = findViewById(R.id.nama_menu_detail)
        val harga: TextView = findViewById(R.id.harga_detail)
        val deskripsi: TextView = findViewById(R.id.deskripsi_detail)
        val foto: ImageView = findViewById(R.id.foto_detail)
        val btnKeranjang: Button = findViewById(R.id.btn_keranjang)
        btnKeranjang.setOnClickListener(this)

        var intentDenganData = intent
        val menuName = intentDenganData.getStringExtra("namaMenu")
        val menuDescription = intentDenganData.getStringExtra("deskripsiMenu")
        val menuPrice = intentDenganData.getStringExtra("hargaMenu")
        val menuPhotos = intentDenganData.getIntExtra("fotoMenu", 0)

        nama.text = menuName
        harga.text = menuPrice
        deskripsi.text = menuDescription
        foto.setImageResource(menuPhotos)
    }

    override fun onClick(v: View?) {
        Toast.makeText(this,"Ditambahkan ke keranjang", Toast.LENGTH_SHORT).show()
    }
}