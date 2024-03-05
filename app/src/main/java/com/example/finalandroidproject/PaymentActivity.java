package com.example.finalandroidproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.finalandroidproject.R;
import com.example.finalandroidproject.UserViewActivity;

public class PaymentActivity extends AppCompatActivity {
    public Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        initComponents();
        clickListenHandler();
    }
    public void initComponents() {
//Register Button
        back = findViewById(R.id.back1);
    }
    private void clickListenHandler() {
        back = findViewById(R.id.back1);
//login Listener
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// Start the UserViewActivity
                Intent intent = new Intent(PaymentActivity.this, UserViewActivity.class);
                startActivity(intent);
            }
        });
    }
}