package app.ewtc.masterung.actionview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        String strURL = getIntent().getStringExtra("URL");
        String strURL = "http://androidthai.in.th";


        WebView webView = (WebView) findViewById(R.id.myWebView);
        WebViewClient webViewClient = new WebViewClient();
        webView.setWebViewClient(webViewClient);
        webView.loadUrl(strURL);
        webView.getSettings().setJavaScriptEnabled(true);

    }   // Main Method
}   // Main Class
