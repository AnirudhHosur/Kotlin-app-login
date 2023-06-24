package com.example.labassignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

/*
Purpose:
    Represents the login screen of the application where users can enter their credentials to login.
    If the entered username and password match the predefined values, the user is directed to the SecondActivity.
    Otherwise, an error message is displayed.
Params:
    None
Return:
    None
Functions:
    onCreate: void - Called when the activity is created.
        Sets the layout of the activity and handles the login functionality.
*/
class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Thanks to this blog from tutorial kart on how to use on click listeners -->
        // https://www.tutorialkart.com/kotlin-android/set-onclicklistener-button-kotlin-android/
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)
        buttonLogin.setOnClickListener {
            val editTextUsername = findViewById<EditText>(R.id.editTextUsername)
            val editTextPassword = findViewById<EditText>(R.id.editTextPassword)

            val username = editTextUsername.text.toString()
            val password = editTextPassword.text.toString()

            // Check if the entered username and password match the predefined values
            if (username == "Anirudh Hosur" && password == "B00899369") {
                // Thanks to Digital Ocean's post on how to intent between activities
                // https://www.digitalocean.com/community/tutorials/android-intent-handling-between-activities-using-kotlin
                // Create an Intent to navigate to SecondActivity
                val intent = Intent(this@LoginActivity, SecondActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this@LoginActivity, "Invalid username or password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}