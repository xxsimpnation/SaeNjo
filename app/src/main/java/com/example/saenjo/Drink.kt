package com.example.saenjo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class Drink : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drink)

        val btn: Button = findViewById(R.id.wakeup)
        var drink: EditText = findViewById(R.id.input_glass)
        var ndrink = 0

        btn.setOnClickListener {
            try {
                ndrink = (drink.text.toString()).toInt()
            } catch (e: NumberFormatException) {
                Toast.makeText(this@Drink, "Input positive number only", Toast.LENGTH_SHORT).show()
            }
            val intent = Intent(this, Homepage::class.java)
            UserData.storeDrink(ndrink)
            intent.putExtra("data", "test data")
            startActivity(intent)
        }

    }
}