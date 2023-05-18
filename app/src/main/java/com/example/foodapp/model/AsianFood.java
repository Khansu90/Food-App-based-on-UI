package com.example.foodapp.model;

public class AsianFood {
    String name;
    Integer imageUrl;
    String price;
   Float rating;
   String restaurantName;

    public AsianFood(String name, Integer imageUrl, String price, Float rating, String restaurantName) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.price = price;
        this.rating = rating;
        this.restaurantName = restaurantName;
    }

    public String getName() {
        return name;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public String getPrice() {
        return price;
    }

    public Float getRating() {
        return rating;
    }

    public String getRestaurantName() {
        return restaurantName;
    }
}

