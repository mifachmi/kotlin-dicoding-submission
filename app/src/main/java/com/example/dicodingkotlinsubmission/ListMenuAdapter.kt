package com.example.dicodingkotlinsubmission

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListMenuAdapter(private val listMenu: ArrayList<Menu>) : RecyclerView.Adapter<ListMenuAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var menuName: TextView = itemView.findViewById(R.id.rv_nama_menu)
        var deskripsiMenu: TextView = itemView.findViewById(R.id.rv_deskripsi_menu)
        var hargaMenu: TextView = itemView.findViewById(R.id.rv_harga_menu)
        var fotoMenu: ImageView = itemView.findViewById(R.id.rv_foto_menu)
        var btnFavorite: Button = itemView.findViewById(R.id.btn_favorite)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_of_menu, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val listOfMenu = listMenu[position]

        Glide.with(holder.itemView.context)
            .load(listOfMenu.menuPhotos)
            .apply(RequestOptions().override(500, 500))
            .into(holder.fotoMenu)

        holder.menuName.text = listOfMenu.menuName
        holder.deskripsiMenu.text = listOfMenu.detailMenu
        holder.hargaMenu.text = listOfMenu.menuPrice.toInt().toString()
        holder.btnFavorite.setOnClickListener{
            Toast.makeText(holder.itemView.context,"Ditambahkan ke Favorite", Toast.LENGTH_SHORT).show()
        }
        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Kamu memilih " + listMenu[position].menuName, Toast.LENGTH_SHORT).show()
        }
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listMenu[holder.absoluteAdapterPosition]) }
        holder.itemView.setOnClickListener{
            val eachMenu = listMenu.get(position)

            var detailNamaMenu: String = eachMenu.menuName
            var detailDeskripsiMenu: String = eachMenu.detailMenu
            var detailHargaMenu: String = eachMenu.menuPrice.toInt().toString()
            var detailFotoMenu: Int = eachMenu.menuPhotos

            val intentDetail = Intent(holder.itemView.context, HalamanDetail::class.java)

            intentDetail.putExtra("namaMenu", detailNamaMenu)
            intentDetail.putExtra("deskripsiMenu", detailDeskripsiMenu)
            intentDetail.putExtra("hargaMenu", detailHargaMenu)
            intentDetail.putExtra("fotoMenu", detailFotoMenu)

            holder.itemView.context.startActivity(intentDetail)
        }
    }

    override fun getItemCount(): Int {
        return listMenu.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Menu)
    }
}


