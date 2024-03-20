package com.app.example_servicemusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button onstart,onstop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onstart=findViewById(R.id.onstart);
        onstop=findViewById(R.id.onstop);


        onstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             startService(new Intent(MainActivity.this,MusicService.class));
            }
        });


        onstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                stopService(new Intent(MainActivity.this,MusicService.class));
            }
        });
    }
}