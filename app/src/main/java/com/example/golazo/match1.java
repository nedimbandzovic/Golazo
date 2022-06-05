package com.example.golazo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class match1 extends AppCompatActivity {
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match1);
        result=findViewById(R.id.textView40);
        Intent intent=getIntent();
        String resultz=intent.getStringExtra("zeljorezultat");
        result.setText(resultz);
        getSupportActionBar().hide();

    }
}