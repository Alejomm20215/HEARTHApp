package com.example.hearthapp.puzzles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.hearthapp.GamesScreen
import com.example.hearthapp.PuzzlesInstructions
import com.example.hearthapp.R
import com.example.hearthapp.databinding.ActivityScreenGamePuzzleBinding

class ScreenGamePuzzle : AppCompatActivity() {
    private lateinit var binding: ActivityScreenGamePuzzleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityScreenGamePuzzleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val window = this.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.navigationBarColor = this.resources.getColor(R.color.melocoton_clear)

        binding.playButtonPuzzle.setOnClickListener {
            intent = Intent(this, PuzzlesMain::class.java)
            startActivity(intent)
        }
        binding.instructionsButtonPuzzle.setOnClickListener {
            intent =  Intent(this, PuzzlesInstructions::class.java)
            startActivity(intent)
        }
        binding.backHomeButton.setOnClickListener {
            intent = Intent(this, GamesScreen::class.java)
            startActivity(intent)
        }
    }
}