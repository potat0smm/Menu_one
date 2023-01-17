package com.example.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import com.example.menu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
    }

    fun goMy(@Suppress("UNUSED_PARAMETER")view: View){
        val text = mBinding.etName.text.toString()
        if(text.length > 4 ){
            val myGoIntent = Intent(this, secondActivity::class.java)
            startActivity(myGoIntent)
        }
        else {
            val myGo = Toast.makeText(this, "Введите больше 5 символов", Toast.LENGTH_SHORT)
            myGo.show()
        }
    }
    fun liteGo (@Suppress("UNUSED_PARAMETER")view: View){
        val liteGoIntent= Intent(this, secondActivity::class.java)
        startActivity(liteGoIntent)
    }
}