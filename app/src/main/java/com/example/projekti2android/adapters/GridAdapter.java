package com.example.projekti2android.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.projekti2android.R;
import com.example.projekti2android.models.RestaurantMenu;

import java.util.ArrayList;

public class GridAdapter extends BaseAdapter {


    Context context;
    ArrayList<RestaurantMenu> arrayList;
    LayoutInflater inflater;

    public GridAdapter(Context context, ArrayList<RestaurantMenu> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.gridview_column,null);

        ImageView ivProductImg = view.findViewById(R.id.ivProductImg);
        TextView tvProductName = view.findViewById(R.id.tvProductName);

        RestaurantMenu restaurantMenu = arrayList.get(position);

        ivProductImg.setImageResource(restaurantMenu.getImage());
        tvProductName.setText(restaurantMenu.getName());

        return view;
    }
}