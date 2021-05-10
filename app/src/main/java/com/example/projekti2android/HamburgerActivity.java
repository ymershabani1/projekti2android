package com.example.projekti2android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.projekti2android.adapters.HamburgerAdapter;
import com.example.projekti2android.models.Kuzhina;

import java.util.ArrayList;

public class HamburgerActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Kuzhina> kuzhinaList = new ArrayList<>();
    HamburgerAdapter hamburgerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hamburger);

        listView = findViewById(R.id.burgerListView);
        populateArrayList();
        hamburgerAdapter = new HamburgerAdapter(this, kuzhinaList);
        listView.setAdapter(hamburgerAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(HamburgerActivity.this, BlankFood.class);
                intent.putExtra("foodName", kuzhinaList.get(position-1).getName());
                startActivity(intent);


            }
        });

        View headerView = ((LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE)).inflate(R.layout.burger_header, null, false);
        listView.addHeaderView(headerView);

        headerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HamburgerActivity.this, "Header is clicked!", Toast.LENGTH_SHORT).show();
            }
        });


    }

    private void populateArrayList() {
        kuzhinaList.add(new Kuzhina(R.mipmap.ic_launcher,"Hamburger","Chicken Burger","45.55$"));
        kuzhinaList.add(new Kuzhina(R.mipmap.ic_launcher,"Hamburger","Double Burger","50.55$"));
        kuzhinaList.add(new Kuzhina(R.mipmap.ic_launcher,"Hamburger","Cheese Burger","35.55$"));


    }
}