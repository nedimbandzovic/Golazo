package com.example.golazo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class JerseyActivity extends AppCompatActivity {
    EditText search;
    ImageView go;
    ImageView logo1,logo2,logo3,logo4,logo5,logo6,rikverc;
    TextView match1,match2,match3,match4,match5,match6,sell;
    TextView comp1,comp2,comp3,comp4,comp5,comp6, announcement;
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jersey);
        getSupportActionBar().hide();
        search=findViewById(R.id.editTextTextPersonName);
        go=findViewById(R.id.imageView64);
        logo1=findViewById(R.id.logo1);
        logo2=findViewById(R.id.logo5);
        logo3=findViewById(R.id.logo4);
        logo4=findViewById(R.id.logo3);
        logo5=findViewById(R.id.logo2);
        logo6=findViewById(R.id.logo6);
        comp1=findViewById(R.id.team1);
        comp2=findViewById(R.id.team6);
        comp3=findViewById(R.id.team5);
        comp4=findViewById(R.id.team4);
        comp5=findViewById(R.id.team3);
        comp6=findViewById(R.id.team2);
        match1=findViewById(R.id.match1);
        match2=findViewById(R.id.match2);
        match3=findViewById(R.id.match3);
        match4=findViewById(R.id.match4);
        match5=findViewById(R.id.match8);
        match6=findViewById(R.id.match91);
        announcement=findViewById(R.id.textView80);
        button1=findViewById(R.id.button1);
        rikverc=findViewById(R.id.imageView61);
        sell=findViewById(R.id.textView73);


        rikverc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JerseyActivity.super.onBackPressed();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_test2=new Intent(JerseyActivity.this, BosniaJersey.class);
                startActivity(intent_test2);
                overridePendingTransition(0,0);

            }
        });
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (search.getText().toString().equals("bosnia")){
                    logo1.setImageResource(R.drawable.dresbih1);
                    logo2.setImageResource(R.drawable.dresbih2);
                    logo3.setImageResource(R.drawable.dresbih3);
                    logo4.setImageResource(R.drawable.dresbih4);
                    logo5.setImageResource(R.drawable.dresbih5);
                    logo6.setImageResource(R.drawable.dresbih6);
                    comp1.setText("Bosnia and Herzegovina");
                    comp2.setText("Bosnia and Herzegovina");
                    comp3.setText("Bosnia and Herzegovina");
                    comp4.setText("Bosnia and Herzegovina");
                    comp5.setText("Bosnia and Herzegovina");
                    comp6.setText("Bosnia and Herzegovina");
                    match1.setText("2018-2019 Home shirt");
                    match2.setText("2020-2021 Home shirt");
                    match3.setText("2014 FIFA WC Fan shirt");
                    match4.setText("Fan-made shirt");
                    match5.setText("2015-2017 Away shirt");
                    match6.setText("2020-2021 Away shirt");
                    announcement.setText("More...");
                    sell.setText("Found jerseys");


                }
            }
        });



    }

    }
