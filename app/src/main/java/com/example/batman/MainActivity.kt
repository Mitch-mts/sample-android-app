package com.example.batman

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonHot = findViewById<Button>(R.id.btnHot)
        val buttonCool = findViewById<Button>(R.id.btnCool)
        val linearLayout = findViewById<LinearLayout>(R.id.linearLayout)

        buttonHot.setOnClickListener {
            linearLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.red_01))
        }

        buttonCool.setOnClickListener {
            linearLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.blue_01))
        }
    }
}