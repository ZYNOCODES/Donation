package com.example.donationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.donationapp.Fragment.AccountFragment;
import com.example.donationapp.Fragment.HomeFragment;
import com.example.donationapp.Fragment.MyDonationsFragment;

public class MainDonationActivity extends AppCompatActivity {
    private LinearLayout DonationHome,MyDonation,Account;
    private ImageView DonationHome_ic,MyDonation_ic,Account_ic;
    private TextView DonationHome_txt,MyDonation_txt,Account_txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_donation);
        InisializationOfFealds();
        IconsOnClickListener();
    }
    private void InisializationOfFealds(){
        DonationHome = findViewById(R.id.DonationHome);
        MyDonation = findViewById(R.id.MyDonation);
        Account = findViewById(R.id.Account);
        DonationHome_ic = findViewById(R.id.DonationHome_ic);
        MyDonation_ic = findViewById(R.id.MyDonation_ic);
        Account_ic = findViewById(R.id.Account_ic);
        DonationHome_txt = findViewById(R.id.DonationHome_txt);
        MyDonation_txt = findViewById(R.id.MyDonation_txt);
        Account_txt = findViewById(R.id.Account_txt);
    }
    private  void IconsOnClickListener(){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.DonationFragmentContainer,new HomeFragment()).commit();
        DonationHome_ic.setColorFilter(getColor(R.color.PrimaryColor), PorterDuff.Mode.SRC_IN);
        DonationHome_txt.setTextColor(getColor(R.color.PrimaryColor));

        DonationHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.DonationFragmentContainer,new HomeFragment())
                        .commit();
                DonationHome_ic.setColorFilter(getColor(R.color.PrimaryColor), PorterDuff.Mode.SRC_IN);
                DonationHome_txt.setTextColor(getColor(R.color.PrimaryColor));

                MyDonation_ic.setColorFilter(getColor(R.color.SecondaryText), PorterDuff.Mode.SRC_IN);
                MyDonation_txt.setTextColor(getColor(R.color.SecondaryText));

                Account_ic.setColorFilter(getColor(R.color.SecondaryText), PorterDuff.Mode.SRC_IN);
                Account_txt.setTextColor(getColor(R.color.SecondaryText));
            }
        });
        MyDonation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.DonationFragmentContainer,new MyDonationsFragment())
                        .commit();
                DonationHome_ic.setColorFilter(getColor(R.color.SecondaryText), PorterDuff.Mode.SRC_IN);
                DonationHome_txt.setTextColor(getColor(R.color.SecondaryText));

                MyDonation_ic.setColorFilter(getColor(R.color.PrimaryColor), PorterDuff.Mode.SRC_IN);
                MyDonation_txt.setTextColor(getColor(R.color.PrimaryColor));

                Account_ic.setColorFilter(getColor(R.color.SecondaryText), PorterDuff.Mode.SRC_IN);
                Account_txt.setTextColor(getColor(R.color.SecondaryText));
            }
        });
        Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.DonationFragmentContainer,new AccountFragment())
                        .commit();
                DonationHome_ic.setColorFilter(getColor(R.color.SecondaryText), PorterDuff.Mode.SRC_IN);
                DonationHome_txt.setTextColor(getColor(R.color.SecondaryText));

                MyDonation_ic.setColorFilter(getColor(R.color.SecondaryText), PorterDuff.Mode.SRC_IN);
                MyDonation_txt.setTextColor(getColor(R.color.SecondaryText));

                Account_ic.setColorFilter(getColor(R.color.PrimaryColor), PorterDuff.Mode.SRC_IN);
                Account_txt.setTextColor(getColor(R.color.PrimaryColor));
            }
        });
    }
}