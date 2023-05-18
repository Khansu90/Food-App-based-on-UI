package com.example.foodapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapp.Details_activity;
import com.example.foodapp.R;
import com.example.foodapp.model.PopularFood;

import java.util.List;

public class PopularFoodAdapter extends RecyclerView.Adapter<PopularFoodAdapter.FoodViewHolder> {

    Context context;
    List<PopularFood> FoodList;

    public PopularFoodAdapter(Context context, List<PopularFood> foodList) {
        this.context = context;
        FoodList = foodList;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.popular_food_row_item,parent,false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        holder.image.setImageResource(FoodList.get(position).getImageUrl());
        holder.name.setText(FoodList.get(position).getName());
        holder.price.setText(FoodList.get(position).getPrice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, Details_activity.class);
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return FoodList.size();
    }

    public static class FoodViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView name,price;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageView2);
            name = itemView.findViewById(R.id.name);
            price = itemView.findViewById(R.id.price);
        }
    }
}
