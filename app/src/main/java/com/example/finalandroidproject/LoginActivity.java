package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private TextView register;
    private TextView login;
    private EditText email;
    private EditText password;
   private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initComponents();
        clickListenHandler();
    }

    public void initComponents() {
        //Register Button
        register = findViewById(R.id.register);
        //Login Button
        login = findViewById(R.id.login);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.login);
    }
    private void clickListenHandler() {
        //Register Button
        register = findViewById(R.id.register);
        //Login Button
        login = findViewById(R.id.login);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.login);

        //login Listener
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the UserViewActivity
                Intent intent = new Intent(LoginActivity.this, UserViewActivity.class);
                startActivity(intent);
            }
        });

        //Register Listener
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });

    }

}
