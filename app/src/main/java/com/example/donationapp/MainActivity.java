package com.example.donationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.donationapp.Fragment.HomeFragment;
import com.example.donationapp.Fragment.IntroFragment1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.IntroFragmentContainer,new IntroFragment1()).commit();
    }
}