package com.example.golazo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class BosniaRomania extends AppCompatActivity {
    RadioButton rb1,rb2,rb3;
    TextView txtvw;
    Button button;
    ImageView rikverc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bosnia_romania);
        getSupportActionBar().hide();
        rb1=findViewById(R.id.radioButton1);
        rb2=findViewById(R.id.radioButton2);
        rb3=findViewById(R.id.radioButton3);
        txtvw=findViewById(R.id.textView86);
        button=findViewById(R.id.button);
        rikverc=findViewById(R.id.imageView83);

        rikverc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
BosniaRomania.super.onBackPressed();            }
        });

        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb2.setChecked(false);
                rb3.setChecked(false);
                txtvw.setText("Price: 40 KM");

            }
        });
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb1.setChecked(false);
                rb3.setChecked(false);
                txtvw.setText("Price: 50 KM");

            }
        });
        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb1.setChecked(false);
                rb2.setChecked(false);
                txtvw.setText("Price: 65 KM");

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String x=txtvw.getText().toString();
                if (x.equals(null)){
                    Toast.makeText(getApplicationContext(), "Please choose one of the three options", Toast.LENGTH_SHORT).show();
                } else{
                    Intent proceed=new Intent(BosniaRomania.this, PaymentActivity.class);
                    proceed.putExtra("price", x);
                    startActivity(proceed);
                    overridePendingTransition(0,0);

                }
            }
        });

    }
}