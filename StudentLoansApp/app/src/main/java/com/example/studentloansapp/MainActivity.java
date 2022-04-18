package com.example.studentloansapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void HomepageClick(View view) {
        Intent i = new Intent(MainActivity.this,Keiserhomepage.class);
        startActivity(i);
    }

    public void CreateClick(View view) {
        Intent i = new Intent(MainActivity.this,Register.class);
        startActivity(i);
    }

}