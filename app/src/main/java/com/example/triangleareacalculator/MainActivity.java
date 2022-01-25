package com.example.triangleareacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    
    private EditText widthInput;
    private EditText heightInput;
    private Button calculateButton;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        widthInput = findViewById(R.id.widthInput);
        heightInput = findViewById(R.id.heightInput);
        calculateButton = findViewById(R.id.calculateButton);
        resultText = findViewById(R.id.resultText);

        calculateButton.setOnClickListener(view -> {

           double width = Double.parseDouble(widthInput.getText().toString());
           double height = Double.parseDouble(heightInput.getText().toString());
           double result = (width * height) / 2;

           if(result <= 0) {
               resultText.setText("Invalid input");
           } else {
               resultText.setText(String.valueOf(result));
           }

        });
    }
}