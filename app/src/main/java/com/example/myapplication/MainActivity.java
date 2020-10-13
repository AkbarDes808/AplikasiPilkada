package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView web = (WebView) findViewById(R.id.web_view);
        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);
        web.loadUrl("https://rohanihasan808.wordpress.com//");
        web.setWebViewClient(new WebViewClient());



    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            WebView web = (WebView) findViewById(R.id.web_view);
            web.loadUrl("https://rohanihasan808.wordpress.com//");
            web.setWebViewClient(new WebViewClient());
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionsmenu, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.about){
            startActivity(new Intent(this, AboutActivity.class));
        } else if (item.getItemId() == R.id.Login) {
            startActivity(new Intent(this, LoginActivity.class));
        } else if (item.getItemId() == R.id.about) {
            startActivity(new Intent(this, HelpActivity.class));
        }

        return true;
    }
}