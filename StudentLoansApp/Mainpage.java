package com.example.studentloansapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void studentLoanClick(View view) {
        Intent i = new Intent(MainPage.this,MainActivity.class);
        StartActivity(i);
    }

    public void personalLoanClick(View view) {
        Toast.makeText(this, "This service is currently unavailable", Toast.LENGTH_SHORT).show();
    }

    public void carLoanClick(View view) {
        Toast.makeText(this, "This service is currently unavailable", Toast.LENGTH_SHORT).show();
    }


}