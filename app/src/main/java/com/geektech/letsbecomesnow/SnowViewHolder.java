package com.geektech.letsbecomesnow;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SnowViewHolder extends RecyclerView.ViewHolder {
    private TextView tvSnow;
    public SnowViewHolder(@NonNull View itemView) {
        super(itemView);
        tvSnow = itemView.findViewById(R.id.tv_snow);

    }
    public void bind(String contact){
        tvSnow.setText(contact);
    }
}
