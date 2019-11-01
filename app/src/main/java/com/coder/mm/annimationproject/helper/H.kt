package com.coder.mm.annimationproject.helper

import android.app.Activity
import android.content.Context
import android.content.Intent

object H {
    fun goActivity(context: Context, act: Activity){
        val i=Intent(context, act::class.java)
        context.startActivity(i)
    }
}