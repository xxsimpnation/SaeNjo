package com.example.saenjo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val sign:Button = findViewById(R.id.signUp)
        sign.setOnClickListener {
            val intent = Intent(this, Signup::class.java);
            startActivity(intent)
        }
    }
}