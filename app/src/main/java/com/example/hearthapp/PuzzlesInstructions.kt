package com.example.hearthapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.animation.core.infiniteRepeatable
import com.example.hearthapp.databinding.ActivityPuzzlesInstructionsBinding
import com.example.hearthapp.puzzles.ScreenGamePuzzle

class PuzzlesInstructions : AppCompatActivity() {
    lateinit var binding : ActivityPuzzlesInstructionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPuzzlesInstructionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButtonSFD.setOnClickListener {
            intent = Intent(this, ScreenGamePuzzle::class.java)
            startActivity(intent)
        }
    }
}