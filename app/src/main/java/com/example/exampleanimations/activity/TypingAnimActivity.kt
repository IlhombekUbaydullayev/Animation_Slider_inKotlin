package com.example.exampleanimations.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.example.exampleanimations.R

class TypingAnimActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var ivAnimation: ImageView
    lateinit var animation: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_typing_anim)

        initViews()

    }


    private fun initViews() {
        ivAnimation = findViewById(R.id.iv_for_animation)
    }


    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.b_zoom -> animation = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom)

            R.id.b_rotate -> animation =
                AnimationUtils.loadAnimation(applicationContext, R.anim.rotate)

            R.id.b_fade -> animation = AnimationUtils.loadAnimation(applicationContext, R.anim.fade)

            R.id.b_blink -> animation =
                AnimationUtils.loadAnimation(applicationContext, R.anim.blink)

            R.id.b_move -> animation = AnimationUtils.loadAnimation(applicationContext, R.anim.move)

            R.id.b_slide -> animation =
                AnimationUtils.loadAnimation(applicationContext, R.anim.slide)

            R.id.b_bounce -> animation =
                AnimationUtils.loadAnimation(applicationContext, R.anim.bounce)

            R.id.b_sequential -> animation =
                AnimationUtils.loadAnimation(applicationContext, R.anim.sequential)

            R.id.b_together -> animation =
                AnimationUtils.loadAnimation(applicationContext, R.anim.together)
        }
        ivAnimation.startAnimation(animation)
    }

}