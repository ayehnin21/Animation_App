package com.coder.mm.annimationproject.helper

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.animation.AnimationUtils
import android.widget.ImageView

object H {
    fun goActivity(context: Context, act: Activity){
        val i=Intent(context, act::class.java)
        context.startActivity(i)
    }

    fun showAni(context:Context,i:Int,imgAni: ImageView){

        val ani= AnimationUtils.loadAnimation(context,i)
        imgAni.animation=ani
    }
}