package com.example.studentloansapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Register extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
    }

    public void signUpButton(View view) {


        Intent i = new Intent(Register.this, MainActivity.class);

        startActivity(i);

    }

    public void LoginClick(View view) {
        //Toast.makeText(this, "Pls don't crash", Toast.LENGTH_SHORT).show();
       Intent i = new Intent(Register.this,Keiserhomepage.class);
        startActivity(i);
    }
}
