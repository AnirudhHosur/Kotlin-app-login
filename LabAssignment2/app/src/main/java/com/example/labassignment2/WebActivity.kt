package com.example.labassignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView

/*
Purpose:
    Represents the activity that displays a WebView to load a website.
Params:
    None
Return:
    None
Functions:
    onCreate: void - Called when the activity is created.
        Sets the layout of the activity, initializes the WebView, enables JavaScript,
        and loads the Google.com website.
*/
class WebActivity : AppCompatActivity() {
    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        // Find the WebView in the layout
        webView = findViewById(R.id.webView)

        // Load Google.com
        webView.loadUrl("https://www.google.com")
    }

}