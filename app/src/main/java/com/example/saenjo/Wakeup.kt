package com.example.saenjo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.NumberPicker
import android.widget.Toast

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

        val numPickerHr: NumberPicker = findViewById(R.id.numPickerHr)
        numPickerHr.maxValue = 12
        numPickerHr.minValue = 0

        numPickerHr.setOnClickListener {
            Toast.makeText(this, numPickerHr.value.toString(), Toast.LENGTH_SHORT).show()
        }

        val numPickerMin: NumberPicker = findViewById(R.id.numPickerMin)
        numPickerMin.maxValue = 59
        numPickerMin.minValue = 0

        numPickerHr.setOnClickListener {
            Toast.makeText(this, numPickerMin.value.toString(), Toast.LENGTH_SHORT).show()
        }

        val colors = arrayOf("AM", "PM")
        val numPickerAm: NumberPicker = findViewById(R.id.numPickerAm)
        numPickerAm.minValue = 0
        numPickerAm.maxValue = colors.size - 1


        // Set the valued to be displayed in number picker
        numPickerAm.displayedValues = colors


        // Set number picker value change listener
        numPickerAm.setOnClickListener {
            Toast.makeText(
                    this, "${colors[numPickerAm.value]}", Toast.LENGTH_SHORT).show()
        }


    }
}