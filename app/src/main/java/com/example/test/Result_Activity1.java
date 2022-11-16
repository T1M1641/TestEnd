package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Result_Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result1);
        Intent i = getIntent();
        String result = i.getStringExtra("user_result");
        TextView textView = findViewById(R.id.textViewResult);
        textView.setText(result);
    }
}