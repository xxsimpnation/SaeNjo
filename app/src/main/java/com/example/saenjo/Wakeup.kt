package com.example.saenjo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
//import com.google.firebase.firestore.ktx.firestore
//import com.google.firebase.ktx.Firebase

class Wakeup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wakeup)

        val btn: Button = findViewById(R.id.btn)
        val hour1: EditText = findViewById(R.id.inputHour1)
        val hour2: EditText = findViewById(R.id.inputHour2)
        val min1: EditText = findViewById(R.id.inputMin1)
        val min2: EditText = findViewById(R.id.inputMin2)
        val hr1: Int
        val hr2: Int
        val mnt1: Int
        val mnt2: Int
        hr1 = hour1.text.toString().toInt()
        hr2 = hour2.text.toString().toInt()
        mnt1 = min1.text.toString().toInt()
        mnt2 = min2.text.toString().toInt()
        val hr = StringBuilder()
        val mn = StringBuilder()
        hr.append(hr1).append(hr2).toString().toInt()
        mn.append(min1).append(min2).toString().toInt()
        val hour: Int= hr.toString().toInt()
        val min: Int= mn.toString().toInt()

        btn.setOnClickListener{
            val intent = Intent(this, Mealtime::class.java)
            UserData.storeWakeUpHr(hour, min)
            intent.putExtra("data", "test data")
            startActivity(intent)
        }
        
        
//
//        numPickerHr.maxValue = 12
//        numPickerHr.minValue = 0
//
//        numPickerHr.setOnClickListener {
//
//            Toast.makeText(this, numPickerHr.value.toString(), Toast.LENGTH_SHORT).show()
//        }
//
//        numPickerMin.maxValue = 59
//        numPickerMin.minValue = 0
//
//        numPickerMin.setOnClickListener {
//            Toast.makeText(this, numPickerMin.value.toString(), Toast.LENGTH_SHORT).show()
//        }
//
//        val colors = arrayOf("AM", "PM")
//        numPickerAm.minValue = 0
//        numPickerAm.maxValue = colors.size - 1
//
//
//        // Set the valued to be displayed in number picker
//        numPickerAm.displayedValues = colors
//
//
//        // Set number picker value change listener
//        numPickerAm.setOnClickListener {
//            Toast.makeText(
//                    this, "${colors[numPickerAm.value]}", Toast.LENGTH_SHORT).show()
//        }
    }
}