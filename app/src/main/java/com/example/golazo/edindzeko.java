package com.example.golazo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class edindzeko extends AppCompatActivity {
    ImageView imageView74, img75;
    TextView dzeko75;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edindzeko);
        getSupportActionBar().hide();
        imageView74=findViewById(R.id.imageView74);
        imageView74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edindzeko.super.onBackPressed();
            }
        });
        img75=findViewById(R.id.imageView75);
        dzeko75=findViewById(R.id.textView75);
        img75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, dzeko75.getText().toString());
                sendIntent.setType("text/plain");

                Intent shareIntent = Intent.createChooser(sendIntent, null);
                startActivity(shareIntent);
            }
        });


    }
}