package com.coder.mm.annimationproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_bounce_ani.*

class BounceAni : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bounce_ani)
        //imgBAni
        val ani= AnimationUtils.loadAnimation(this,R.anim.bounce_ani)
        imgBAni.animation=ani
    }
}
