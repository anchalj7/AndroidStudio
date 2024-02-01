package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextMeters = findViewById(R.id.editTextMeters);
        final TextView textviewResult = findViewById(R.id.textviewResult);
        Button convertButton = findViewById(R.id.convertButton);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String metersStr = editTextMeters.getText().toString();
                try {
                    if (!metersStr.isEmpty()) {
                        double meters = Double.parseDouble(metersStr);
                        double inches = meters * 39.37;
                        textviewResult.setText(String.format("%.2f meters is %.2f inches", meters, inches));
                    } else {
                        textviewResult.setText("Please enter a value in meters");
                    }
                } catch (NumberFormatException e) {
                    textviewResult.setText("Please provide numeric value");
                }
            }
        });
    }
}