package com.example.whatsapp_design.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.whatsapp_design.Fragment.CallsFragment
import com.example.whatsapp_design.Fragment.ChatFragment
import com.example.whatsapp_design.Fragment.StatusFragment

class WhatsAdapter(fm : FragmentManager): FragmentPagerAdapter(fm) {

    var fragment = arrayOf(ChatFragment(),StatusFragment(),CallsFragment())
    var title = arrayOf("Chats","Status","Calls")
    override fun getCount(): Int {
        return  fragment.size
    }

    override fun getItem(position: Int): Fragment {
        return fragment[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return title[position]
    }
}