package com.example.donationapp.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.donationapp.Adapter.AllCardAdapter;
import com.example.donationapp.Adapter.CardAdapter;
import com.example.donationapp.Model.Card;
import com.example.donationapp.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private View view;
    private RecyclerView SyriaRecycleView,TurkeyRecycleView,AllDonationsRecycleView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);
        InisializationOfFealds();
        ArrayList<Card> CardSyria = new ArrayList<>();
        CardSyria.add(new Card("Reconstruction of children's schools","230000","50%",R.drawable.earthquake,R.drawable.syria));
        CardSyria.add(new Card("donate for hunger people","50000","25%",R.drawable.earthquake1,R.drawable.syria));
        CardSyria.add(new Card("Reconstruction of children's schools","650000","75%",R.drawable.earthquake2,R.drawable.syria));
        CardSyria.add(new Card("donate for hunger people","1000000","95%",R.drawable.child2,R.drawable.syria));
        CardSyria.add(new Card("Reconstruction of children's schools","90000","25%",R.drawable.child1,R.drawable.syria));
        CardAdapter adaptersyria = new CardAdapter(CardSyria, getActivity());
        SyriaRecycleView.setAdapter(adaptersyria);

        LinearLayoutManager managersyria = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        SyriaRecycleView.setLayoutManager(managersyria);

        ArrayList<Card> CardTurkey = new ArrayList<>();
        CardTurkey.add(new Card("Reconstruction of children's schools","230000","50%",R.drawable.child2,R.drawable.turkey));
        CardTurkey.add(new Card("donate for hunger people","50000","25%",R.drawable.earthquake,R.drawable.turkey));
        CardTurkey.add(new Card("Reconstruction of children's schools","650000","75%",R.drawable.earthquake1,R.drawable.turkey));
        CardTurkey.add(new Card("donate for hunger people","1000000","95%",R.drawable.earthquake2,R.drawable.turkey));
        CardTurkey.add(new Card("Reconstruction of children's schools","90000","25%",R.drawable.child1,R.drawable.turkey));
        CardAdapter adapterturkey = new CardAdapter(CardTurkey, getActivity());
        TurkeyRecycleView.setAdapter(adapterturkey);

        LinearLayoutManager managerturkey = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        TurkeyRecycleView.setLayoutManager(managerturkey);

        ArrayList<Card> AllCards = new ArrayList<>();
        AllCards.add(new Card("Reconstruction of children's schools","230000","50%",R.drawable.child2,R.drawable.syria));
        AllCards.add(new Card("donate for hunger people","50000","25%",R.drawable.earthquake,R.drawable.turkey));
        AllCards.add(new Card("Reconstruction of children's schools","650000","75%",R.drawable.earthquake1,R.drawable.turkey));
        AllCards.add(new Card("donate for hunger people","1000000","95%",R.drawable.earthquake2,R.drawable.syria));
        AllCards.add(new Card("Reconstruction of children's schools","90000","25%",R.drawable.child2,R.drawable.syria));
        AllCards.add(new Card("Reconstruction of children's schools","90000","25%",R.drawable.earthquake,R.drawable.syria));
        AllCards.add(new Card("Reconstruction of children's schools","90000","25%",R.drawable.child1,R.drawable.turkey));
        AllCardAdapter adapterall = new AllCardAdapter(AllCards, getActivity());
        AllDonationsRecycleView.setAdapter(adapterall);

        LinearLayoutManager managerall = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        AllDonationsRecycleView.setLayoutManager(managerall);
        return view;
    }
    private void InisializationOfFealds(){
        SyriaRecycleView = view.findViewById(R.id.SyriaRecycleView);
        TurkeyRecycleView = view.findViewById(R.id.TurkeyRecycleView);
        AllDonationsRecycleView = view.findViewById(R.id.AllDonationsRecycleView);
    }
}