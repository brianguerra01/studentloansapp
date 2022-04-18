package com.example.studentloansapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Keiserhomepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.keiserhomepage);
    }

    public void studentLoanClick(View view) {
        //Toast.makeText(this, "This service is currently unavailable", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(Keiserhomepage.this,Loanpage.class);
        startActivity(i);
    }

    public void personalLoanClick(View view) {
        Toast.makeText(this, "This service is currently unavailable", Toast.LENGTH_SHORT).show();
    }

    public void carLoanClick(View view) {
        Toast.makeText(this, "This service is currently unavailable", Toast.LENGTH_SHORT).show();
    }

    public void studentloantest(View view) {
        //Toast.makeText(this, "This service is currently unavailable", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(Keiserhomepage.this,Loanpage.class);
        startActivity(i);

    }
}