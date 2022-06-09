package com.example.golazo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.transform.Result;

public class TicketActivity extends AppCompatActivity {
    EditText search;
    ImageView go;
    ImageView logo1,logo2,logo3,logo4,logo5,logo6,rikverc;
    TextView match1,match2,match3,match4,match5,match6;
    TextView comp1,comp2,comp3,comp4,comp5,comp6, announcement;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);
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

        rikverc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent return1=new Intent(TicketActivity.this, ResultActivity.class);
                startActivity(return1);
                overridePendingTransition(0,0);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_test=new Intent(TicketActivity.this, BosniaRomania.class);
                startActivity(intent_test);
                overridePendingTransition(0,0);

            }
        });
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (search.getText().toString().equals("nations")){
                    logo1.setImageResource(R.drawable.nationsleaguex);
                    logo2.setImageResource(R.drawable.nationsleaguex);
                    logo3.setImageResource(R.drawable.nationsleaguex);
                    logo4.setImageResource(R.drawable.nationsleaguex);
                    logo5.setImageResource(R.drawable.nationsleaguex);
                    logo6.setImageResource(R.drawable.nationsleaguex);
                    comp1.setText("UEFA Nations League");
                    comp2.setText("UEFA Nations League");
                    comp3.setText("UEFA Nations League");
                    comp4.setText("UEFA Nations League");
                    comp5.setText("UEFA Nations League");
                    comp6.setText("UEFA Nations League");
                    match1.setText("Bosnia&Herzegovina - Romania");
                    match2.setText("Finland - Montenegro");
                    match3.setText("Lithuania - Turkey");
                    match4.setText("Faroe Islands - Luxembourg");
                    match5.setText("Moldova - Gibraltar");
                    match6.setText("Bulgaria - Georgia");
                    announcement.setText("More...");


                }
            }
        });



    }
}