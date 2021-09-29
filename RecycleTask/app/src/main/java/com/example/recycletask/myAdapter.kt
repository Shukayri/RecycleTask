package com.example.recycletask

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.sceond_lay.view.*

class myAdapter(private val context: Context, private val messages: ArrayList<String>):
    RecyclerView.Adapter<myAdapter.ItemViewHolder>() {
    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.sceond_lay,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val names = messages[position]

        holder.itemView.apply {
            TextView.text = names

        }
    }

    override fun getItemCount() = messages.size
}