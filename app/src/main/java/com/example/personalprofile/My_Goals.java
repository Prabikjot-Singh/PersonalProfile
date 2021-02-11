package com.example.personalprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class My_Goals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_goals);

        ListView listView = (ListView) findViewById(R.id.listView);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("I just don't go for big goals i always start with a small goal that i can achieve.");
        arrayList.add("Making Something that can have a good impact on the society is also one of my dream");
        arrayList.add("Everyone has a dream of having a luxurious life style so do I.");
        arrayList.add("I also have a dream to do something for the needy people so this will also be my goal.");
        arrayList.add("one of my biggest goal is to make my parents proud.");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);
    }
}