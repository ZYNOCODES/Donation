package com.example.donationapp.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.donationapp.MainDonationActivity;
import com.example.donationapp.R;
import com.google.android.material.card.MaterialCardView;

public class SignupFragment extends Fragment {
    private View view;
    private MaterialCardView LogInBTN;
    private ImageView BackBTN;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_signup, container, false);
        InisializationOfFealds();
        IconsOnClickListener();
        return view;
    }
    private void InisializationOfFealds(){
        LogInBTN = view.findViewById(R.id.LogInBTN);
        BackBTN = view.findViewById(R.id.BackBTN);
    }
    private  void IconsOnClickListener(){
        LogInBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), MainDonationActivity.class);
                getActivity().startActivity(i);
                getActivity().finish();
            }
        });
        BackBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction()
                        .replace(R.id.IntroFragmentContainer, new SigninFragment())
                        .addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }
}