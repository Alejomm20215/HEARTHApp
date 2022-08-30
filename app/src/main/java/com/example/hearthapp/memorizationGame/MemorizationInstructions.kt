package com.example.hearthapp.memorizationGame

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hearthapp.MemorizationGameScreen
import com.example.hearthapp.databinding.ActivityMemorizationInstructionsBinding

class MemorizationInstructions : AppCompatActivity() {
    lateinit var binding: ActivityMemorizationInstructionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityMemorizationInstructionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButtonSFD.setOnClickListener {
            intent =  Intent(this, MemorizationGameScreen::class.java)
            startActivity(intent)
        }
    }
}