package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SearchBrandActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide();
        setContentView(R.layout.search_brand)
    }
}