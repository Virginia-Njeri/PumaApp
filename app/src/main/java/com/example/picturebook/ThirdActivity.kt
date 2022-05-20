package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : AppCompatActivity() {
    lateinit var btnFourth:Button
    lateinit var btnFive:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        btnFourth=findViewById(R.id.btnFourth)
        btnFourth.setOnClickListener {
            val intent=Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
        btnFive=findViewById(R.id.btnFive)
        btnFive.setOnClickListener {
            val intent=Intent(this,FourthActivity::class.java)
            startActivity(intent)
        }
    }
}