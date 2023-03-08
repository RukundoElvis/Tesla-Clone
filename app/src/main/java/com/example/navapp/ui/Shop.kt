package com.example.navapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.navapp.R


class Shop : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_personal,container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val myWebView: WebView =view.findViewById(R.id.webView_Person)
        myWebView.webViewClient = object: WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url:String
            ): Boolean {
                view.loadUrl(url)
                return true
            }
        }
        myWebView.loadUrl("https://shop.tesla.com")
        myWebView.settings.javaScriptEnabled
        myWebView.settings.allowContentAccess=true
        myWebView.settings.useWideViewPort=true
        myWebView.settings.domStorageEnabled=true
    }
}