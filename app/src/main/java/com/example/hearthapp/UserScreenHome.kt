package com.example.hearthapp

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.AnimationUtils
import androidx.appcompat.R.id.home
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.example.hearthapp.databinding.ActivityUserScreenHomeBinding

class UserScreenHome : AppCompatActivity() {

    private lateinit var binding: ActivityUserScreenHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserScreenHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Home())

        val containerNav = binding.actionMenuView
        
        // Fab button Listener
            // System Color change
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.navigationBarColor = this.resources.getColor(R.color.violet_clear)



        //Bottom bar color change
        binding.actionMenuView.setOnItemSelectedListener {

            when (it.itemId) {
                home -> {
                    replaceFragment(Home())
                    window.navigationBarColor = this.resources.getColor(R.color.violet_clear)
                    containerNav.background = resources.getDrawable(R.drawable.menu_action_1)
                }

                R.id.analysis -> {
                    replaceFragment(Analysis())
                    window.navigationBarColor = this.resources.getColor(R.color.yellow_jo)
                    containerNav.background = resources.getDrawable(R.drawable.menu_action_2)
                }


                R.id.resources -> {
                    replaceFragment(Resources())
                    window.navigationBarColor = this.resources.getColor(R.color.melocoton_clear)
                    containerNav.background = resources.getDrawable(R.drawable.menu_action_3)
                }

                else -> {

                }
            }
            true
        }

    }
    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }

}