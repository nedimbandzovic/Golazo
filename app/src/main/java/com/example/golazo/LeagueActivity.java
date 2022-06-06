package com.example.golazo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class LeagueActivity extends AppCompatActivity {
    ImageView logo1, logo2, logo3, logo4, logo5,logo6, go, rik;
    TextView text1,text2,text3,text4,text5,text6, suggested;
    EditText search;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_league);
        getSupportActionBar().hide();
        logo1=findViewById(R.id.logo1);
        logo2=findViewById(R.id.logo2);
        logo3=findViewById(R.id.logo3);
        logo4=findViewById(R.id.logo4);
        logo5=findViewById(R.id.logo5);
        logo6=findViewById(R.id.logo6);
        text1=findViewById(R.id.team1);
        text2=findViewById(R.id.team2);
        text3=findViewById(R.id.team3);
        text4=findViewById(R.id.team4);
        text5=findViewById(R.id.team5);
        text6=findViewById(R.id.team6);
        search=findViewById(R.id.editTextTextPersonName);
        go=findViewById(R.id.imageView64);
        suggested=findViewById(R.id.textView73);
        rik=findViewById(R.id.imageView61);

        rik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LeagueActivity.super.onBackPressed();
            }
        });



        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String x=search.getText().toString();
                if (x.toString().equals("pre")) {
                    logo1.setImageResource(R.drawable.englishpl);
                    logo5.setImageResource(R.drawable.mtelpremier);
                    logo4.setImageResource(R.drawable.premiership);
                    logo3.setImageResource(R.drawable.primeira);
                    logo2.setImageDrawable(null);
                    logo6.setImageDrawable(null);

                    text1.setText("Premier League");
                    text6.setText("m:tel Premier League");
                    text5.setText("Premiership");
                    text4.setText("Primeira");
                    text2.setText("");
                    text3.setText("");
                    suggested.setText("Found leagues");

                } else if (x.toString().equals("prem")) {
                        logo1.setImageResource(R.drawable.englishpl);
                        logo5.setImageResource(R.drawable.mtelpremier);
                        logo4.setImageResource(R.drawable.premiership);
                        logo3.setImageResource(R.drawable.primeira);
                        logo2.setImageDrawable(null);
                        logo6.setImageDrawable(null);

                        text1.setText("Premier League");
                        text6.setText("m:tel Premier League");
                        text5.setText("Premiership");
                        text4.setText("Primeira");
                        text2.setText("");
                        text3.setText("");
                        suggested.setText("Found leagues");

                }
                else if (x.toString().equals("premi")) {

                            logo1.setImageResource(R.drawable.englishpl);
                            logo5.setImageResource(R.drawable.mtelpremier);
                            logo4.setImageResource(R.drawable.premiership);
                            logo3.setImageResource(R.drawable.primeira);
                            logo2.setImageDrawable(null);
                            logo6.setImageDrawable(null);

                            text1.setText("Premier League");
                            text6.setText("m:tel Premier League");
                            text5.setText("Premiership");
                            text4.setText("Primeira");
                            text2.setText("");
                            text3.setText("");
                            suggested.setText("Found leagues");

                    }
                else if (x.toString().equals("premie")) {
                                logo1.setImageResource(R.drawable.englishpl);
                                logo5.setImageResource(R.drawable.mtelpremier);
                                logo4.setImageResource(R.drawable.premiership);
                                logo3.setImageResource(R.drawable.primeira);
                                logo2.setImageDrawable(null);
                                logo6.setImageDrawable(null);


                    text1.setText("Premier League");
                                text6.setText("m:tel Premier League");
                                text5.setText("Premiership");
                                text4.setText("Primeira");
                                text2.setText("");
                                text3.setText("");
                                suggested.setText("Found leagues");

                        }
                else if (x.toString().equals("premier")) {
                                    logo1.setImageResource(R.drawable.englishpl);
                                    logo5.setImageResource(R.drawable.mtelpremier);
                                    logo4.setImageResource(R.drawable.premiership);
                                    logo3.setImageResource(R.drawable.primeira);
                                    logo2.setImageDrawable(null);
                                    logo6.setImageDrawable(null);

                                    text1.setText("Premier League");
                                    text6.setText("m:tel Premier League");
                                    text5.setText("Premiership");
                                    text4.setText("Primeira");
                                    text2.setText("");
                                    text3.setText("");
                                    suggested.setText("Found leagues");

                            }
                else {
                    Toast.makeText(getApplicationContext(), "League not found", Toast.LENGTH_SHORT).show();


                }

            }
        });

        logo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text1.getText().toString().equals("Premier League")){
                    Intent intsx=new Intent(LeagueActivity.this, EnglishPremierLeagueActivity.class);
                    startActivity(intsx);
                    overridePendingTransition(0,0);

                }
            }
        });

        logo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text6.getText().toString().equals("m:tel Premier League")){
                    Intent intsxt=new Intent(LeagueActivity.this, BosnianPremierLeagueActivity.class);
                    startActivity(intsxt);
                    overridePendingTransition(0,0);

                }
            }
        });


        BottomNavigationView bottomNavigationView=findViewById(R.id.navigation);
        bottomNavigationView.setSelectedItemId(R.id.leagues);
        bottomNavigationView.setOnItemReselectedListener(new NavigationBarView.OnItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.matches:
                        startActivity(new Intent(LeagueActivity.this,ResultActivity.class));
                        finish();
                        overridePendingTransition(0,0);
                        return;

                    case R.id.leagues:

                    case R.id.settings:
                        startActivity(new Intent(LeagueActivity.this,SettingsActivity.class));
                        finish();
                        overridePendingTransition(0,0);
                        return;
                }


            }


        });





    }


}