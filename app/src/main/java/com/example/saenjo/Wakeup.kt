package com.example.saenjo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Wakeup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wakeup)

        val nextBtn: Button = findViewById(R.id.btBangun)
        nextBtn.setOnClickListener{
            val intent = Intent(this, notification::class.java);
            intent.putExtra("data", "test data")
            startActivity(intent)
        }

    }
}