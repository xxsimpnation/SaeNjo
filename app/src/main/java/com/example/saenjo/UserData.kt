package com.example.saenjo

import android.util.Log
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

object UserData {
    private val db = Firebase.firestore

    fun storeWakeUpHr(hour: Int, minute: Int) {
        val obj = hashMapOf(
            "hour" to hour,
            "minute" to minute
        )

        val tag = "WAKE_UP_STORE"

        db.collection("users")
            .add(hashMapOf("wakeupHours" to obj))
            .addOnSuccessListener { documentReference ->
                Log.d(tag, "DocumentSnapshot added with ID: ${documentReference.id}")
            }
            .addOnFailureListener { e ->
                Log.w(tag, "Error adding document", e)
            }
    }

    fun storeSleepHr(hour: Int, minute: Int) {
        val obj = hashMapOf(
            "hour" to hour-7,
            "minute" to minute
        )

        val tag = "SLEEP_STORE"

        db.collection("users")
            .add(hashMapOf("sleepHours" to obj))
            .addOnSuccessListener { documentReference ->
                Log.d(tag, "DocumentSnapshot added with ID: ${documentReference.id}")
            }
            .addOnFailureListener { e ->
                Log.w(tag, "Error adding document", e)
            }
    }

    fun storeBreakfastTime(hourBreakfast: Int, minuteBreakfast: Int) {
        val obj = hashMapOf(
            "hourBreakfast" to hourBreakfast,
            "minuteBreakfast" to minuteBreakfast
        )

        val tag = "BREAKFAST_STORE"

        db.collection("users")
            .add(hashMapOf("breakfastHours" to obj))
            .addOnSuccessListener { documentReference ->
                Log.d(tag, "DocumentSnapshot added with ID: ${documentReference.id}")
            }
            .addOnFailureListener { e ->
                Log.w(tag, "Error adding document", e)
            }
    }

    fun storeLunchTime(hourLunch: Int, minuteLunch: Int) {
        val obj = hashMapOf(
            "hourLunch" to hourLunch,
            "minuteLunch" to minuteLunch
        )

        val tag = "LUNCH_STORE"

        db.collection("users")
            .add(hashMapOf("lunchHours" to obj))
            .addOnSuccessListener { documentReference ->
                Log.d(tag, "DocumentSnapshot added with ID: ${documentReference.id}")
            }
            .addOnFailureListener { e ->
                Log.w(tag, "Error adding document", e)
            }
    }

    fun storeDinnerTime(hourDinner: Int, minuteDinner: Int) {
        val obj = hashMapOf(
            "hourDinner" to hourDinner,
            "minuteDinner" to minuteDinner
        )

        val tag = "DINNER_STORE"

        db.collection("users")
            .add(hashMapOf("dinnerHours" to obj))
            .addOnSuccessListener { documentReference ->
                Log.d(tag, "DocumentSnapshot added with ID: ${documentReference.id}")
            }
            .addOnFailureListener { e ->
                Log.w(tag, "Error adding document", e)
            }
    }

    fun storeDrink(ndrink: Int) {
        val obj = hashMapOf(
            "Drinking a day" to ndrink
        )

        val tag = "DRINK_STORE"

        db.collection("users")
            .add(hashMapOf("drinkingADay" to obj))
            .addOnSuccessListener { documentReference ->
                Log.d(tag, "DocumentSnapshot added with ID: ${documentReference.id}")
            }
            .addOnFailureListener { e ->
                Log.w(tag, "Error adding document", e)
            }
    }
}