package com.example.donationapp.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.donationapp.R;
import com.google.android.material.card.MaterialCardView;

public class CardViewHolder extends RecyclerView.ViewHolder {
    public TextView Title;
    public TextView TargetPrice;
    public TextView TargetPercent;
    public ImageView image;
    public ImageView Flag;
    public MaterialCardView SliderPercent;
    public CardViewHolder(@NonNull View itemView) {
        super(itemView);
        Title = itemView.findViewById(R.id.Title);
        TargetPrice = itemView.findViewById(R.id.TargetPrice);
        TargetPercent = itemView.findViewById(R.id.TargetPercent);
        image = itemView.findViewById(R.id.image);
        Flag = itemView.findViewById(R.id.Flag);
        SliderPercent = itemView.findViewById(R.id.SliderPercent);
    }
}
