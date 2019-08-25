package com.example.teststs

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.teststs.data.Item

class ItemsAdapter(private val data: List<Item>?, private var listener: AdapterInteractionInterface) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    interface AdapterInteractionInterface {
        fun clickListener(details: Item)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(viewGroup.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item, viewGroup, false))
    }

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, i: Int) {
        val viewHolder1 = viewHolder as ViewHolder
        viewHolder1.tvName.text = data!![i].collectDataForName()
        viewHolder1.itemView.setOnClickListener { listener.clickListener(data[i]) }
    }

    override fun getItemCount(): Int {
        return data?.size ?: 0
    }

    internal inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var tvName: TextView = view.findViewById(R.id.tvName)
        var tvDetails: TextView = view.findViewById(R.id.tvMoreDetails)

    }

}
