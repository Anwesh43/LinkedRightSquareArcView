package com.example.rightsquarearcview

import android.view.View
import android.view.MotionEvent
import android.graphics.Paint
import android.graphics.Color
import android.graphics.RectF
import android.graphics.Canvas
import android.content.Context
import android.app.Activity

val colors : Array<Int> = arrayOf(
    "#f44336",
    "#673AB7",
    "#00BFA5",
    "#BF360C",
    "#FFAB00"
).map {
    Color.parseColor(it)
}.toTypedArray()
val delay : Long = 20
val parts : Int = 4
val scGap : Float = 0.02f / parts
val strokeFactor : Float = 90f
val sizeFactor : Float = 2.9f
val backColor : Int = Color.parseColor("#BDBDBD")
val rot : Float = 90f
