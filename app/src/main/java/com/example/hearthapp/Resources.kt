package com.example.hearthapp


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hearthapp.databinding.FragmentResourcesBinding
import com.example.hearthapp.resources.*

class Resources : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val bind = FragmentResourcesBinding.inflate(layoutInflater)

        bind.addictionBtn.setOnClickListener {
            val intent = Intent(this@Resources.requireContext(), ResourcesMain::class.java)
            startActivity(intent)
        }
        bind.concentrationBtn.setOnClickListener {
            val intent = Intent(this@Resources.requireContext(), ConcentrationActivity::class.java)
            startActivity(intent)
        }
        bind.adviceBtn.setOnClickListener {
            val intent = Intent(this@Resources.requireContext(), AdvicesActivity::class.java)
            startActivity(intent)
        }
        bind.mindsetBtn.setOnClickListener {
            val intent = Intent(this@Resources.requireContext(), MindSetActivity::class.java)
            startActivity(intent)
        }
        bind.sdg3Btn.setOnClickListener {
            val intent = Intent(this@Resources.requireContext(), BenefitsActivity::class.java)
            startActivity(intent)
        }
        bind.benefitsBtn.setOnClickListener {
            val intent = Intent(this@Resources.requireContext(), SDG3Activity::class.java)
            startActivity(intent)
        }
        return bind.root
    }
}