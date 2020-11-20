package com.smirnov.lab3android.task5;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.navigation.NavigationView;
import com.smirnov.lab3android.databinding.ActivityMainTask5Binding;

public class MainActivity extends AppCompatActivity {

    ActivityMainTask5Binding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            binding = ActivityMainTask5Binding.inflate(getLayoutInflater());
            setContentView(binding.getRoot());
            binding.navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    startActivity(new Intent(MainActivity.this, MainActivityAbout.class));
                    return false;
                }
            });
    }
}
