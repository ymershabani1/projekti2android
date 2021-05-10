package com.example.projekti2android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.projekti2android.adapters.GridAdapter;
import com.example.projekti2android.models.RestaurantMenu;

import java.util.ArrayList;

public class GridViewActivity extends AppCompatActivity {

    GridView gridView;

    ArrayList<RestaurantMenu> arrayList = new ArrayList<>();

    GridAdapter gridAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        gridView = findViewById(R.id.gridView);

        arrayList.add(new RestaurantMenu(R.mipmap.ic_launcher,"Coffe"));
        arrayList.add(new RestaurantMenu(R.mipmap.ic_launcher,"Honey"));
        arrayList.add(new RestaurantMenu(R.mipmap.ic_launcher,"French fries"));
        arrayList.add(new RestaurantMenu(R.mipmap.ic_launcher,"Coffe"));
        arrayList.add(new RestaurantMenu(R.mipmap.ic_launcher,"Honey"));
        arrayList.add(new RestaurantMenu(R.mipmap.ic_launcher,"French fries"));


        gridAdapter = new GridAdapter(this,arrayList);
        gridView.setAdapter(gridAdapter);


    }
}