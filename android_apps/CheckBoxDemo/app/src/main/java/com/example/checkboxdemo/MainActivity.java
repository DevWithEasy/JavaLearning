package com.example.checkboxdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private CheckBox milkBox,sugarBox,palmBox;
    private Button buyButtonView;
    private TextView resultView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        milkBox = (CheckBox) findViewById(R.id.milk_id);
        sugarBox = (CheckBox) findViewById(R.id.sugar_id);
        palmBox = (CheckBox) findViewById(R.id.palm_id);
        buyButtonView = (Button) findViewById(R.id.buy_btn_id);
        resultView = (TextView) findViewById(R.id.result_id);

        buyButtonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                if(milkBox.isChecked()){
                    String value = milkBox.getText().toString();
                    stringBuilder.append(value + " Added."+"\n");
                }
                if(sugarBox.isChecked()){
                    String value = sugarBox.getText().toString();
                    stringBuilder.append(value + " Added."+"\n");
                }
                if(palmBox.isChecked()){
                    String value = palmBox.getText().toString();
                    stringBuilder.append(value + " Added."+"\n");
                }
                resultView.setText(stringBuilder.toString());
            }
        });
    }
}