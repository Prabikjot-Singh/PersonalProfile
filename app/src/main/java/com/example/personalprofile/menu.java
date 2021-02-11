package com.example.personalprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class menu extends AppCompatActivity {

    Button button1, button2, button3;
    TextView text1, text2;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        button1 = findViewById(R.id.jacob);
        button2 = findViewById(R.id.jass);
        button3 = findViewById(R.id.prabik);

        text1 = findViewById(R.id.header1);
        text2 = findViewById(R.id.group);

        img = findViewById(R.id.bgimage);
    }

    public void  jassProfile (View view) {

        Intent intent = new Intent( this, MainActivity2.class);
        startActivity(intent);
    }

    public void  prabikProfile (View view) {

        Intent intent = new Intent( this, MainActivity.class);
        startActivity(intent);
    }
}