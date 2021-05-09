package com.example.saenjo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class notification : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)

        val nextBtn: Button = findViewById(R.id.button3)
        nextBtn.setOnClickListener {
            val intent = Intent(this, achieve::class.java);
            intent.putExtra("data", "test data")
            startActivity(intent)
        }
    }
}