package com.example.and1hw3;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MainHolder> {
    private ArrayList<Country> list = new ArrayList<>();

    public void setList(ArrayList<Country> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MainHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new MainHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MainHolder extends RecyclerView.ViewHolder{
        private TextView tv1,tv2;
        private ImageView img;
        public MainHolder(@NonNull View itemView) {
            super(itemView);
            tv1 = itemView.findViewById(R.id.countryName);
            tv2 = itemView.findViewById(R.id.capitalName);
            img = itemView.findViewById(R.id.flag);
        }

        public void onBind(Country country) {
            tv1.setText(country.getCountryName());
            tv2.setText(country.getCapitalName());
            img.setImageResource(country.getFlag());
        }
    }
}
