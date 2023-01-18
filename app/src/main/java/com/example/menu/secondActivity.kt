package com.example.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.SearchEvent
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import androidx.core.view.GravityCompat
import androidx.core.view.children
import com.example.menu.databinding.ActivitySecondBinding

class secondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        binding.apply {
            true
        openCatalog.setOnClickListener {
            drawer.openDrawer(GravityCompat.START)
            }

        }
    }

    fun myMenu(item: MenuItem) {
        val menuIntent = Intent(this@secondActivity,threeActivity::class.java)
        startActivity(menuIntent)
    }
    fun myBasket(item: MenuItem){
        val basketIntent = Intent(this@secondActivity,fourActivity::class.java)
        startActivity(basketIntent)
    }
    fun myAbout(item: MenuItem){
        val aboutIntent = Intent(this@secondActivity,fiveActivity::class.java)
        startActivity(aboutIntent)
    }
    fun myFaq(item: MenuItem) {
        val faqIntent = Intent(this@secondActivity, sevenActivity::class.java)
        startActivity(faqIntent)
    }
}