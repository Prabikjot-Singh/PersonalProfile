package com.example.personalprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView head, name2, program, st_id, about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        head = findViewById(R.id.header);
        name2 = findViewById(R.id.name2);
        program = findViewById(R.id.program);
        st_id = findViewById(R.id.st_id);
        about = findViewById(R.id.about);

    }
}