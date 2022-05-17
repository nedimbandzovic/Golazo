package com.example.golazo;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText username, password, email, firstname, lastname;
    Button register;
    CheckBox checkBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();
        username=findViewById(R.id.newusername);
        password=findViewById(R.id.newpassword);
        email=findViewById(R.id.emailaddress);
        firstname=findViewById(R.id.firstname);
        lastname=findViewById(R.id.lastname);
        register=findViewById(R.id.registerbutton);
        checkBox=(CheckBox) findViewById(R.id.checkbox_meat);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, String.format("checkbox onClick, isSelected: %s, identityHashCode: %s", checkBox.isSelected(), System.identityHashCode(checkBox)));
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User user=new User();
                user.setUsername(username.getText().toString());
                user.setPassword(password.getText().toString());
                user.setFirstname(firstname.getText().toString());
                user.setLastname(lastname.getText().toString());
                user.setEmail(email.getText().toString());


                if (!validateInput(user)) {
                    Toast.makeText(getApplicationContext(), "You have to fill in all fields", Toast.LENGTH_SHORT).show();
                } else if (!validatePassword(user)) {
                    Toast.makeText(getApplicationContext(), "Password must have 8 characters", Toast.LENGTH_SHORT).show();
                } else if (!validateCheckBox()){
                    Toast.makeText(getApplicationContext(), "Our terms must be accepted if you want to use Golazo", Toast.LENGTH_SHORT).show();
                } else{
                    UserDatabase userDatabase = UserDatabase.getUserDatabase(getApplicationContext());
                    UserDao userDao = userDatabase.userDao();

                    new Thread(new Runnable() {

                        @Override
                        public void run() {
                            userDao.registerUser(user);
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(getApplicationContext(), "Your registration is successful", Toast.LENGTH_SHORT).show();

                                }
                            });
                        }


                    }).start();
                }



            }
        });
    }
    private Boolean validateInput (User user){
        if (user.getUsername().isEmpty()||user.getPassword().isEmpty()||user.getFirstname().isEmpty()){
            return false;
        }
        return true;
    }
    private Boolean validatePassword (User user){
        if (user.getPassword().length()<8){
            return false;
        }
        return true;
    }
    private Boolean validateCheckBox(){
        if (checkBox.isChecked()){
            return true;
        }
        return false;
    }
}