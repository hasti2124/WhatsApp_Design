package com.example.whatsapp_design.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsapp_design.Adapter.ChatsAdapter
import com.example.whatsapp_design.Models.ProfileModel
import com.example.whatsapp_design.R.drawable.*
import com.example.whatsapp_design.databinding.FragmentChatBinding


class ChatFragment : Fragment() {

    var list = ArrayList<ProfileModel>()
    var profiles = arrayOf(picture1,picture2, picture3,picture4, picture5, picture6, picture7, picture8, picture9, picture10,picture11, picture12, picture13, picture14, picture15, picture16, picture17, picture18, picture19, picture20)
    var name = arrayOf("Riya","Vishwa","Yesha","Nency","Nemisha","Prinesha","Asha","Aesha","Shreya","Darshita","Jemisha","Bansi","Mansavi","Gopi","Janvi","Dikshita","Jensi","Yeshvi","Zisha","Zinta")

    lateinit var binding: FragmentChatBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentChatBinding.inflate(layoutInflater)

        for(x in 0..profiles.size-1){
            var model = ProfileModel(name[x],profiles[x])
            list.add(model)
        }

        binding.rcvChats.layoutManager = LinearLayoutManager(context)
        binding.rcvChats.adapter = ChatsAdapter(list)

        return binding.root
    }
}