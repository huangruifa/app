package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MyEquipmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide();
        setContentView(R.layout.my_equipment)
    }
}