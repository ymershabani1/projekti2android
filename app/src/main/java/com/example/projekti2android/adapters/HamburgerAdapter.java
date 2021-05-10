package com.example.projekti2android.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.projekti2android.R;
import com.example.projekti2android.models.Kuzhina;

import java.util.ArrayList;

public class HamburgerAdapter extends BaseAdapter {

    Context context;
    ArrayList<Kuzhina> kuzhinaArrayList = new ArrayList<>();
    LayoutInflater inflater;

    public HamburgerAdapter(Context context, ArrayList<Kuzhina> kuzhinaArrayList) {
        this.context = context;
        this.kuzhinaArrayList = kuzhinaArrayList;
        inflater = (LayoutInflater.from(context));

    }


    @Override
    public int getCount() {
        return kuzhinaArrayList.size();
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
        view = inflater.inflate(R.layout.hamburger_column,null);

        ImageView ivFood = view.findViewById(R.id.ivFood);
        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvDescription = view.findViewById(R.id.tvDescription);
        TextView tvPrice = view.findViewById(R.id.tvPrice);


        Kuzhina kuzhina = kuzhinaArrayList.get(position);

        ivFood.setImageResource(kuzhina.getImage());
        tvName.setText(kuzhina.getName());
        tvDescription.setText(kuzhina.getDescription());
        tvPrice.setText(kuzhina.getPrice());


        return view;
    }
}