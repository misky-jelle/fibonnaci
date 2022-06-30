package com.Misky.assigment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.misky.assignment.R

class Numbers_list(var nameList: List<Int>):RecyclerView.Adapter<NumberViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(
            R.layout.mainresource,parent,
            false)
        return NumberViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.tvNumbers.text=nameList.get(position).toString()
    }
    override fun getItemCount(): Int {
        return nameList.size
    }
}
class NumberViewHolder(itemview: View):RecyclerView.ViewHolder(itemview) {
    var tvNumbers = itemview.findViewById<TextView>(R.id.tvNumbers)
}

