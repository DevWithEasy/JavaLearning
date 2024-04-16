package com.example.radiobuttondemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroupView;
    private RadioButton genderView;
    private Button buttonView;
    private TextView resultView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        radioGroupView = (RadioGroup) findViewById(R.id.radio_id);
        buttonView = (Button) findViewById(R.id.button_id);
        resultView = (TextView) findViewById(R.id.result_id);

        buttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroupView.getCheckedRadioButtonId();
                genderView = (RadioButton)  findViewById(selectedId);

                String value = genderView.getText().toString();

                resultView.setText(value);
            }
        });
    }
}

