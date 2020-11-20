package com.smirnov.lab3android.task5;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.smirnov.lab3android.databinding.ActivityAboutBinding;

public class MainActivityAbout extends AppCompatActivity {

    ActivityAboutBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAboutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }


}
