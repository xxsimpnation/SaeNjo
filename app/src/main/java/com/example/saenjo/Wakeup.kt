package com.example.saenjo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

//import com.google.firebase.firestore.ktx.firestore
//import com.google.firebase.ktx.Firebase

class Wakeup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wakeup)

        val btn: Button = findViewById(R.id.mealTime)
        val hour1: EditText = findViewById(R.id.inputHour1)
        val hour2: EditText = findViewById(R.id.inputHour2)
        val min1: EditText = findViewById(R.id.inputMin1)
        val min2: EditText = findViewById(R.id.inputMin2)
        var hour = 0
        var min = 0

        btn.setOnClickListener {
            try {
                hour = (hour1.text.toString() + hour2.text.toString()).toInt()
                min = (min1.text.toString() + min2.text.toString()).toInt()
            } catch (e: NumberFormatException) {
                Toast.makeText(this@Wakeup, "Input positive number only", Toast.LENGTH_SHORT).show()
            }
            val intent = Intent(this, Homepage::class.java)
            UserData.storeWakeUpHr(hour, min)
            intent.putExtra("data", "test data")
            startActivity(intent)
            println("$hour, $min")
        }
    }
}