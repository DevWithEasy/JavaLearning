package com.example.textviewdemo;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView nameTextView,ageTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        nameTextView = (TextView) findViewById(R.id.nameViewId);
        ageTextView = (TextView) findViewById(R.id.ageViewId);

        nameTextView.setText("Dilruba Yesmin Liza");
        ageTextView.setText("29 Years Old.");

    }
}