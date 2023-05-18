package com.example.foodapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapp.R;
import com.example.foodapp.model.AsianFood;

import java.util.List;

public class AsianFoodAdapter extends RecyclerView.Adapter<AsianFoodAdapter.FoodViewHolder> {

    Context context;
    List<AsianFood> FoodList;

    public AsianFoodAdapter(Context context, List<AsianFood> foodList) {
        this.context = context;
        FoodList = foodList;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.asian_food_row_item,parent,false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        holder.image.setImageResource(FoodList.get(position).getImageUrl());
        holder.name.setText(FoodList.get(position).getName());
        holder.price.setText(FoodList.get(position).getPrice());
        holder.restaurantName.setText(FoodList.get(position).getRestaurantName());
        holder.rating.setRating(FoodList.get(position).getRating());

    }

    @Override
    public int getItemCount() {
        return FoodList.size();
    }

    public static class FoodViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView name,price,restaurantName;
        RatingBar rating;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageView2);
            name = itemView.findViewById(R.id.name1);
            price = itemView.findViewById(R.id.price2);
            restaurantName = itemView.findViewById(R.id.restaurant_name);
            rating = itemView.findViewById(R.id.ratingBar);
        }
    }
}
