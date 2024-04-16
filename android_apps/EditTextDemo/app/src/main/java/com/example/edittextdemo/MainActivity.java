package com.example.edittextdemo;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText weightTextView,heightTextView;
    Button calculateBtnView;
    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        weightTextView = (EditText) findViewById(R.id.weightViewId);
        heightTextView = (EditText) findViewById(R.id.heightViewId);
        calculateBtnView = (Button) findViewById(R.id.calculateBtnId);
        resultView = (TextView) findViewById(R.id.resultViewId);
    }

    public void calculate(View v){
        try {
            String weight_string = weightTextView.getText().toString();
            String height_string = heightTextView.getText().toString();

            double weight = Double.parseDouble(weight_string);
            double height = Double.parseDouble(height_string);
            double result = weight / ((height * 0.3048) * 2);

            if(result<18.5){
                resultView.setText("Underweight. BMI is- " + result);
            } else if (result> 18.4 && result < 24.9) {
                resultView.setText("Normal weight. BMI is- " + result);
            }else if (result> 24.8 && result < 30) {
                resultView.setText("Overweight. BMI is- " + result);
            }else if (result> 30) {
                resultView.setText("Obesity. BMI is- " + result);
            }
            Toast.makeText(MainActivity.this,"Successfully Calculated.",Toast.LENGTH_SHORT).show();
            Log.d("tags", "Calculation complete.");
        }catch (Exception e){
            Toast toast = Toast.makeText(MainActivity.this,"Please enter Valid Number",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);
        }


    }
}