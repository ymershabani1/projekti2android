package com.example.projekti2android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StudentsActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);

        listView = findViewById(R.id.listView);

        String[] students =  {"Elbunit Ahmetaj","Ardit Hoti","Astrit Kurtishaj","Egzon Zylfiaj","Ymer Shabani"};

        ArrayAdapter studentsAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,students);

        listView.setAdapter(studentsAdapter);
    }
}