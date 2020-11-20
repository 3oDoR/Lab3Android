package com.smirnov.lab3android.task4;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.smirnov.lab3android.databinding.ActivityMain3Binding;
import com.smirnov.lab3android.databinding.ActivityMain4Binding;

public class MainActivity4 extends AppCompatActivity {

    ActivityMain4Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMain4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
}