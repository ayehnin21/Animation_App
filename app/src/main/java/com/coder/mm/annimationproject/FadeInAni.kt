package com.coder.mm.annimationproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_fade_in_ani.*

class FadeInAni : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fade_in_ani)
        //imgFadeinAni
        val ani= AnimationUtils.loadAnimation(this,R.anim.fade_in_ani)
        imgFadeinAni.animation=ani

    }
}
