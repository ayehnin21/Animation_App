package com.coder.mm.annimationproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_rotate_ani.*

class RotateAni : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rotate_ani)
        //imgRotateAni
        val ani= AnimationUtils.loadAnimation(this,R.anim.rotate_ani)
        imgRotateAni.animation=ani

    }
}
