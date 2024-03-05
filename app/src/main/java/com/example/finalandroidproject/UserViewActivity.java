package com.example.finalandroidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserViewActivity extends AppCompatActivity {
    private Button addCar;
    private Button back;
    private Button book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_view);
        clickListenHandler();
        initCompo();
    }

    public void initCompo() {
        addCar = findViewById(R.id.addCar);
        back = findViewById(R.id.back);
        book = findViewById(R.id.book);
    }

    private void clickListenHandler() {
        addCar = findViewById(R.id.addCar);
        back = findViewById(R.id.back);
        book = findViewById(R.id.book);

        //login Listener
        addCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the UserViewActivity
                Intent intent = new Intent(UserViewActivity.this, AddVehicleActivity.class);
                startActivity(intent);
            }
        });

        // car
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the UserViewActivity
                Intent intent = new Intent(UserViewActivity.this, BookingCarActivity.class);
                startActivity(intent);
            }
        });

    }
}