package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HardwareInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide();
        setContentView(R.layout.hardware_info)
    }
}