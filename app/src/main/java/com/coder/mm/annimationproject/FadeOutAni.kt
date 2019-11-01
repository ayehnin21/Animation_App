package com.coder.mm.annimationproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_fade_out_ani.*

class FadeOutAni : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fade_out_ani)
        val ani = AnimationUtils.loadAnimation(this, R.anim.fade_out_ani)
        imgFadeOutAni.animation = ani

    }
}
