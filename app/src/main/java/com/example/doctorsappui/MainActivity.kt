package com.example.doctorsappui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.getStarted).setOnClickListener{
            intent = Intent(applicationContext, DashbordActivity::class.java)
            startActivity(intent)
        }



    }
}