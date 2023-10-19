package com.example.progmob2023new.adapter

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import com.example.progmob2023new.model.Mahasiswa
import android.view.ViewGroup
import android.view.View
import androidx.appcompat.view.menu.MenuView.ItemView

class PostAdapter(private val list: ArrayList<Mahasiswa>): RecyclerView.Adapter<PostAdapter.PostViewHolder>()
{
inner class PostViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
    val view: LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        return PostViewHolder()
    }

    override fun getItemCount(): Int {

    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {

    }

}