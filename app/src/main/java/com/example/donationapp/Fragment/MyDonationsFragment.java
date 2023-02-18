package com.example.donationapp.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.donationapp.Adapter.AllCardAdapter;
import com.example.donationapp.Adapter.MyDonationAdapter;
import com.example.donationapp.Model.Card;
import com.example.donationapp.R;

import java.util.ArrayList;

public class MyDonationsFragment extends Fragment {
    private View view;
    private RecyclerView MyDonationRecycleView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_my_donations, container, false);
        InisializationOfFealds();
        ArrayList<Card> MyDonationCard = new ArrayList<>();
        MyDonationCard.add(new Card("Reconstruction of children's schools","6000","Thanks for your help",R.drawable.child2,R.drawable.syria));
        MyDonationCard.add(new Card("donate for hunger people","200","Thanks for your help",R.drawable.earthquake,R.drawable.syria));
        MyDonationCard.add(new Card("Reconstruction of children's schools","12000","Thanks for your help",R.drawable.earthquake1,R.drawable.turkey));
        MyDonationCard.add(new Card("donate for hunger people","10000","Thanks for your help",R.drawable.earthquake2,R.drawable.syria));
        MyDonationCard.add(new Card("Reconstruction of children's schools","20000","Thanks for your help",R.drawable.child2,R.drawable.syria));
        MyDonationCard.add(new Card("Reconstruction of children's schools","1000","Thanks for your help",R.drawable.child1,R.drawable.turkey));
        MyDonationAdapter adaptermydonation = new MyDonationAdapter(MyDonationCard, getActivity());
        MyDonationRecycleView.setAdapter(adaptermydonation);

        LinearLayoutManager managermydonation = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        MyDonationRecycleView.setLayoutManager(managermydonation);
        return view;
    }
    private void InisializationOfFealds(){
        MyDonationRecycleView = view.findViewById(R.id.MyDonationRecycleView);
    }
}