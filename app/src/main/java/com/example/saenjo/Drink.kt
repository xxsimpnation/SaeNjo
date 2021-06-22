package com.example.saenjo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView

class Drink : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drink)

        val askInput : LinearLayout = findViewById(R.id.ask_input_drink)
        val inputDrink : LinearLayout = findViewById(R.id.input_drink)
        val toLayoutInput: ImageButton = findViewById(R.id.to_layout_input)
        toLayoutInput.setOnClickListener {
            askInput.visibility = View.INVISIBLE
            inputDrink.visibility = View.VISIBLE
        }
    }
}