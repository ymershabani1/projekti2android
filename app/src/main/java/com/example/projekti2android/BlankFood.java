package com.example.projekti2android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BlankFood extends AppCompatActivity {

    TextView tvFoodInDetailsActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_food);

        tvFoodInDetailsActivity = findViewById(R.id.tvFoodInDetailsActivity);

        if (getIntent().getExtras() != null){
            String foodName = getIntent().getStringExtra("foodName");

            tvFoodInDetailsActivity.setText(foodName);

        }
    }
}