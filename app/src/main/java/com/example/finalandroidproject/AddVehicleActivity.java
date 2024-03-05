package com.example.finalandroidproject;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalandroidproject.R;
import com.example.finalandroidproject.UserViewActivity;

public class AddVehicleActivity extends AppCompatActivity {
    private Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_vehicle);
        clickListenHandler();
        initComponents();
    }
    public void initComponents() {
//Register Button
        back = findViewById(R.id.back);
    }
    private void clickListenHandler() {
        back = findViewById(R.id.back);
//back Listener
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// Start the UserViewActivity
                Intent intent = new Intent(AddVehicleActivity.this, UserViewActivity.class);
                startActivity(intent);
            }
        });
    }
}