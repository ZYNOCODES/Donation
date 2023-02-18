package com.example.donationapp.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.donationapp.R;

public class IntroFragment2 extends Fragment {
    private View view;
    private TextView NextBTN,BackBTN;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_intro2, container, false);
        InisializationOfFealds();
        IconsOnClickListener();
        return view;
    }
    private void InisializationOfFealds(){
        NextBTN = view.findViewById(R.id.NextBTN);
        BackBTN = view.findViewById(R.id.BackBTN);
    }
    private  void IconsOnClickListener(){
        NextBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction()
                        .replace(R.id.IntroFragmentContainer, new IntroFragment3())
                        .addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        BackBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction()
                        .replace(R.id.IntroFragmentContainer, new IntroFragment1())
                        .addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }
}