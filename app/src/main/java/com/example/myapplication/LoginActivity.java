package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Intent intent = new Intent();
        intent.setAction(intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://wordpress.com/posts/rohanihasan808.wordpress.com"));
        startActivity(intent);
    }
}
