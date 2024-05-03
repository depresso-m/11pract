package com.example.mobile11;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
public class WebViewActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        webView = (WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient()); //Помогает приложению открывать ссылки внутри WebView, а не во внешнем браузере
        webView.getSettings().setJavaScriptEnabled(true); //Включаем поддержку JavaScript

        webView.loadUrl("https://ru.wikipedia.org/wiki/Android "); //Загрузка страницы
    }
}
