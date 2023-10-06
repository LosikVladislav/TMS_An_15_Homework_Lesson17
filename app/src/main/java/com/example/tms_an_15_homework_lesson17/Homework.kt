package com.example.tms_an_15_homework_lesson17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Homework : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework)

        val button = findViewById<Button>(R.id.btn_switch_messge_act)
        button.setOnClickListener(){
            startActivity(Intent(this, Message::class.java))
        }
    }
}