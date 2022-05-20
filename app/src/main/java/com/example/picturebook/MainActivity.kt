package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnFirst:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnFirst=findViewById(R.id.btnFirst)
        btnFirst.setOnClickListener {
            val intent=Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }


    }
}