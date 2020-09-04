package com.example.customviewbasic.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.util.Log
import android.view.View
import com.example.customviewbasic.R
import com.example.customviewbasic.SizeUtils

class PointView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
    : View(context, attrs, defStyleAttr)  {

    val paint : Paint = Paint()
    private var rect : RectF
    val rectF : RectF
    init {
        paint.isAntiAlias = true
        rect  = RectF(400F, 50F, 700F, 200F)
        rectF  = RectF(300F, 300F, 450F, 450F)
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        Log.d("tag1", "onDraw 执行")
        //canvas?.drawColor(context.resources.getColor(R.color.colorAccent))
        canvas?.drawARGB(10, 10, 0xF , 0x1A )
        //canvas?.drawRGB()
        paint.color = context.resources.getColor(R.color.colorAccent)
        canvas?.drawCircle(200F, 300F, 40F, paint)
        //设置点的大小
        paint.strokeWidth = 30F
        //理解为点的样式吧
        paint.strokeCap = Paint.Cap.ROUND
        canvas?.drawPoint(100F, 100F, paint)

        paint.strokeCap = Paint.Cap.SQUARE
        canvas?.drawPoint(100F, 200F, paint)

        paint.strokeWidth = 50F
        paint.strokeCap = Paint.Cap.BUTT
        canvas?.drawPoint(100F, 300F, paint)

        //这种画椭圆需要api 21 才行
        paint.setStyle(Paint.Style.FILL)
        //canvas?.drawOval(50F, 50F, 350F, 200F, paint);

        //可以在矩形内画椭圆
        paint.setStyle(Paint.Style.STROKE)


        canvas?.drawOval(rect, paint)

        //画多个点
        paint.color = Color.LTGRAY
        val points :FloatArray = floatArrayOf(50F, 80F, 150F, 80F, 380F, 80F)
        canvas?.drawPoints(points, paint)

        canvas?.drawRoundRect(rectF, SizeUtils.dp2px(5F).toFloat(), SizeUtils.dp2px(25F).toFloat() , paint )
    }


    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        Log.d("tag1", "onSizeChanged 执行")
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        Log.d("tag1", "onMeasure")
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        Log.d("tag1", "onLayout 执行")
    }

}