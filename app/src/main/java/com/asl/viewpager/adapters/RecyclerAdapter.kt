package com.asl.viewpager.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.asl.viewpager.data.DataHolder
import com.asl.viewpager.R

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemId.text = "${position+1})"
        holder.itemName.text =  DataHolder.Persons[position].firstName + " " + DataHolder.Persons[position].lastName
    }

    override fun getItemCount(): Int = DataHolder.Persons.size



    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemId : TextView
        var itemName : TextView

        init{
            itemId = itemView.findViewById(R.id.person_id)
            itemName = itemView.findViewById(R.id.person_name)
        }
    }
}