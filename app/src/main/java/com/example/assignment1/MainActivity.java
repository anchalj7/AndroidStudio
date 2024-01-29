package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
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
        Button convertButton =findViewById (R.id.convertButton);

        convertButton.setOnClickListener(newView.OnClickListener());{


            }
        }

    }
}