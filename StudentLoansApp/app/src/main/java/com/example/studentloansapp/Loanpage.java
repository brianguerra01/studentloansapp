package com.example.studentloansapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class Loanpage extends AppCompatActivity {

    TextView wintersemesterTextView;
    TextView loanpriceTextView;

    CheckBox directloanCheckBox;
    CheckBox directsubCheckBox;
    CheckBox parentplusCheckBox;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loanpage);

        wintersemesterTextView = findViewById(R.id.wintersemesterTextView);
        loanpriceTextView = findViewById(R.id.loanpriceTextView);

        directloanCheckBox = findViewById(R.id.directloanCheckBox);
        directsubCheckBox = findViewById(R.id.directsubCheckBox);
        parentplusCheckBox = findViewById(R.id.parentplusCheckBox);
    }



    public void Wintersemester(View view) {
        //Toast.makeText(this, "Winter costs displayed", Toast.LENGTH_SHORT).show();


        int price = 2800;

        if (directloanCheckBox.isChecked()){
            price = price + 2000;
        }

        if (directsubCheckBox.isChecked()){
            price = price + 1000;
        }

        if (parentplusCheckBox.isChecked()){
            price = price + 2650;
        }
        String semesterPrice = Integer.toString(price);

        loanpriceTextView.setText(String.format("$"+ semesterPrice));



    }

}