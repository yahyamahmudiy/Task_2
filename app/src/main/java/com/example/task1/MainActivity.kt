package com.example.task1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar = supportActionBar
        actionBar!!.title = "First Activity"

        val changeActivityBTN = findViewById<Button>(R.id.button)
        changeActivityBTN.setOnClickListener { changeActivity() }

    }
    fun changeActivity() {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}