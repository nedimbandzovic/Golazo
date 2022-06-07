package com.example.golazo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.ImageView;

public class CalendarActivity extends AppCompatActivity {
    ImageView returnBack;
    CalendarView calendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        returnBack=findViewById(R.id.imageView66);
        calendarView=findViewById(R.id.calendarView);
        calendarView.setDate(System.currentTimeMillis(),false,true);

        returnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CalendarActivity.this, ResultActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);

            }
        });
    }
}