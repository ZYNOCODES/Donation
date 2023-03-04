package com.example.donationapp.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.donationapp.Adapter.AllCardAdapter;
import com.example.donationapp.Adapter.ListViewAdapter;
import com.example.donationapp.Adapter.MyDonationAdapter;
import com.example.donationapp.Model.Card;
import com.example.donationapp.R;

import java.util.ArrayList;

public class MyDonationsFragment extends Fragment {
    private View view;
    private ListView AllDonationsListview;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_my_donations, container, false);
        InisializationOfFealds();
        ArrayList<Card> CardList = new ArrayList<>();

        CardList.add(new Card("Reconstruction of children's schools","230000",R.drawable.earthquake1,R.drawable.turkey));
        CardList.add(new Card("donate for hunger people","120000",R.drawable.earthquake,R.drawable.syria));
        CardList.add(new Card("Reconstruction of children's schools","100000",R.drawable.earthquake1,R.drawable.turkey));
        CardList.add(new Card("Reconstruction of children's schools","650000",R.drawable.child2,R.drawable.turkey));
        CardList.add(new Card("donate for hunger people","45000",R.drawable.earthquake2,R.drawable.syria));
        CardList.add(new Card("Reconstruction of children's schools","60000",R.drawable.child1,R.drawable.syria));


        ListViewAdapter listAdapter = new ListViewAdapter(CardList, getActivity());

        AllDonationsListview.setAdapter(listAdapter);
        AllDonationsListview.setLayoutMode(View.SCROLL_AXIS_VERTICAL);
        return view;
    }
    private void InisializationOfFealds(){
        AllDonationsListview = view.findViewById(R.id.AllDonationsListview);
    }
}