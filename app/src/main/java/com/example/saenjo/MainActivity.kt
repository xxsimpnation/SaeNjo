package com.example.saenjo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextBtn: Button = findViewById(R.id.btMove)
        nextBtn.setOnClickListener{
            val intent = Intent(this, Name::class.java);
            intent.putExtra("data", "test data")
            startActivity(intent)
        }

    }

}