package com.example.myapp

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() ,View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:Button = findViewById(R.id.button)
        val text_view:TextView = findViewById(R.id.text_view)
        val image_view:ImageView = findViewById(R.id.image_view)

        button.setOnClickListener(){
            val string = "点击事件"
            text_view.setText(string)
            image_view.setImageResource(R.drawable.test)
        }

    }

    override fun onClick(v: View?) {
//        TODO("Not yet implemented")
        val string = "点击事件"

        val button:Button = findViewById(R.id.button)
        val text_view:TextView = findViewById(R.id.text_view)
        when(v){
            button -> text_view.text = string
        }

    }

}