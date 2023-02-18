package com.example.donationapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.donationapp.Model.Card;
import com.example.donationapp.R;
import com.example.donationapp.ViewHolder.CardViewHolder;

import java.util.ArrayList;

public class MyDonationAdapter extends RecyclerView.Adapter<CardViewHolder>{
    ArrayList<Card> Cards; //list of data
    Context context;

    public MyDonationAdapter(ArrayList<Card> cards, Context context) {
        Cards = cards;
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.mydonation_card,parent,false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        holder.Title.setText(Cards.get(position).getTitle());
        holder.TargetPrice.setText(Cards.get(position).getTargetPrice());
        holder.TargetPercent.setText(Cards.get(position).getTargetPercent());
        holder.image.setImageResource(Cards.get(position).getImage());
        holder.Flag.setImageResource(Cards.get(position).getFlag());

    }

    @Override
    public int getItemCount() {
        return Cards.size();
    }
}
