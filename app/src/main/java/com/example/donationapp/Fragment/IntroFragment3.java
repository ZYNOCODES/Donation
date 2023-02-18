package com.example.donationapp.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.donationapp.MainDonationActivity;
import com.example.donationapp.R;
import com.google.android.material.card.MaterialCardView;

public class IntroFragment3 extends Fragment {
    private View view;
    private TextView BackBTN;
    private MaterialCardView DonateBTN;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_intro3, container, false);
        InisializationOfFealds();
        IconsOnClickListener();
        return view;
    }
    private void InisializationOfFealds(){
        DonateBTN = view.findViewById(R.id.DonateBTN);
        BackBTN = view.findViewById(R.id.BackBTN);
    }
    private  void IconsOnClickListener(){
        DonateBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction()
                        .replace(R.id.IntroFragmentContainer, new SigninFragment())
                        .addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        BackBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction()
                        .replace(R.id.IntroFragmentContainer, new IntroFragment2())
                        .addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }
}