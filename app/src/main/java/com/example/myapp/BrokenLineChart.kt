//package com.example.myapp
//
//import android.content.Context
//import android.graphics.Color
//import android.graphics.Paint
//import android.util.AttributeSet
//import android.view.View
//
//class BrokenLineChart @JvmOverloads constructor(
//    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
//) : View(context, attrs, defStyleAttr) {
//    // 绘制坐标系的画笔
//    private var mPaintCdt: Paint = Paint(Paint.ANTI_ALIAS_FLAG)
//    //绘制坐标系上刻度点的画笔
//    private var mPaintSysPoint: Paint = Paint(Paint.ANTI_ALIAS_FLAG)
//    //绘制折线上的点的画笔
//    private var mPaintLinePoint: Paint = Paint(Paint.ANTI_ALIAS_FLAG)
//    //绘制文字的画笔
//    private var mPaintText: Paint = Paint(Paint.ANTI_ALIAS_FLAG)
//    //绘制折线的画笔
//    private var mPaintLine: Paint = Paint(Paint.ANTI_ALIAS_FLAG)
//    //绘制虚线的画笔
//    private var mPaintDash: Paint = Paint(Paint.ANTI_ALIAS_FLAG)
//    //x,y轴的画笔
//    private var mPaintSys: Paint = Paint(Paint.ANTI_ALIAS_FLAG)
//    //绘制覆盖区域
//    private var mPaintFillArea: Paint = Paint(Paint.ANTI_ALIAS_FLAG)
//    //初始化画笔
//    private fun initPaint() {
//        //虚线需要关闭硬件加速
//        setLayerType(LAYER_TYPE_SOFTWARE, null)
//
//        mPaintCdt.style = Paint.Style.STROKE
//        mPaintCdt.strokeWidth = brokenLineSize
//        mPaintCdt.color = brokenLineColor
//
//        mPaintLinePoint.style = Paint.Style.FILL
//        mPaintLinePoint.color = brokenLinePointColor
//
//        mPaintSysPoint.color = coordinateSystemPointColor
//
//        mPaintSys.style = Paint.Style.STROKE
//        mPaintSys.strokeWidth = coordinateSystemSize
//        mPaintSys.color = coordinateSystemColor
//
//        mPaintText.textAlign = Paint.Align.CENTER
//        mPaintText.color = Color.WHITE
//        mPaintText.textSize = 30f
//
//        mPaintFillArea.color = Color.YELLOW
//        mPaintFillArea.style = Paint.Style.FILL
//
//        mPaintLine.style = Paint.Style.STROKE
//        mPaintLine.strokeWidth = brokenLineSize
//        mPaintLine.color = brokenLineColor
//
//        mPaintDash = Paint()
//        mPaintDash.style = Paint.Style.STROKE
//        mPaintDash.strokeWidth = dashSize
//        mPaintDash.color = dashColor
//        mPaintDash.pathEffect = DashPathEffect(floatArrayOf(10f, 10f), 0f)
//
//        mXBound = Rect()
//        mYBound = Rect()
//
//    }
//
//    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
//        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
//        setMeasuredDimension(measureSpec(widthMeasureSpec), measureSpec(heightMeasureSpec))
//    }
//
//    private fun measureSpec(heightMeasureSpec: Int): Int {
//        var result: Int
//        val specSize = View.MeasureSpec.getSize(heightMeasureSpec) //获取高的高度 单位 为px
//        val specMode = View.MeasureSpec.getMode(heightMeasureSpec)//获取测量的模式
//        //如果是精确测量，就将获取View的大小设置给将要返回的测量值
//        if (specMode == View.MeasureSpec.EXACTLY) {
//            result = specSize
//        } else {
//            result = 400
//            //如果设置成wrap_content时，给高度指定一个值
//            if (specMode == View.MeasureSpec.AT_MOST) {
//                result = Math.min(result, specSize)
//            }
//        }
//        return result
//    }
//
//    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
//        super.onSizeChanged(w, h, oldw, oldh)
//        //获取当前View的宽高
//        mViewWidth = w
//        mViewHeight = h
//        //渐变
//        mShader = LinearGradient(mViewWidth.toFloat(), mViewHeight.toFloat(), mViewWidth.toFloat(), 0f, intArrayOf(Color.YELLOW, Color.TRANSPARENT), null, Shader.TileMode.REPEAT)
//    }
//
//}