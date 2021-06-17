package com.example.saenjo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

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

        val hourBreakfast = (hourb1.text.toString() + hourb2.text.toString()).toInt()
        val minuteBreakfast = (minb1.text.toString() + minb2.text.toString()).toInt()

        val hourLunch = (hourl1.text.toString() + hourl2.text.toString()).toInt()
        val minuteLunch = (minl1.text.toString() + minl2.text.toString()).toInt()

        val hourDinner = (hourd1.text.toString() + hourd2.text.toString()).toInt()
        val minuteDinner = (mind1.text.toString() + mind2.text.toString()).toInt()

        btn.setOnClickListener {
            val intent = Intent(this, Notification::class.java);
            UserData.storeBreakfastTime(hourBreakfast, minuteBreakfast)
            UserData.storeLunchTime(hourLunch, minuteLunch)
            UserData.storeDinnerTime(hourDinner, minuteDinner)
            intent.putExtra("data", "test data")
            startActivity(intent)
        }
    }
}