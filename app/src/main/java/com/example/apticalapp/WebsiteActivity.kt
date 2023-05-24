package com.example.apticalapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WebsiteActivity : AppCompatActivity() {
    lateinit var myWebView:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_website)
        myWebView = findViewById(R.id.mWeb)
        var settings = myWebView.settings
        settings.javaScriptEnabled = true
        myWebView.loadUrl("https://www.bmw.co.ke/en/index.html")
    }
}