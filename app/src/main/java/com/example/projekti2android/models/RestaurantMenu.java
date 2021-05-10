package com.example.projekti2android.models;

public class RestaurantMenu {

    private int image;
    private String name;

    public RestaurantMenu(int image, String name) {
        this.image = image;
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }
}