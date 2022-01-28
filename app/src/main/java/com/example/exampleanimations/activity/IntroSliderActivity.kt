package com.example.exampleanimations.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.airbnb.lottie.LottieAnimationView
import com.example.exampleanimations.R
import com.example.exampleanimations.adapter.ViewPagerAdapter
import com.example.exampleanimations.fragment.PagerFragment
import com.example.exampleanimations.model.PagerInfo
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator
import java.io.InputStream

class IntroSliderActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager
    private lateinit var pagerAdapter: ViewPagerAdapter
    private lateinit var lottieAnim: LottieAnimationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_slider)

        initViews()

    }

    private fun initViews() {
        lottieAnim = findViewById(R.id.lottie_animation)

        lottieAnim.setAnimation("telegram.json")
        lottieAnim.playAnimation()

        viewPager = findViewById(R.id.view_pager)
        pagerAdapter = ViewPagerAdapter(supportFragmentManager)

        addAllFragments()
        viewPager.adapter = pagerAdapter

        changeAnimations()

        val indicator = findViewById<DotsIndicator>(R.id.dots_indicator)
        indicator.setViewPager(viewPager)

    }


    private fun changeAnimations() {
        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {
                when (position) {
                    1 -> {
                        lottieAnim.setAnimation("fast.json")
                        lottieAnim.playAnimation()
                    }
                    2 -> {
                        lottieAnim.setAnimation("free.json")
                        lottieAnim.playAnimation()
                    }
                    3 -> {
                        lottieAnim.setAnimation("powerful.json")
                        lottieAnim.playAnimation()
                    }
                    4 -> {
                        lottieAnim.setAnimation("secure.json")
                        lottieAnim.playAnimation()
                    }
                    5 -> {
                        lottieAnim.setAnimation("cloud.json")
                        lottieAnim.playAnimation()
                    }
                    else -> {
                        lottieAnim.setAnimation("telegram.json")
                        lottieAnim.playAnimation()
                    }
                }
            }

            override fun onPageScrollStateChanged(state: Int) {

            }
        })

    }


    private fun addAllFragments() {
        pagerAdapter.addFragment(
            PagerFragment().newInstance(
                PagerInfo(
                    "Telegram X",
                    "The world`s fastest messaging app. it is free and secure."
                )
            )
        )
        pagerAdapter.addFragment(
            PagerFragment().newInstance(
                PagerInfo(
                    "Fast",
                    "Telegram delivers messages faster than any other application."
                )
            )
        )
        pagerAdapter.addFragment(
            PagerFragment().newInstance(
                PagerInfo(
                    "Free",
                    "Telegram is free forever. No ads. No subscription fees."
                )
            )
        )
        pagerAdapter.addFragment(
            PagerFragment().newInstance(
                PagerInfo(
                    "Powerful",
                    "Telegram has no limits on the size of your media and chats."
                )
            )
        )
        pagerAdapter.addFragment(
            PagerFragment().newInstance(
                PagerInfo(
                    "Secure",
                    "Telegram keeps your messages safe from hacker attacks."
                )
            )
        )
        pagerAdapter.addFragment(
            PagerFragment().newInstance(
                PagerInfo(
                    "Cloud-Based",
                    "Telegram lets you access your messages from multiple devices."
                )
            )
        )
    }

}

