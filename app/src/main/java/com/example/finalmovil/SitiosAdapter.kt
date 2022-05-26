package com.example.finalmovil

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SitiosAdapter(val sitios:List<List<String>>):RecyclerView.Adapter<SitiosViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SitiosViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SitiosViewHolder(layoutInflater.inflate(R.layout.sitios_dog, parent, false))
    }
    override fun getItemCount(): Int = sitios.size
    override fun onBindViewHolder(holder: SitiosViewHolder, position: Int) {
        val item = sitios[position]
        holder.bind(item)
    }
}