package com.example.task7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class secondactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
        String s = getIntent().getStringExtra("mydata");
        TextView tv =findViewById(R.id.textView);


        tv.setText(s);

    }
}