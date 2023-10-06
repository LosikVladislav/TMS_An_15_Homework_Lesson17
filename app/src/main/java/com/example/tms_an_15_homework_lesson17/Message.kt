package com.example.tms_an_15_homework_lesson17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Message : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

        val button = findViewById<Button>(R.id.btn_switch_prise_act)
        button.setOnClickListener(){
            startActivity(Intent(this, Prise::class.java))
        }
    }
}