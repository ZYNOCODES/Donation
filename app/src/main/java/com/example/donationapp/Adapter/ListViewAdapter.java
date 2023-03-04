package com.example.donationapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.donationapp.Model.Card;
import com.example.donationapp.R;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {

    ArrayList<Card> Card;
    Context context;

    public ListViewAdapter(ArrayList<Card> card, Context context) {
        this.Card = card;
        this.context = context;
    }

    @Override
    public int getCount() {
        return Card.size();
    }

    @Override
    public Object getItem(int position) {
        return Card.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = LayoutInflater.from(context).inflate(R.layout.all_card, viewGroup, false);
            holder.Title = view.findViewById(R.id.Title);
            holder.TargetPrice = view.findViewById(R.id.TargetPrice);
            holder.image = view.findViewById(R.id.image);
            holder.Flag = view.findViewById(R.id.Flag);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }

        holder.Title.setText(Card.get(position).getTitle());
        holder.TargetPrice.setText(Card.get(position).getTargetPrice());
        holder.image.setImageResource(Card.get(position).getImage());
        holder.Flag.setImageResource(Card.get(position).getFlag());

        return view;
    }
    class ViewHolder {
        ImageView          image;
        ImageView          Flag;
        TextView           Title;
        TextView           TargetPrice;
    }
}
