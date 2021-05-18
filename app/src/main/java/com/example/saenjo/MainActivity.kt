package com.example.saenjo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ttb = AnimationUtils.loadAnimation(this, R.anim.ttb)
        val stb = AnimationUtils.loadAnimation(this, R.anim.stb)
        val textView: TextView = findViewById(R.id.textView)
        val image: ImageView = findViewById(R.id.landing_image)

        textView.startAnimation(ttb)
        image.startAnimation(stb)


//        val nextBtn: Button = findViewById(R.id.btMove)
//        nextBtn.setOnClickListener{
//            val intent = Intent(this, Name::class.java);
//            intent.putExtra("data", "test data")
//            startActivity(intent)
//        }

    }

}