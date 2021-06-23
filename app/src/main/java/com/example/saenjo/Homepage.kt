package com.example.saenjo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import com.google.firebase.auth.FirebaseAuth
import com.google.android.gms.auth.api.signin.GoogleSignIn
import android.view.View.OnClickListener;
import android.widget.ImageView
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions

class Homepage : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle
    private lateinit var firebaseAuth: FirebaseAuth
    lateinit var googleSignInClient: GoogleSignInClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        val bedTime: ImageView = findViewById(R.id.bedTime)
        bedTime.setOnClickListener {
            val intent = Intent(this, Wakeup::class.java);
            intent.putExtra("data", "test data")
            startActivity(intent)
        }

        val meal: ImageView = findViewById(R.id.meal)
        meal.setOnClickListener {
            val intent = Intent(this, Mealtime::class.java);
            intent.putExtra("data", "test data")
            startActivity(intent)
        }

        val drink: ImageView = findViewById(R.id.drink)
        drink.setOnClickListener {
            val intent = Intent(this, Drink::class.java);
            intent.putExtra("data", "test data")
            startActivity(intent)
        }

        val drawerLayout: DrawerLayout = findViewById(R.id.drawerLayout)
        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(false)

        val googleSignInOptions = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.default_web_client_id))
            .requestEmail()
            .build()
        googleSignInClient = GoogleSignIn.getClient(this, googleSignInOptions)

        val sidebarView: NavigationView = findViewById(R.id.sidebarView)
        sidebarView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.item1 -> Toast.makeText(
                    applicationContext,
                    "clicked item 1", Toast.LENGTH_SHORT
                ).show()
                R.id.item2 -> Toast.makeText(
                    applicationContext,
                    "clicked item 2", Toast.LENGTH_SHORT
                ).show()
                R.id.item3 -> {
                    firebaseAuth = FirebaseAuth.getInstance()
                    googleSignInClient.signOut().addOnCompleteListener {
                        val intent = Intent(this, Login_google::class.java)
                        startActivity(intent)
                        finish()
                    }

//                    checkUser()
                }
            }
            true
        }

//        val logout: Button = findViewById(R.id.item3)
//        //initialize firebase auth
//        firebaseAuth = FirebaseAuth.getInstance()
//        checkUser()
////
//        logout.setOnClickListener{
//            firebaseAuth.signOut()
//            checkUser()
//        }
    }

//    private fun checkUser() {
//        //get current user
//        val firebaseUser = firebaseAuth.currentUser
//        if (firebaseUser == null) {
//            //user tidak login
//            startActivity(Intent(this, Login_google::class.java))
//            finish()
//        } else {
//            val email = firebaseUser.email
////            binding.emailTv.text = email
//        }
//    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}