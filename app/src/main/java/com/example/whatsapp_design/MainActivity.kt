package com.example.whatsapp_design

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.Toast
import com.example.whatsapp_design.Adapter.WhatsAdapter
import com.example.whatsapp_design.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var adapter = WhatsAdapter(supportFragmentManager)
        binding.viewpage.adapter = adapter

        binding.tabs.setupWithViewPager(binding.viewpage)

        var image = findViewById<ImageView>(R.id.imgmore)
        image.setOnClickListener {
            var popupMenu = PopupMenu(this,image)
            popupMenu.menuInflater.inflate(R.menu.popup_item,popupMenu.menu)

            popupMenu.show()
        }
    }
}