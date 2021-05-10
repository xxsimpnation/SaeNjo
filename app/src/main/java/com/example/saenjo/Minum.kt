package com.example.saenjo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.NumberPicker
import android.widget.Toast

class Minum : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_minum)

        val numPickerDrink: NumberPicker = findViewById(R.id.numPickerDrink)
        numPickerDrink.maxValue = 16
        numPickerDrink.minValue = 0

        numPickerDrink.setOnClickListener {
            Toast.makeText(this, numPickerDrink.value.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}