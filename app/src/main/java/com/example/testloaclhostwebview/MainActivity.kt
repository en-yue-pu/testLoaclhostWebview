package com.example.testloaclhostwebview

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById<View>(R.id.webview) as WebView//从UI拿实例过来,对他进行操作
//        webView.webViewClient = WebViewClient()

        webView.settings.javaScriptEnabled = true
        // 允许访问混合内容（包括 HTTP 和 HTTPS）
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            webView.settings.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        }
        webView.settings.javaScriptCanOpenWindowsAutomatically = true

        //http://10.0.2.2 http://www.google.co.jp  http://10.0.2.2:8080
        webView.loadUrl("http://10.0.2.2:8080")

    }
}