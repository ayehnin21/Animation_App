package com.coder.mm.annimationproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_zoo_out_ani.*

class ZooOutAni : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zoo_out_ani)
        val ani=AnimationUtils.loadAnimation(this@ZooOutAni,R.anim.zoom_out_ani)
        imgZoomOut.animation=ani

    }
}
