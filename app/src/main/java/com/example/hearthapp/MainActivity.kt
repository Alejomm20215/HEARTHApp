package com.example.hearthapp

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.hearthapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.mainActivity)

        val bg = binding.mainActivity.background as AnimationDrawable
        bg.setEnterFadeDuration(800)
        bg.setExitFadeDuration(1700)
        bg.start()

        val anButton: Button = findViewById(R.id.data_cont)


        anButton.setOnClickListener {
            val intent = Intent(this, UserScreenHome::class.java)
            startActivity(intent)
        }
    }
}