package com.example.golazo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class BosnianPremierLeagueActivity extends AppCompatActivity {
    ImageView rikverc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bosnian_premier_league);
        getSupportActionBar().hide();
        rikverc=findViewById(R.id.imageView65);
        rikverc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BosnianPremierLeagueActivity.super.onBackPressed();
            }
        });

    }
}