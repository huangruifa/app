package com.example.myapp

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.components.Description
import com.github.mikephil.charting.components.Legend
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.components.YAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.formatter.IAxisValueFormatter
import kotlinx.android.synthetic.main.statistics_day.*
import kotlin.random.Random


class StatisticsDayActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide();
        setContentView(R.layout.statistics_day)
        lineChart()


    }


    fun lineChart():Unit{

        //1.设置x轴和y轴的点
//        val entries: MutableList<Map.Entry<*, *>> = ArrayList()
        val entries: MutableList<Entry> = ArrayList()
        for (i in 0..6){
            entries.add(
                Entry(
                    i.toFloat(),
                    Random.nextInt(1200).toFloat()
                )
            )
        }
        val dataSet = LineDataSet(entries, "Label")
        dataSet.setColor(Color.parseColor("#3658E0"));//线条颜色
        dataSet.setDrawCircles(false);//取消圆圈
//        dataSet.setCircleColor(Color.parseColor("#3658E0"));//圆点颜色
        dataSet.setLineWidth(2f);//线条宽度

        //设置样式

        //设置样式
        val rightAxis: YAxis = line_chart.getAxisRight()
        //设置图表右边的y轴禁用
        rightAxis.isEnabled = false

        val leftAxis: YAxis = line_chart.getAxisLeft()
        //设置图表左边的y轴禁用
        leftAxis.textColor = Color.parseColor("#A0A4AA")
        leftAxis.textSize = 11f
        leftAxis.setDrawAxisLine(false) //是否绘制轴线

        //设置x轴
        val xAxis: XAxis = line_chart.getXAxis()
        xAxis.textColor = Color.parseColor("#A0A4AA")
        xAxis.textSize = 11f
        xAxis.axisMinimum = 0f
        xAxis.setDrawAxisLine(true) //是否绘制轴线
        xAxis.setDrawGridLines(false) //设置x轴上每个点对应的线
        xAxis.setDrawLabels(true) //绘制标签  指x轴上的对应数值
        xAxis.position = XAxis.XAxisPosition.BOTTOM //设置x轴的显示位置
        xAxis.granularity = 1f //禁止放大后x轴标签重绘

        //透明化图例
        val legend: Legend = line_chart.getLegend()
        legend.form = Legend.LegendForm.NONE
        legend.textColor = Color.WHITE

        //隐藏x轴描述
        val description = Description()
        description.setEnabled(false)
        line_chart.setDescription(description)

        xAxis.valueFormatter =
            IAxisValueFormatter { value, axis -> "09-0"+(value.toInt() + 1).toString() }

//        //3.chart设置数据
        val lineData = LineData(dataSet)
        line_chart.setData(lineData)
        line_chart.invalidate() // refresh
    }

}