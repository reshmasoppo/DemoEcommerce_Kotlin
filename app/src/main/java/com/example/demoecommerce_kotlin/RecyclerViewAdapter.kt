package com.example.demoecommerce_kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(val userlist:ArrayList<User>):RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int
    ): RecyclerViewAdapter.ViewHolder {
        val v=LayoutInflater.from(parent.context).inflate(R.layout.banner_layout,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return userlist.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user1: User=userlist[position]

        holder.textname.text=user1.Name

        holder.image.setImageResource(user1.Image)

    }
    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView)
    {

        val image=itemView.findViewById<ImageView>(R.id.imageView_card)
        val textname=itemView.findViewById<TextView>(R.id.textView_card)


    }
}