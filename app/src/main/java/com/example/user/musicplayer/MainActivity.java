package com.example.user.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView pop = findViewById(R.id.pop);
        TextView rock = findViewById(R.id.rock);
        TextView jazz = findViewById(R.id.jazz);
        TextView metal = findViewById(R.id.metal);


        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent popIntent = new Intent(MainActivity.this, PopActivity.class);
                startActivity(popIntent);
            }

        });

        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rockIntent = new Intent(MainActivity.this, RockActivity.class);
                startActivity(rockIntent);
            }

        });

        jazz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jazzIntent = new Intent(MainActivity.this, JazzActivity.class);
                startActivity(jazzIntent);
            }

        });

        metal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent metalIntent = new Intent(MainActivity.this, MetalActivity.class);
                startActivity(metalIntent);
            }

        });
    }

}