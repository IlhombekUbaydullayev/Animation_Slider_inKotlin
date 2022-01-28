package com.example.exampleanimations.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.exampleanimations.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    private fun initViews() {
        val btnTypingAnim = findViewById<Button>(R.id.btn_typing_animation)
        val btnIntroSlider = findViewById<Button>(R.id.btn_taskTelegram_animation)

        btnTypingAnim.setOnClickListener {
            openTypingAnimActivity()
        }

        btnIntroSlider.setOnClickListener {
            openIntroSliderActivity()
        }
    }


    private fun openTypingAnimActivity() {
        val intent = Intent(this, TypingAnimActivity::class.java)
        startActivity(intent)
    }

    private fun openIntroSliderActivity() {
        val intent = Intent(this, IntroSliderActivity::class.java)
        startActivity(intent)
    }

}