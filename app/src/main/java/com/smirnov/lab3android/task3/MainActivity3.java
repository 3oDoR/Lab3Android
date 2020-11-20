package com.smirnov.lab3android.task3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.smirnov.lab3android.databinding.ActivityMain3Binding;

public class MainActivity3 extends AppCompatActivity {

    ActivityMain3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.toFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity3.this, MainActivity1.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
            }
        });

        binding.toSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(2);
                finish();
            }
        });
    }
}