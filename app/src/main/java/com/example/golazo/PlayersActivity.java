package com.example.golazo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class PlayersActivity extends AppCompatActivity {
    EditText input;
    ImageView player1, player2,player3,player4,player5,player6,go, back;
    TextView name1,name2,name3,name4,name5,name6, more;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);
        go=findViewById(R.id.imageView64);
        player1=findViewById(R.id.logo1);
        player2=findViewById(R.id.logo5);
        player3=findViewById(R.id.logo4);
        player4=findViewById(R.id.logo3);
        player5=findViewById(R.id.logo2);
        player6=findViewById(R.id.logo6);
        name1=findViewById(R.id.team1);
        name2=findViewById(R.id.team6);
        name3=findViewById(R.id.team5);
        name4=findViewById(R.id.team4);
        name5=findViewById(R.id.team3);
        name6=findViewById(R.id.team2);
        input=findViewById(R.id.editTextTextPersonName);
        more=findViewById(R.id.textView72);
        back=findViewById(R.id.imageView61);

        getSupportActionBar().hide();
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent xs=new Intent(PlayersActivity.this, ResultActivity.class);
                startActivity(xs);
                overridePendingTransition(0,0);

            }
        });

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String x=input.getText().toString();

                if (x.equals("Edin")){
                    player1.setImageResource(R.drawable.dzeko);
                    name1.setText("Edin Džeko");
                    player2.setImageResource(R.drawable.cocalic);
                    name2.setText("Edin Cocalić");
                    player3.setImageResource(R.drawable.visca);
                    name3.setText("Edin Višća");
                    player4.setImageResource(R.drawable.cavani);
                    name4.setText("Edinson Cavani");
                    player5.setImageResource(R.drawable.lynch);
                    name5.setText("Edin Lynch");
                    player6.setImageResource(R.drawable.edinho);
                    name6.setText("Edinho");
                    more.setText("More...");
                }
                else if (x.equals("edin")){
                    player1.setImageResource(R.drawable.dzeko);
                    name1.setText("Edin Džeko");
                    player2.setImageResource(R.drawable.cocalic);
                    name2.setText("Edin Cocalić");
                    player3.setImageResource(R.drawable.visca);
                    name3.setText("Edin Višća");
                    player4.setImageResource(R.drawable.cavani);
                    name4.setText("Edinson Cavani");
                    player5.setImageResource(R.drawable.lynch);
                    name5.setText("Edin Lynch");
                    player6.setImageResource(R.drawable.edinho);
                    name6.setText("Edinho");
                    more.setText("More...");
                }
            }
        });

        player1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String xs=name1.getText().toString();
                if (xs.equals("Edin Džeko")){
                    Intent dzeko_intent=new Intent(PlayersActivity.this, edindzeko.class);
                    startActivity(dzeko_intent);
                    overridePendingTransition(0,0);

                }
            }
        });
        BottomNavigationView bottomNavigationView=findViewById(R.id.navigation);
        bottomNavigationView.setSelectedItemId(R.id.players);
        bottomNavigationView.setOnItemReselectedListener(new NavigationBarView.OnItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.matches:
                        startActivity(new Intent(PlayersActivity.this,ResultActivity.class));
                        finish();
                        overridePendingTransition(0,0);
                        return;

                    case R.id.players:
                    case R.id.leagues:
                        startActivity(new Intent(PlayersActivity.this,LeagueActivity.class));
                        finish();
                        overridePendingTransition(0,0);
                        return;
                    case R.id.settings:
                        startActivity(new Intent(PlayersActivity.this,SettingsActivity.class));
                        finish();
                        overridePendingTransition(0,0);
                        return;


                }


            }
        });
    }
    }
