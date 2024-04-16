package com.example.fontdemo;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView textView1;
    private TextView textView2;
    private Typeface typeface1;
    private Typeface typeface2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textView1 = (TextView) findViewById(R.id.text1);
        textView2 = (TextView) findViewById(R.id.text2);

        typeface1 = Typeface.createFromAsset(getAssets(),"font/Quicksand_Bold.otf");
        typeface2 = Typeface.createFromAsset(getAssets(),"font/Quicksand_BoldItalic.otf");

        textView1.setTypeface(typeface1);
        textView2.setTypeface(typeface2);
    }
}