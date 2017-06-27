package com.example.dixit.middaymeal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webb extends AppCompatActivity {
private WebView WebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_webb);
        WebView=(WebView)findViewById(R.id.wv);
        WebSettings webSettings=WebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        WebView.loadUrl("http://www.dopahar.org/dopahar/index.php?tag=6&stag=");
        WebView.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(WebView.canGoBack()){
            WebView.goBack();
        }
        else
            super.onBackPressed();
    }
    }

