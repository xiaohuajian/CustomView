package com.example.customviewbasic.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import com.example.customviewbasic.R

class ColorView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
    : View(context, attrs, defStyleAttr)  {

    val paint : Paint = Paint()

    init {
        paint.isAntiAlias = true
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        /**
         * 有三种画color的方法，这个颜色针对的是 canvas 画布而言——背景色。
         *
         */
        //canvas?.drawColor(context.resources.getColor(R.color.colorAccent))
        canvas?.drawARGB(10, 10, 0xF , 0x1A )
        //canvas?.drawRGB()
        paint.color = context.resources.getColor(R.color.colorAccent)
        canvas?.drawCircle(200F, 300F, 40F, paint)

        //画其他的⚪，修改画笔属性，修改颜色、
        paint.color =  context.resources.getColor(R.color.colorPrimary)
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 10F
        canvas?.drawCircle(100F, 200F, 60F, paint)

        paint.color =  context.resources.getColor(R.color.colorPrimaryDark)
        paint.style = Paint.Style.FILL_AND_STROKE
        paint.strokeWidth = 10F

        canvas?.drawCircle(300F, 300F, 50F, paint)
    }




}