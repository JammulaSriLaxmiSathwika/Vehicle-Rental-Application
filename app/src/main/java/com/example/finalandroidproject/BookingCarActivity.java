package com.example.finalandroidproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class BookingCarActivity extends AppCompatActivity {
    private Button bookingCar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_car);
        initcompo();
        clickListenHandler();
    }
    public void initcompo(){
        bookingCar=findViewById(R.id.bookNow);
    }
    private void clickListenHandler() {
        bookingCar=findViewById(R.id.bookNow);
//booking Listener
        bookingCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// Start the UserViewActivity
                Intent intent = new Intent(BookingCarActivity.this, PaymentActivity.class);
                startActivity(intent);
            }
        });
    }
}