package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Add layout을 할 경우 자동으로 layout activity가 생성됨.
        setContentView(R.layout.activity_sub)
    }
}