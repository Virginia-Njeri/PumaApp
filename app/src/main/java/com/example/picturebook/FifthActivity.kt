package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FifthActivity : AppCompatActivity() {
    lateinit var btnEight:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)
        btnEight=findViewById(R.id.btnEight)
        btnEight.setOnClickListener {
            val intent=Intent(this,FourthActivity::class.java)
            startActivity(intent)
        }
    }
}