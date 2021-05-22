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
}