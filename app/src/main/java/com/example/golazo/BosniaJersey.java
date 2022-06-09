package com.example.golazo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class BosniaJersey extends AppCompatActivity {
    Button s,m,l,xl,xxl,proceed;
    TextView price;
    ImageView rikverc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bosnia_jersey);
        getSupportActionBar().hide();
        s=findViewById(R.id.button8);
        m=findViewById(R.id.button9);
        l=findViewById(R.id.button10);
        xl=findViewById(R.id.button11);
        xxl=findViewById(R.id.button12);
        price=findViewById(R.id.textView99);
        proceed=findViewById(R.id.button13);
        rikverc=findViewById(R.id.imageView90);
        rikverc.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            BosniaJersey.super.onBackPressed();
        }
    });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                price.setText("Size:S, 65 KM");
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                price.setText("Size:M, 65 KM");
            }
        });
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                price.setText("Size:L, 65 KM");
            }
        });
        xl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                price.setText("Size:XL, 70 KM");
            }
        });
        xxl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                price.setText("Size:XXL, 70 KM");
            }
        });
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String xss=price.getText().toString();
                Intent continue_purchase=new Intent(BosniaJersey.this, jerseypurchase.class);
                continue_purchase.putExtra("pricejersey",xss);

                startActivity(continue_purchase);

                overridePendingTransition(0,0);
            }
        });
    }
}