package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    lateinit var btnSecond:Button
    lateinit var btnThird:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seco)
        btnSecond=findViewById(R.id.btnSecond)
        btnSecond.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)

        }
        btnThird=findViewById(R.id.btnThird)
        btnThird.setOnClickListener {
            val intent=Intent(this,ThirdActivity::class.java)
            startActivity(intent)
        }


    }
}