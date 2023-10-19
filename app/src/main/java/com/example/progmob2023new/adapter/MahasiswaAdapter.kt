package com.example.progmob2023new.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.PopupMenu
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.progmob2023new.R

abstract class MahasiswaAdapter(private val mahasiswaList: List<Mahasiswa>, private val context: Context) : RecyclerView.Adapter<MahasiswaAdapter.ViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_mahasiswa, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val mahasiswa = mahasiswaList[position]

            // Bind data to the ViewHolder

            holder.itemView.setOnLongClickListener { view ->
                val popupMenu = PopupMenu(context, view)
                popupMenu.menuInflater.inflate(R.menu.context_menu, popupMenu.menu)
                popupMenu.setOnMenuItemClickListener { item ->
                    when (item.itemId) {
                        R.id.menu_delete -> {
                            // Handle the delete action here
                            // Hapus data mahasiswa dari sumber data
                            // notifyDataSetChanged() untuk memberi tahu adapter bahwa data berubah
                            return@setOnMenuItemClickListener true
                        }
                    }
                    false
                }
                popupMenu.show()
                true
            }
        }

        // ...
    }

}