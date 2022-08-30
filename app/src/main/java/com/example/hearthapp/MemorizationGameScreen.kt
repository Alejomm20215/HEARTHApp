package com.example.hearthapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hearthapp.databinding.ActivityMemorizationGameScreenBinding
import com.example.hearthapp.databinding.ActivityPuzzlesInstructionsBinding
import com.example.hearthapp.memorizationGame.MainMemorization
import com.example.hearthapp.memorizationGame.MemorizationInstructions
import kotlinx.android.synthetic.main.activity_memorization_game_screen.*

class MemorizationGameScreen : AppCompatActivity() {
   lateinit var binding: ActivityMemorizationGameScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityMemorizationGameScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.playButtonPuzzle2.setOnClickListener {
            intent =  Intent(this, MainMemorization::class.java)
            startActivity(intent)
        }
        binding.backHomeButton3.setOnClickListener {
            intent = Intent(this, GamesScreen::class.java)
            startActivity(intent)
        }
        binding.InstructionsMemory.setOnClickListener {
            intent = Intent(this, MemorizationInstructions::class.java)
            startActivity(intent)
        }
    }
}