package com.example.foodapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.foodapp.adapter.AsianFoodAdapter;
import com.example.foodapp.adapter.PopularFoodAdapter;
import com.example.foodapp.model.AsianFood;
import com.example.foodapp.model.PopularFood;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView popularRecycler, asiaRecycler;
    PopularFoodAdapter popularFoodAdapter;
    AsianFoodAdapter asianFoodAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<PopularFood> popularFoods = new ArrayList<>();
        popularFoods.add(new PopularFood("Float Cake Vietnam", "$7.05", R.drawable.popularfood1));
        popularFoods.add(new PopularFood("Chicken drumstick", "$17.05", R.drawable.popularfood2));
        popularFoods.add(new PopularFood("Fish Tikka", "$7.05", R.drawable.popularfood3));
        popularFoods.add(new PopularFood("Float Cake Vietnam", "$7.05", R.drawable.popularfood1));
        popularFoods.add(new PopularFood("Chicken drumstick", "$17.05", R.drawable.popularfood2));
        popularFoods.add(new PopularFood("Fish Tikka", "$7.05", R.drawable.popularfood3));

        LayOutManager(popularFoods);



        List<AsianFood> asianFoods = new ArrayList<>();
        asianFoods.add(new AsianFood("Chicago Pizza",R.drawable.asiafood1,"$20.00",4.5f, "Briand Pizza"));
        asianFoods.add(new AsianFood("Strawberry Cake",R.drawable.asiafood2, "$15.50",4f,"Friends Restaurant"));

        asiaLayOutManager(asianFoods);


    }


    private void LayOutManager(List<PopularFood> popularFoods) {

        popularRecycler = findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        popularRecycler.setLayoutManager(layoutManager);
        popularFoodAdapter = new PopularFoodAdapter(this, popularFoods);
        popularRecycler.setAdapter(popularFoodAdapter);

    }


    private void asiaLayOutManager(List<AsianFood> asianFoods) {
        asiaRecycler = findViewById(R.id.asian_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        asiaRecycler.setLayoutManager(layoutManager);
        asianFoodAdapter = new AsianFoodAdapter(this, asianFoods);
        asiaRecycler.setAdapter(asianFoodAdapter);
    }

}


