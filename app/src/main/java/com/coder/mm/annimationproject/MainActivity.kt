package com.coder.mm.annimationproject


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.coder.mm.annimationproject.helper.H.goActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGoToBounceAni.setOnClickListener {
           goActivity(this@MainActivity,BounceActivity())
        }
        btnGoToScale.setOnClickListener {
            goActivity(this@MainActivity,ScaleAniActivity())
        }
        btngoAnimations.setOnClickListener {
            goActivity(this@MainActivity,Animations())
        }
    }



}
