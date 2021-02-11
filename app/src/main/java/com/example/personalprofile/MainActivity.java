package com.example.personalprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void aboutMe(View view) {
        Intent intent = new Intent(this, About_myself.class);
        startActivity(intent);
    }

    public void myGoals(View view) {
        Intent intent = new Intent(this, My_Goals.class);
        startActivity(intent);
    }
}