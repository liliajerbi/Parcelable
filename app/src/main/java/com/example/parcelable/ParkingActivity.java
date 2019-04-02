package com.example.parcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ParkingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking);



        TextView txtForBrand = (TextView) findViewById(R.id.tvBrand);
        TextView txtForKilometers = (TextView) findViewById(R.id. tvKilometrs);

        Intent intent = getIntent();
        Vehicle vehicle = intent.getParcelableExtra("INFORMATION");


        txtForBrand.setText(vehicle.getBrand());
        txtForKilometers.setText(Integer.toString(vehicle.getKilometers()));
    }
}
