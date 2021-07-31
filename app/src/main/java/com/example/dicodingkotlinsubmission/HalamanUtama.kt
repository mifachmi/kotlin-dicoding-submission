package com.example.dicodingkotlinsubmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HalamanUtama : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnAbout: Button
    private lateinit var rvMenu: RecyclerView
    private lateinit var rvMenuContainer: RecyclerView
    private var list: ArrayList<Menu> = arrayListOf()
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_utama)

        val title = "Cafe Sejenak"
        setTitle(title)

        Toast.makeText(this, "Selamat Datang", Toast.LENGTH_SHORT).show()

        btnAbout = findViewById(R.id.btn_aboutme)
        btnAbout.setOnClickListener(this)

        rvMenu = findViewById(R.id.list_of_menu)
        rvMenu.setHasFixedSize(true)

        list.addAll(DataMenu.listData)
        showRecycleList()

        rvMenu.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))

//        rvMenuContainer = findViewById(R.id.menu_container)
//        rvMenuContainer.setOnClickListener(this)
    }

    private fun showRecycleList() {
        rvMenu.layoutManager = LinearLayoutManager(this)
        val listMenuAdapter = ListMenuAdapter(list)
        rvMenu.adapter = listMenuAdapter

        listMenuAdapter.setOnItemClickCallback(object : ListMenuAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Menu) {
                showSelectedMenu(data)
            }
        })
    }

    private fun showSelectedMenu(menu: Menu) {
        Toast.makeText(this, "Kamu memilih " + menu.menuName, Toast.LENGTH_SHORT).show()
    }

    override fun onClick(v: View?) {
//        Toast.makeText(this,"Button About Me Ditekan", Toast.LENGTH_SHORT).show()

        when(v?.id) {
            R.id.btn_aboutme -> {
                val moveToAboutMe = Intent(this, HalamanAbout::class.java)
                startActivity(moveToAboutMe)
            }

//            R.id.menu_container -> {
//                val moveToDetailPage = Intent(this, HalamanDetail::class.java)
//                startActivity(moveToDetailPage)
//            }

//            R.id.btn_favorite -> {
//                Toast.makeText(this,"Ditambahkan ke Favorit", Toast.LENGTH_SHORT).show()
//            }

//            R.id.list_of_menu -> {
//                val moveToDetailPage = Intent(this, HalamanDetail::class.java)
//                startActivity(moveToDetailPage)
//            }
        }
    }
}