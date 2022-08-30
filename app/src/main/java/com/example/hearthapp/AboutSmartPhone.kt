package com.example.hearthapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AboutSmartPhone : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_smart_phone)
    findViewById<Button>(R.id.backbtnt).setOnClickListener {
        intent =  Intent(this, UserScreenHome::class.java)
        startActivity(intent)
    }


    }
}