package com.example.task_2;

import  androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.task_2.R;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7;
    TextView tv1,tv2;
    int a=0;
    int b=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.Add1);
        b2=findViewById(R.id.sub1);
        b3=findViewById(R.id.zero1);
        tv1=findViewById(R.id.Text1);
        b4=findViewById(R.id.Add2);
        b5=findViewById(R.id.sub2);
        b6=findViewById(R.id.zero2);
        tv2=findViewById(R.id.Text2);
        b7=findViewById(R.id.button);


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText("0");
                tv2.setText("0");

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a++;
                tv1.setText(""+a);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=a+2;
                tv1.setText(""+a);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=a+3;
                tv1.setText(""+a);
            }
        });
        if (savedInstanceState!=null){
            String s=savedInstanceState.getString("Revanth");
            a=Integer.parseInt(s);
            tv1.setText(""+a);
        }

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b++;
                tv2.setText(""+b);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b=b+2;
                tv2.setText(""+b);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b=b+3;
                tv2.setText(""+b);
            }
        });
        if (savedInstanceState!=null){
            String s=savedInstanceState.getString("Revanth");
            b=Integer.parseInt(s);
            tv2.setText(""+b);
        }
    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString("Revanth",tv1.getText().toString());
        outState.putString("Tummala",tv2.getText().toString());
    }

    public void toast(View view) {

        Toast.makeText(this, " Player 2 : "+b,Toast.LENGTH_SHORT).show();



    }


    public void toast1(View view) {
        Toast.makeText(this, " Player 1 : "+a,Toast.LENGTH_SHORT).show();
    }


}