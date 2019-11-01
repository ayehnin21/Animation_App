package com.coder.mm.annimationproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.coder.mm.annimationproject.helper.H
import kotlinx.android.synthetic.main.activity_zoom_in.*

class ZoomInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zoom_in)
        H.showAni(this@ZoomInActivity,R.anim.zoom_in_ani,imgZooInAni)

    }
}
