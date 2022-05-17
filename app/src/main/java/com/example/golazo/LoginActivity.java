package com.example.golazo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    TextView signUp;
    EditText username, password;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        signUp=findViewById(R.id.textView4);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);

            }
        });
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        button=findViewById(R.id.loginbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameText=username.getText().toString();
                String passwordText=password.getText().toString();
                if (usernameText.isEmpty()||passwordText.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Fill in both fields", Toast.LENGTH_SHORT).show();
                } else{
                    UserDatabase userDatabase=UserDatabase.getUserDatabase(getApplicationContext());
                    UserDao userDao=userDatabase.userDao();
                    new Thread(new Runnable(){
                        @Override
                        public void run(){
                            User user= userDao.login(usernameText, passwordText);
                            if (user == null){
                                runOnUiThread(new Runnable(){@Override
                                    public void run() {
                                        Toast.makeText(getApplicationContext(), "Entered credentials are not correct, try again", Toast.LENGTH_SHORT).show();
                                    }
                                });
                            } else{
                                Intent intent=new Intent (LoginActivity.this, WelcomeScreen.class);
                                startActivity(intent);
                            }
                        }
                    }).start();
                }
            }
        });



    }
}