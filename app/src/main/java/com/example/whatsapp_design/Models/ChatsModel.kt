package com.example.whatsapp_design.Models

import android.media.Image

class ChatsModel {
    var name : String
    var images = 0

    constructor(name : String,images: Int){
        this.name = name
        this.images = images
    }
}