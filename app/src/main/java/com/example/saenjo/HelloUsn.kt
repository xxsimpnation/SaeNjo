package com.example.saenjo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HelloUsn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_usn)

        val wakeup: Button = findViewById(R.id.wakeup)
        wakeup.setOnClickListener {
            val intent = Intent(this, Homepage::class.java);
            startActivity(intent)
        }
    }
}