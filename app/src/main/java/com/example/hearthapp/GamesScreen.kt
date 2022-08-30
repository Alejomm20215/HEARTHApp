package com.example.hearthapp

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.hearthapp.puzzles.PuzzlesMain
import com.example.hearthapp.databinding.ActivityGamesScreenBinding
import com.example.hearthapp.numsfordumbs.NFDScreenActivity
import com.example.hearthapp.numsfordumbs.NumsFDMain
import com.example.hearthapp.puzzles.ScreenGamePuzzle
import com.example.hearthapp.zombieGame.GameActivity

class GamesScreen : AppCompatActivity() {

    lateinit var binding: ActivityGamesScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGamesScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val window = this.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.navigationBarColor = this.resources.getColor(R.color.bg_col_games)

        binding.sdg3Btn3.setOnClickListener {
            intent = Intent(this, UserScreenHome::class.java)
            startActivity(intent)
        }
        binding.siPuzzle.setOnClickListener {
            intent = Intent(this, ScreenGamePuzzle::class.java)
            startActivity(intent)
        }
        binding.digitalMemory.setOnClickListener {
            intent = Intent(this, MemorizationGameScreen::class.java)
            startActivity(intent)
        }
        binding.numsForDumbs.setOnClickListener {
            intent = Intent(this, NFDScreenActivity::class.java)
            startActivity(intent)
        }
    }
}