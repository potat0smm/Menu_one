package com.example.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.menu.databinding.ActivityThreeBinding

class threeActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityThreeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityThreeBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

    }
}