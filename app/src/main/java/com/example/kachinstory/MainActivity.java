package com.example.kachinstory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity (intent);
            }
        });
        btn = findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity3.class);
                startActivity (intent);
            }
        });
        btn = findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity4.class);
                startActivity (intent);
            }
        });
        btn = findViewById(R.id.button4);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity5.class);
                startActivity (intent);
            }
        });
        btn = findViewById(R.id.button5);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity6.class);
                startActivity (intent);
            }
        });
        btn = findViewById(R.id.button6);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity7.class);
                startActivity (intent);
            }
        });
        btn = findViewById(R.id.button7);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity8.class);
                startActivity (intent);
            }
        });
        btn = findViewById(R.id.button10);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity9.class);
                startActivity (intent);
            }
        });
        btn = findViewById(R.id.button11);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity10.class);
                startActivity (intent);
            }
        });
        btn = findViewById(R.id.button8);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity11.class);
                startActivity (intent);
            }
        });
        btn = findViewById(R.id.button9);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity12.class);
                startActivity (intent);
            }
        });
    }
}