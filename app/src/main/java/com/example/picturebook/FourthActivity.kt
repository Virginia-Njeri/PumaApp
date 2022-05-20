package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FourthActivity : AppCompatActivity() {
    lateinit var btnSix:Button
    lateinit var btnSeven:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
        btnSix=findViewById(R.id.btnSix)
        btnSix.setOnClickListener {
            val intent=Intent(this,ThirdActivity::class.java)
            startActivity(intent)
        }
        btnSeven=findViewById(R.id.btnSeven)
        btnSeven.setOnClickListener {
            val intent=Intent(this,FifthActivity::class.java)
            startActivity(intent)
        }
    }
}