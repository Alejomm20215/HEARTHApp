package com.example.hearthapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hearthapp.databinding.FragmentAnalysisBinding


class Analysis : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bind = FragmentAnalysisBinding.inflate(layoutInflater)
        bind.goals.setOnClickListener {
            val intent = Intent(this@Analysis.requireContext(), AboutSmartPhone::class.java)
            startActivity(intent)

        }
        // Inflate the layout for this fragment
        return  bind.root

    }
}