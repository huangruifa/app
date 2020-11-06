package com.example.myapp

import android.graphics.Color
import android.os.Bundle
import android.text.SpannableString
import android.text.style.RelativeSizeSpan
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.components.Description
import com.github.mikephil.charting.components.Legend
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import kotlinx.android.synthetic.main.statistics_month.*


class StatisticsMonthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide();
        setContentView(R.layout.statistics_month)
        pieChart()

    }

    fun pieChart(): Unit {
        val brands: MutableList<PieEntry> = ArrayList()
        brands.add(PieEntry(20f, "小米10"))
        brands.add(PieEntry(20f, "魅族16"))
        brands.add(PieEntry(100f, "华为mate30"))
        brands.add(PieEntry(100f, "三星s10"))
        println(brands)
        val dataSet = PieDataSet(brands, "")

        val colors = ArrayList<Int>()
        colors.add(Color.parseColor("#5B8FF9"))
        colors.add(Color.parseColor("#5AD8A6"))
        colors.add(Color.parseColor("#6DC8EC"))
        colors.add(Color.parseColor("#F6BD16"))
        dataSet.colors = colors

        //隐藏文字描述
        val description = Description()
        description.setEnabled(false)
        pie_chart.setDescription(description)

        //饼状图中间可以添加文字
        val s = SpannableString("机型切膜数统计\n160");
        s.setSpan(RelativeSizeSpan(1.5f), 8, s.length, 0);
        pie_chart.setDrawCenterText(true);//饼状图中间可以添加文字
        pie_chart.setCenterText(s); //设置中间文字
        pie_chart.setCenterTextColor(Color.parseColor("#121018")); //中间问题的颜色
        pie_chart.setCenterTextSizePixels(30f);  //中间文字的大小



        val legend: Legend = pie_chart.getLegend()
        legend.setXEntrySpace(10f); //x轴的间距
        legend.setTextSize(13f);  //图例文字的大小

        //是否在图上显示数值
        dataSet.setDrawValues(false);
        dataSet.setValueTextSize(14f);//文字的大小
        dataSet.setValueLinePart1Length(0.25f);//当值位置为外边线时，表示线的前半段长度。
        dataSet.setValueLinePart2Length(0f);//当值位置为外边线时，表示线的后半段长度。
        dataSet.setValueLinePart1OffsetPercentage(80f);//当ValuePosits为OutsiDice时，指示偏移为切片大小的百分比
        dataSet.setValueLineColor(Color.parseColor("#a1a1a1"));// 当值位置为外边线时，表示线的颜色
        dataSet.setYValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);//设置Y值的位置是在圆内还是圆外
        dataSet.setSliceSpace(0f);// 设置每条之前的间隙
        dataSet.setSelectionShift(5f); //设置饼状Item被选中时变化的距离
        dataSet.setValueLineColor(Color.parseColor("#a1a1a1"));// 当值位置为外边线时，表示线的颜色。

        val pieData = PieData(dataSet)
        pieData.setDrawValues(true)
        pie_chart.setDrawSliceText(false)//设置x轴文字
        pie_chart.setHoleRadius(70f);//半径
        pie_chart.setTransparentCircleRadius(0f);//内透明半径
        pie_chart.setData(pieData)
        pie_chart.invalidate()
        pie_chart.setExtraOffsets(20f, 20f, 20f, 20f);//设置饼状图距离上下左右的偏移量


    }
}