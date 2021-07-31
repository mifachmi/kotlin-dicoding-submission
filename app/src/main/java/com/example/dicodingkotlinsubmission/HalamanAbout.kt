package com.example.dicodingkotlinsubmission

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import com.google.android.material.button.MaterialButton

class HalamanAbout : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnBack: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_about)

        supportActionBar?.setTitle("")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24)
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#FFC300")))

//        btnBack = findViewById(R.id.image_back)
//        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24)
//        btnBack.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
//        Toast.makeText(this,"Kembali ke Halaman Utama", Toast.LENGTH_SHORT).show()
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//        when(v?.id) {
//            R.id.image_back -> {
//                Toast.makeText(this,"Kembali ke Halaman Utama", Toast.LENGTH_SHORT).show()
//                supportActionBar?.setDisplayHomeAsUpEnabled(true)
//                supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24)
//            }
//        }
    }
}
