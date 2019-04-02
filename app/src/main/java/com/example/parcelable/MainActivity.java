package com.example.parcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btGO = findViewById(R.id.btGo);
        btGO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText brandName = findViewById(R.id.etBrand);
                EditText kilometersNumber = findViewById(R.id.etKilmetrs);

                String brand = brandName.getText().toString();
                //String kilometers = kilometersNumber.getText().toString();
                int tkilometers =  Integer.parseInt(kilometersNumber.getText().toString());


                Vehicle vehicle = new Vehicle(brand , tkilometers);


                Intent intent = new Intent(MainActivity.this, ParkingActivity.class);
                intent.putExtra("INFORMATION", vehicle);
                startActivity(intent);
            }
        });
    }
}
