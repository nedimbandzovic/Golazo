package com.example.golazo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ShopActivity extends AppCompatActivity {
    ImageView jerseys,tickets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        getSupportActionBar().hide();
        jerseys=findViewById(R.id.imageView85);
        tickets=findViewById(R.id.imageView87);
        tickets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ticket=new Intent(ShopActivity.this, TicketActivity.class);
                startActivity(ticket);
                overridePendingTransition(0, 0);

            }
        });
        jerseys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jersey_intent=new Intent(ShopActivity.this, JerseyActivity.class);
                startActivity(jersey_intent);
                overridePendingTransition(0, 0);

            }
        });

    }
}