package com.example.donationapp.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.donationapp.CardDetailsActivity;
import com.example.donationapp.Model.Card;
import com.example.donationapp.R;
import com.example.donationapp.ViewHolder.CardViewHolder;

import java.util.ArrayList;

public class AllCardAdapter extends RecyclerView.Adapter<CardViewHolder>{
    ArrayList<Card> Cards; //list of data
    Context context;

    public AllCardAdapter(ArrayList<Card> cards, Context context) {
        Cards = cards;
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.all_card,parent,false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        holder.Title.setText(Cards.get(position).getTitle());
        holder.TargetPrice.setText(Cards.get(position).getTargetPrice());
        holder.TargetPercent.setText(Cards.get(position).getTargetPercent());
        holder.image.setImageResource(Cards.get(position).getImage());
        holder.Flag.setImageResource(Cards.get(position).getFlag());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, CardDetailsActivity.class);
                context.startActivity(i);
            }
        });
        holder.Delete.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onClick(View view) {
                Card i = Cards.get(position);
                Cards.remove(i);
                notifyDataSetChanged();
            }
        });

    }

    @Override
    public int getItemCount() {
        return Cards.size();
    }
}