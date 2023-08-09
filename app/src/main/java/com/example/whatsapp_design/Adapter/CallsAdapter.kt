package com.example.whatsapp_design.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.whatsapp_design.Models.CallsModel
import com.example.whatsapp_design.Models.ProfileModel
import com.example.whatsapp_design.databinding.CallsItemBinding

class CallsAdapter(private val list: ArrayList<ProfileModel>) : Adapter<CallsAdapter.CallsHolder>() {
    class CallsHolder(itemView: CallsItemBinding) : ViewHolder(itemView.root){
        var binding = itemView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CallsHolder {
        var binding = CallsItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CallsHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: CallsHolder, position: Int) {
        holder.binding.txtCalls.text = list.get(position).name
        holder.binding.imgCalls.setImageResource(list.get(position).image)
    }
}