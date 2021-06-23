package com.example.saenjo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Mealtime : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mealtime)

        val btn: Button = findViewById(R.id.btn)
        val hourb1: EditText = findViewById(R.id.inputHour1breakfast)
        val hourb2: EditText = findViewById(R.id.inputHour2breakfast)
        val minb1: EditText = findViewById(R.id.inputMin1breakfast)
        val minb2: EditText = findViewById(R.id.inputMin2breakfast)

        val hourl1: EditText = findViewById(R.id.inputHour1lunch)
        val hourl2: EditText = findViewById(R.id.inputHour2lunch)
        val minl1: EditText = findViewById(R.id.inputMin1lunch)
        val minl2: EditText = findViewById(R.id.inputMin2lunch)

        val hourd1: EditText = findViewById(R.id.inputHour1dinner)
        val hourd2: EditText = findViewById(R.id.inputHour2dinner)
        val mind1: EditText = findViewById(R.id.inputMin1dinner)
        val mind2: EditText = findViewById(R.id.inputMin2dinner)

        var hourBreakfast = 0
        var minuteBreakfast = 0
        var hourLunch = 0
        var minuteLunch = 0
        var hourDinner = 0
        var minuteDinner = 0

        btn.setOnClickListener {
            try {
                hourBreakfast = (hourb1.text.toString() + hourb2.text.toString()).toInt()
                minuteBreakfast = (minb1.text.toString() + minb2.text.toString()).toInt()

                hourLunch = (hourl1.text.toString() + hourl2.text.toString()).toInt()
                minuteLunch = (minl1.text.toString() + minl2.text.toString()).toInt()

                hourDinner = (hourd1.text.toString() + hourd2.text.toString()).toInt()
                minuteDinner = (mind1.text.toString() + mind2.text.toString()).toInt()
            } catch (e: NumberFormatException) {
                Toast.makeText(this@Mealtime, "Input positive number only", Toast.LENGTH_SHORT)
                    .show()
            }
            val intent = Intent(this, Homepage::class.java);
            UserData.storeBreakfastTime(hourBreakfast, minuteBreakfast)
            UserData.storeLunchTime(hourLunch, minuteLunch)
            UserData.storeDinnerTime(hourDinner, minuteDinner)
            intent.putExtra("data", "test data")
            startActivity(intent)
        }
    }
}