package com.coder.mm.annimationproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.coder.mm.annimationproject.helper.H
import kotlinx.android.synthetic.main.activity_slide_down_ani.*

class SlideDownAni : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slide_down_ani)
        H.showAni(this@SlideDownAni,R.anim.slide_down_ani,imgSlideDown)
    }
}
