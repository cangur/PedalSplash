package com.discounttrack.pedalsplash

import android.animation.ObjectAnimator
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.LinearLayout


class MainActivity : AppCompatActivity() {

    private lateinit var l1: LinearLayout
    private lateinit var l2: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initEvent()
    }

    private fun initEvent() {
        val uptodown: Animation = AnimationUtils.loadAnimation(this, R.anim.uptodown)
        val downtoup: Animation = AnimationUtils.loadAnimation(this, R.anim.downtoup)

        l1 = findViewById(R.id.l1)
        l2 = findViewById(R.id.l2)
        //l1.animation = uptodown

        l2.animation = downtoup

        val downIt = ObjectAnimator.ofFloat(l1, "translationY", 1800f, 40f)
        downIt.duration = 4000
        downIt.start()
    }
}
