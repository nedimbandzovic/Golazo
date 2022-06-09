package com.example.golazo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class SettingsActivity extends AppCompatActivity {
    ImageView rikverc, logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        getSupportActionBar().hide();
        rikverc=findViewById(R.id.imageView54);
        logout=findViewById(R.id.imageView60);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SettingsActivity.this, LoginActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i);
                overridePendingTransition(0,0);
            }
        });
        rikverc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(SettingsActivity.this, ResultActivity.class);
                startActivity(intent3);
                overridePendingTransition(0,0);
            }
        });
        BottomNavigationView bottomNavigationView=findViewById(R.id.navigation);
        bottomNavigationView.setSelectedItemId(R.id.settings);
        bottomNavigationView.setOnItemReselectedListener(new NavigationBarView.OnItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.matches:
                        startActivity(new Intent(SettingsActivity.this,ResultActivity.class));
                        finish();
                        overridePendingTransition(0,0);
                        return;

                    case R.id.settings:
                    case R.id.leagues:
                        startActivity(new Intent(SettingsActivity.this,LeagueActivity.class));
                        finish();
                        overridePendingTransition(0,0);
                        return;
                    case R.id.players:
                        startActivity(new Intent(SettingsActivity.this,PlayersActivity.class));
                        finish();
                        overridePendingTransition(0,0);
                        return;


                }


            }
        });
    }
}