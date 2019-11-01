package com.coder.mm.annimationproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.coder.mm.annimationproject.helper.H
import kotlinx.android.synthetic.main.activity_fade_out_ani.*

class FadeOutAni : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fade_out_ani)
        H.showAni(this@FadeOutAni, R.anim.fade_out_ani,imgFadeOutAni)
    }
}
