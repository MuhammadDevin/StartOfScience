package com.raywenderlich.android.starsofscience

import android.graphics.Canvas
import android.graphics.Paint
import androidx.annotation.ColorInt
import com.raywenderlich.android.starsofscience.utils.RectFFactory

class ProfileCardPainter(
    @ColorInt private val color: Int,
    private  val avatarRadius: Float
) : Painter {
    override fun paint (canvas : Canvas){
        val width = canvas.width.toFloat()
        val height = canvas.height.toFloat()
        //2
        val shapeBounds = RectFFactory.fromLTWH( 0f , 0f , width, height)
        //3
        val paint = Paint()
        paint.color = color //4
        canvas.drawRect(shapeBounds, paint)
    }
}