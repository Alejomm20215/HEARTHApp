package com.example.hearthapp.numsfordumbs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hearthapp.GamesScreen
import com.example.hearthapp.R
import com.example.hearthapp.databinding.ActivityNfdscreenBinding

class NFDScreenActivity : AppCompatActivity() {
    lateinit var binding :  ActivityNfdscreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityNfdscreenBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.backButtonSFD.setOnClickListener {
            intent = Intent(this, GamesScreen::class.java)
            startActivity(intent)
        }
        binding.instructionsnfd.setOnClickListener {
            intent = Intent(this, InstructionsNFD::class.java)
            startActivity(intent)
        }
        binding.playButtonPuzzle3.setOnClickListener {
            intent =  Intent(this, NumsFDMain::class.java)
            startActivity(intent)
        }
    }
}