package com.example.hearthapp.numsfordumbs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hearthapp.R
import com.example.hearthapp.databinding.ActivityInstructionsNfdBinding

class InstructionsNFD : AppCompatActivity() {
    lateinit var binding : ActivityInstructionsNfdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInstructionsNfdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButtonSFD.setOnClickListener {
            intent = Intent(this, NFDScreenActivity::class.java)
            startActivity(intent)
        }
    }
}