package com.example.krzysztof.simplejava;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setWidth(200);
        textView.setTextColor(Color.parseColor("#FF0000"));
        textView.setTextSize(30);
        textView.setText("Wow!");

        setContentView(textView);

//        setContentView(R.layout.activity_main);
    }
}
