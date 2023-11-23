package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication1.Activity2;
import com.example.myapplication1.MainActivity;
import com.example.myapplication1.databinding.Activity2Binding;
import com.example.myapplication1.databinding.Activity3Binding;

public class Activity3 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Activity3Binding binding = Activity3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.But1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity3.this, MainActivity.class);
                startActivity(intent);
            }
        });

        binding.But2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity3.this, Activity2.class);
                startActivity(intent);
            }
        });


        binding.Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }



}
