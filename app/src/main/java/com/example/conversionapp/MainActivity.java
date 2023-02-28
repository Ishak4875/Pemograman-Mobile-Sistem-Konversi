package com.example.conversionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_value = findViewById(R.id.btn_value);

        btn_value.setOnClickListener(view -> {
            Intent conversion = new Intent(MainActivity.this, ConversionActivity.class);
            startActivity(conversion);
        });
    }
}