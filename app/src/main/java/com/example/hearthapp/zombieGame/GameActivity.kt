package com.example.hearthapp.zombieGame

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.hearthapp.Instructions
import com.example.hearthapp.R
import com.example.hearthapp.databinding.ActivityGameBinding

class GameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.instructionsButton.setOnClickListener {
            intent = Intent(this, Instructions::class.java)
            startActivity(intent)
        }

            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.navigationBarColor = this.resources.getColor(R.color.blue_dark)
            window.statusBarColor = this.resources.getColor(R.color.blue_dark)

        }
    }
