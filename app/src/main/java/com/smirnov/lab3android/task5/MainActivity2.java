package com.smirnov.lab3android.task5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.smirnov.lab3android.R;
import com.smirnov.lab3android.databinding.FragmentMain2Binding;

public class MainActivity2 extends Fragment {
    FragmentMain2Binding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = FragmentMain2Binding.inflate(inflater);
        binding.toFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MainActivity2.this).navigate(R.id.action_task5_second_to_task5_first);
            }
        });

        binding.toThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MainActivity2.this).navigate(R.id.action_task5_second_to_task5_third);
            }
        });
        return binding.getRoot();
    }
}
