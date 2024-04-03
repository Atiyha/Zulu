package com.example.zulu

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick = findViewById<Button>(R.id.btnClick)
        val Hello = findViewById<TextView>(R.id.Hello)
        val edtName = findViewById<EditText>(R.id.edtName)
        val swZulu = findViewById<Switch>(R.id.swZulu)

        btnClick.setOnClickListener {
            var greeting: String
            if (swZulu.isChecked){
                greeting = "Hola,${edtName.text}!"
            } else {
                greeting = "Greetings,${edtName.text}!"
            }

        Hello.text = greeting
        }
    }
}