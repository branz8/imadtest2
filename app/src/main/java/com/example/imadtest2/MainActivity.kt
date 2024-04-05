package com.example.historyapp_imadassignmenttest2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.imadtest2.R


class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val agebar = findViewById<EditText>(R.id.agebar)
        val enterbutton = findViewById<Button>(R.id.enterbutton)
        val celebinformation = findViewById<TextView>(R.id.celebinformation)
        val btnclear = findViewById<Button>(R.id.clearbutton)

        enterbutton.setOnClickListener {
            btnclear.setOnClickListener { agebar.text.clear() }
            val age = agebar.text.toString()
            val ageTextView = agebar.text.toString()
            if (!ageTextView.isNullOrEmpty()) {
                val age = ageTextView.toInt()
                val name = if (age in 20..28) {
                    "South Korean actor Jung Chae-yul passed away at 26"
                } else if (age in 28..36) {
                    "Former king of Macedonia Alexander The Great passed away at 32"
                } else if (age in 36..44) {
                    "Pop idol star Darius Campbell Danesh passed away at age 41"
                } else if (age in 44..52) {
                    "Rap performer Nashawn Breedlove passed away at age 46"
                } else if (age in 52..60) {
                    "Friends star Matthew Perry passed away at age 54"
                } else if (age in 60..68) {
                    " Tv presenter Annabel Glies passed away at age 64"
                } else if (age in 68..76) {
                    "Actor Gary Graham passed away at 73"
                } else if (age in 76..84) {
                    "Oscar nominated star Ryan O'Neal passed away at age 82"
                } else if (age in 84..92) {
                    " The first black man to win an Academic Reward Louis Gosselt passed away"
                } else if (age in 92..100){
                    " Famous actor James Ackland passed away at age 95"


                } else {
                    "Invalid age"
                }
                celebinformation.text = name.toString()
            } else {
                celebinformation.text = "Please enter an age"
            }
        }
    }
}

