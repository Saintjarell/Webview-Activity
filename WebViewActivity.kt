package com.example.jarellxml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class WebViewActivity : AppCompatActivity() {
    lateinit var web:WebView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        web=findViewById(R.id.web)


            web.webViewClient= WebViewClient()
            web.loadUrl("https://www.planetware.com/")
            web.settings.javaScriptEnabled
            web.settings.setSupportZoom(true)

        }
    }
