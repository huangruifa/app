package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SetLanguageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide();
        setContentView(R.layout.set_language)
    }
}