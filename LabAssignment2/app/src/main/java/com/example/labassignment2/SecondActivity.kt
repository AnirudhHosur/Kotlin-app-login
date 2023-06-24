package com.example.labassignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

/*
Purpose:
    Represents the second screen of the application that is displayed after successful login.
    Provides options to return to the LoginActivity or navigate to the WebActivity.
Params:
    None
Return:
    None
Functions:
    onCreate: void - Called when the activity is created.
        Sets the layout of the activity and handles button click events.
*/
class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val buttonReturn = findViewById<Button>(R.id.buttonReturn)
        buttonReturn.setOnClickListener {
            // Create an Intent to navigate back to LoginActivity
            val intent = Intent(this@SecondActivity, LoginActivity::class.java)
            startActivity(intent)
        }

        val buttonWeb = findViewById<Button>(R.id.buttonWeb)
        buttonWeb.setOnClickListener {
            // Create an Intent to navigate to WebActivity
            val intent = Intent(this@SecondActivity, WebActivity::class.java)
            startActivity(intent)
        }
    }
}