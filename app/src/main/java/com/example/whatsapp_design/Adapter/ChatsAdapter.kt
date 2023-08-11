package com.example.whatsapp_design.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.whatsapp_design.Models.ChatsModel
import com.example.whatsapp_design.Models.ProfileModel
import com.example.whatsapp_design.databinding.ChatItemBinding

class ChatsAdapter(private val list: ArrayList<ProfileModel>) : Adapter<ChatsAdapter.ChatsHolder>() {
    class ChatsHolder(itemView: ChatItemBinding) : ViewHolder(itemView.root){
        var binding = itemView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatsHolder {
        var binding = ChatItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ChatsHolder(binding)
    }

    override fun getItemCount(): Int {
        return  list.size
    }

    override fun onBindViewHolder(holder: ChatsHolder, position: Int) {
//        holder.binding.txtName.text = list.get(position).name
//        holder.binding.imgProfile.setImageResource(list.get(position).images)

        holder.binding.apply {
            list.get(position).apply {
                txtName.text = name
                imgProfile.setImageResource(image)
                if(position % 2 == 0){
                    txtCount.visibility = View.GONE
                }
            }
         }
    }
}