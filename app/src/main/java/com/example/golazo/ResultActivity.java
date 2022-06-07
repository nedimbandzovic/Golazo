package com.example.golazo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.MenuItem;


import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.Timer;
import java.util.TimerTask;

public class ResultActivity extends AppCompatActivity {
    Handler handler = new Handler();
    TextView minutes1;
    TextView minutes2;
    TextView minutes3;
    TextView result1;
    TextView result2;
    TextView result3;
    ImageView calendar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        getSupportActionBar().hide();
        minutes1 = (TextView) findViewById(R.id.textView9);
        minutes2 = (TextView) findViewById(R.id.textView13);
        minutes3 = (TextView) findViewById(R.id.textView22);
        result1 = (TextView) findViewById(R.id.textView11);
        result2 = (TextView) findViewById(R.id.textView15);
        result3 = (TextView) findViewById(R.id.textView24);
        calendar=findViewById(R.id.imageView70);
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calendar_intent=new Intent(ResultActivity.this, CalendarActivity.class);
                startActivity(calendar_intent);
                overridePendingTransition(0, 0);


            }
        });
        getSupportActionBar().hide();

        new CountDownTimer(6000, 1000) {

            public void onTick(long millisUntilFinished) {
                minutes1.setText("");
                minutes1.setText("89'");

            }

            public void onFinish() {
                minutes1.setText("90+");
                Animation anim = new AlphaAnimation(0.0f, 1.0f);
                anim.setDuration(50); //You can manage the blinking time with this parameter
                anim.setStartOffset(20);
                anim.setRepeatMode(Animation.REVERSE);
                anim.setRepeatCount(Animation.INFINITE);
                result1.setText("3-0");
                result1.setTextColor(Color.RED);
                result1.startAnimation(anim);
                new CountDownTimer(7000, 8000) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        minutes1.setText("FT");

                        minutes1.setTextColor(Color.WHITE);
                        result1.clearAnimation();
                        result1.setTextColor(Color.WHITE);
                    }
                }.start();
            }
        }.start();

        new CountDownTimer(16000, 1000) {

            public void onTick(long millisUntilFinished) {
                minutes2.setText("");
                minutes2.setText("84'");

            }

            public void onFinish() {
                Animation anim = new AlphaAnimation(0.0f, 1.0f);
                anim.setDuration(50); //You can manage the blinking time with this parameter
                anim.setStartOffset(20);
                anim.setRepeatMode(Animation.REVERSE);
                anim.setRepeatCount(Animation.INFINITE);
                result2.setText("1-2");
                result2.setTextColor(Color.RED);
                result2.startAnimation(anim);
                new CountDownTimer(7000, 8000) {
                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        minutes2.setText("85'");
                        minutes2.setTextColor(Color.RED);
                        result2.clearAnimation();
                        result2.setTextColor(Color.WHITE);
                        new CountDownTimer(7000, 8000) {
                            public void onTick(long millisUntilFinished) {
                            }

                            public void onFinish() {
                                minutes2.setText("86'");
                                new CountDownTimer(7000, 8000) {
                                    public void onTick(long millisUntilFinished) {
                                    }

                                    public void onFinish() {
                                        minutes2.setText("87'");
                                        new CountDownTimer(7000, 8000) {
                                            public void onTick(long millisUntilFinished) {
                                            }

                                            public void onFinish() {
                                                minutes2.setText("88'");
                                                new CountDownTimer(7000, 8000) {
                                                    public void onTick(long millisUntilFinished) {
                                                    }

                                                    public void onFinish() {
                                                        minutes2.setText("89'");
                                                        new CountDownTimer(7000, 8000) {
                                                            public void onTick(long millisUntilFinished) {
                                                            }

                                                            public void onFinish() {
                                                                minutes2.setText("90'");
                                                                new CountDownTimer(7000, 8000) {
                                                                    public void onTick(long millisUntilFinished) {
                                                                    }

                                                                    public void onFinish() {
                                                                        minutes2.setText("FT");
                                                                        minutes2.setTextColor(Color.WHITE);

                                                                    }
                                                                }.start();

                                                            }
                                                        }.start();

                                                    }
                                                }.start();

                                            }
                                        }.start();

                                    }
                                }.start();

                            }
                        }.start();
                    }
                }.start();
            }
        }.start();

        result1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (minutes1.getText().toString() != "FT") {
                    Toast.makeText(getApplicationContext(), "Wait for the match to finish in order to get the latest information", Toast.LENGTH_SHORT).show();

                } else {
                    Intent intent_zeljo = new Intent(ResultActivity.this, match1.class);
                    intent_zeljo.putExtra("zeljorezultat", result1.getText().toString());
                    startActivity(intent_zeljo);
                }

            }
        });

        result2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (minutes2.getText().toString() != "FT") {
                    Toast.makeText(getApplicationContext(), "Wait for the match to finish in order to get the latest information", Toast.LENGTH_SHORT).show();

                } else {
                    Intent sa = new Intent(ResultActivity.this, match2.class);
                    sa.putExtra("sarajevorezultat", result2.getText().toString());
                    startActivity(sa);
                }

            }
        });
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        bottomNavigationView.setSelectedItemId(R.id.matches);
        bottomNavigationView.setOnItemReselectedListener(new NavigationBarView.OnItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.leagues:
                        startActivity(new Intent(ResultActivity.this, LeagueActivity.class));
                        finish();
                        overridePendingTransition(0, 0);
                        return;

                    case R.id.matches:

                    case R.id.settings:
                        startActivity(new Intent(ResultActivity.this, SettingsActivity.class));
                        finish();
                        overridePendingTransition(0, 0);
                        return;

                    case R.id.players:
                        startActivity(new Intent(ResultActivity.this, PlayersActivity.class));
                        finish();
                        overridePendingTransition(0, 0);
                        return;
                }


            }
        });
    }
}

