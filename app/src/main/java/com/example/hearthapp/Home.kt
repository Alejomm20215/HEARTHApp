package com.example.hearthapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hearthapp.chatbot.MainChatBot
import com.example.hearthapp.databinding.FragmentHomeBinding
import com.example.hearthapp.infrastructure.Mock
import com.example.hearthapp.infrastructure.MotivationConstants

class Home : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private var categoryId = MotivationConstants.FILTER.ALL

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val bind = FragmentHomeBinding.inflate(layoutInflater)
        bind.playButton.setOnClickListener {
            val intent = Intent(this@Home.requireContext(), GamesScreen::class.java)
            startActivity(intent)
        }

        bind.talktomonn.setOnClickListener {
            val intent = Intent(this@Home.requireContext(), MainChatBot::class.java)
            startActivity(intent)
        }
        bind.phrase.setOnClickListener {
            bind.phrase.text = Mock().getPhrase(categoryId)
        }
        return bind.root

    }

}