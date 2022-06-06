package com.example.golazo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        getSupportActionBar().hide();
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

                }


            }
        });
    }
}