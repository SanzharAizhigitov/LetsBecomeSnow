package com.geektech.letsbecomesnow;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SnowAdapter extends RecyclerView.Adapter<SnowViewHolder> {
    private ArrayList<String> snowsText;

    public SnowAdapter(ArrayList<String> snowsText) {
        this.snowsText = snowsText;
    }

    @NonNull
    @Override
    public SnowViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SnowViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_snow, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SnowViewHolder holder, int position) {
        holder.bind(snowsText.get(position));
    }

    @Override
    public int getItemCount() {
        return snowsText.size();
    }
}
