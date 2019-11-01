package com.coder.mm.annimationproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.coder.mm.annimationproject.helper.H
import kotlinx.android.synthetic.main.activity_zoo_out_ani.*

class ZooOutAni : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zoo_out_ani)
        H.showAni(this@ZooOutAni,R.anim.zoom_out_ani, imgZoomOut)

    }
}
