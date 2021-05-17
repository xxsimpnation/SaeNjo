package com.example.saenjo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.NumberPicker
import android.widget.Toast
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class Wakeup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wakeup)

        val nextBtn: Button = findViewById(R.id.btMove)
        val numPickerHr: NumberPicker = findViewById(R.id.numPickerHr)
        val numPickerMin: NumberPicker = findViewById(R.id.numPickerMin)
        val numPickerAm: NumberPicker = findViewById(R.id.numPickerAm)

        nextBtn.setOnClickListener{
            val intent = Intent(this, notification::class.java)
            UserData.storeWakeUpHr(numPickerHr.value, numPickerMin.value, numPickerAm.value)
            intent.putExtra("data", "test data")
            startActivity(intent)
        }

        numPickerHr.maxValue = 12
        numPickerHr.minValue = 0

        numPickerHr.setOnClickListener {

            Toast.makeText(this, numPickerHr.value.toString(), Toast.LENGTH_SHORT).show()
        }

        numPickerMin.maxValue = 59
        numPickerMin.minValue = 0

        numPickerHr.setOnClickListener {
            Toast.makeText(this, numPickerMin.value.toString(), Toast.LENGTH_SHORT).show()
        }

        val colors = arrayOf("AM", "PM")
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