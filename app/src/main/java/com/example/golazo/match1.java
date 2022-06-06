package com.example.golazo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class match1 extends AppCompatActivity {
    TextView result;
    ImageView rik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match1);
        result=findViewById(R.id.textView40);
        Intent intent=getIntent();
        String resultz=intent.getStringExtra("zeljorezultat");
        result.setText(resultz);
        getSupportActionBar().hide();
        rik=findViewById(R.id.rikvercikona);
        rik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                match1.super.onBackPressed();
            }
        });

    }
}