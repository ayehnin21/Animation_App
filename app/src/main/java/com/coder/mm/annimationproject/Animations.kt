package com.coder.mm.annimationproject


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.coder.mm.annimationproject.helper.H
import kotlinx.android.synthetic.main.activity_animations.*

class Animations : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animations)
        // val ani=AnimationUtils.loadAnimation(this,R.anim.bounce_ani)

        btnBounceAni.setOnClickListener {
            H.goActivity(this@Animations,BounceAni())
        }
        btnfadeInAni.setOnClickListener {
            H.goActivity(this@Animations,FadeOutAni())
        }

        btnFadeOUtAni.setOnClickListener {
            H.goActivity(this@Animations,FadeOutAni())
        }
        btnRotateAni.setOnClickListener {
            H.goActivity(this@Animations,RotateAni())
        }

        btnSlideUpAni.setOnClickListener {
            H.goActivity(this@Animations,SlideUpAni())
        }
        btnSlideDownAni.setOnClickListener {
            H.goActivity(this@Animations,SlideDownAni())

        }
        btnZooInAni.setOnClickListener {
            H.goActivity(this@Animations,ZoomInActivity())
        }
        btnZoomOutAni.setOnClickListener {
            H.goActivity(this@Animations,ZooOutAni())
        }

    }


}
