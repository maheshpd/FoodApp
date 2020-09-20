package com.createsapp.foodapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.createsapp.foodapp.R;
import com.createsapp.foodapp.model.BestForYou;

import java.util.List;

public class BestForYouAdapter extends RecyclerView.Adapter<BestForYouAdapter.BestForYouHolder> {

    Context context;
    List<BestForYou> bestForYouList;

    public BestForYouAdapter(Context context, List<BestForYou> bestForYouList) {
        this.context = context;
        this.bestForYouList = bestForYouList;
    }

    @NonNull
    @Override
    public BestForYouAdapter.BestForYouHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new BestForYouHolder(LayoutInflater.from(context).inflate(R.layout.best_for_you_row_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BestForYouAdapter.BestForYouHolder holder, int position) {
        holder.itemImage.setImageResource(bestForYouList.get(position).getImageUrl());
        holder.itemName.setText(bestForYouList.get(position).getName());
        holder.itemTime.setText(bestForYouList.get(position).getTime());
        holder.itemPrice.setText(bestForYouList.get(position).getPrice());
        holder.itemRating.setRating(Float.parseFloat(bestForYouList.get(position).getRating()));
    }

    @Override
    public int getItemCount() {
        return bestForYouList.size();
    }

    class BestForYouHolder extends RecyclerView.ViewHolder {

        ImageView itemImage;
        TextView itemPrice, itemTime, itemName;
        RatingBar itemRating;

        public BestForYouHolder(@NonNull View itemView) {
            super(itemView);

            itemImage = itemView.findViewById(R.id.item_image);
            itemPrice = itemView.findViewById(R.id.item_price);
            itemTime = itemView.findViewById(R.id.item_time);
            itemName = itemView.findViewById(R.id.item_name);
            itemRating = itemView.findViewById(R.id.ratingBar);

        }
    }

}
