package com.anwesh.uiprojects.bicirclestepview

/**
 * Created by anweshmishra on 14/09/18.
 */

import android.view.View
import android.view.MotionEvent
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF
import android.content.Context
import android.graphics.Color

val nodes : Int = 5

fun Canvas.drawBCSNode(i : Int, scale : Float, paint : Paint) {
    val w : Float = width.toFloat()
    val h : Float = height.toFloat()
    val gap : Float = w / (nodes + 1)
    val r : Float = gap / 4
    paint.color = Color.parseColor("#311B92")
    save()
    translate(gap + i * gap, h/2)
    for (j in 0..1) {
        val sc : Float = Math.min(0.5f, Math.max(0f, scale - j * 0.5f)) * 2
        save()
        translate(0f, (h -r) * sc)
        drawArc(RectF(-r, -r , r, r), 180f * j, 180f, true, paint)
        restore()
    }
    restore()
}