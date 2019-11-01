package com.coder.mm.annimationproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_zoom_in.*

class ZoomInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zoom_in)
        val ani=AnimationUtils.loadAnimation(this@ZoomInActivity,R.anim.zoom_in_ani)
        imgZooInAni.animation=ani

    }
}
