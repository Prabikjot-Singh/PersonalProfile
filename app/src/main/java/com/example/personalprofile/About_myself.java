package com.example.personalprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class About_myself extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_myself);

        ListView listView = (ListView) findViewById(R.id.listView);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("I am 19 and currently studying Computer Science at TRU.");
        arrayList.add("Always wanted to know how computer work so love coding .");
        arrayList.add("Working as an associate in Walmart.");
        arrayList.add("Travelling, cycling,Hiking and farming are some of my hobbies.");
        arrayList.add("Love to play Basketball.");
        arrayList.add("Watching movie with my friend is something i enjoy the most.");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);
    }

}