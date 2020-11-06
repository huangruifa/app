package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SlicingSortActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide();
        setContentView(R.layout.slicing_sort)
    }
}