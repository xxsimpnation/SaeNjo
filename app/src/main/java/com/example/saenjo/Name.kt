package com.example.saenjo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Name : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        val nextBtn: Button = findViewById(R.id.btNama)
        nextBtn.setOnClickListener{
            val intent = Intent(this, Wakeup::class.java);
            intent.putExtra("data", "test data")
            startActivity(intent)
        }
    }
}