package com.example.donationapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;

public class CardDetailsActivity extends AppCompatActivity {
    private CardView BackBTN;
    private MaterialCardView DonateBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_details);
        InisializationOfFealds();
        BackBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        DonateBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CardDetailsActivity.this,"Thanks for your donation",Toast.LENGTH_SHORT).show();
                onBackPressed();
            }
        });
    }
    private void InisializationOfFealds(){
        BackBTN = findViewById(R.id.BackBTN);
        DonateBTN = findViewById(R.id.DonateBTN);
    }
}