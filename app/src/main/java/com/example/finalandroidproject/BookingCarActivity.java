package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class BookingCarActivity extends AppCompatActivity {
    private Button bookingCar;
    private TextView carNameTextView;
    private TextView tvmodel,tvkm;
    private ImageView carImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_car);
        initcompo();
        clickListenHandler();
        Intent intent = getIntent();
        if (intent != null) {
            String carName = intent.getStringExtra("carName");
            String carImage = intent.getStringExtra("carImage");
            String model = intent.getStringExtra("Model");
            String km = intent.getStringExtra("Milleage");
            Log.d("KM77777777",km);
            carNameTextView.setText(carName);
            tvmodel.setText(model);
            tvkm.setText(km);
            Picasso.get().load(carImage).into(carImageView);
        }
    }

    public void initcompo() {
        tvmodel = findViewById(R.id.tv_model);
        tvkm = findViewById(R.id.tv_km);
        carNameTextView = findViewById(R.id.carNameTextView);
        carImageView = findViewById(R.id.carImageView);

        bookingCar = findViewById(R.id.bookNow);
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
