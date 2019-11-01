package com.coder.mm.annimationproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_slide_up_ani.*

class SlideUpAni : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slide_up_ani)
        val ani = AnimationUtils.loadAnimation(this@SlideUpAni, R.anim.silde_up_ani)
        imgSlideUPAni.animation = ani

    }
}
