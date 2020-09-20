package com.createsapp.foodapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.createsapp.foodapp.R;
import com.createsapp.foodapp.model.NearBy;

import java.util.List;

public class NearByAdapter extends RecyclerView.Adapter<NearByAdapter.NearByHolder> {

    Context context;
    List<NearBy> nearByList;

    public NearByAdapter(Context context, List<NearBy> nearByList) {
        this.context = context;
        this.nearByList = nearByList;
    }

    @NonNull
    @Override
    public NearByHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new NearByHolder(LayoutInflater.from(context).inflate(R.layout.near_by_row_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NearByHolder holder, int position) {
        holder.itemImage.setImageResource(nearByList.get(position).getImageUrl());
        holder.itemName.setText(nearByList.get(position).getName());
        holder.itemTime.setText(nearByList.get(position).getTime());
    }

    @Override
    public int getItemCount() {
        return nearByList.size();
    }

    class NearByHolder extends RecyclerView.ViewHolder {

        ImageView itemImage;
        TextView itemTime, itemName;

        public NearByHolder(@NonNull View itemView) {
            super(itemView);

            itemImage = itemView.findViewById(R.id.item_image);
            itemTime = itemView.findViewById(R.id.item_name);
            itemName = itemView.findViewById(R.id.item_price);
        }
    }

}
