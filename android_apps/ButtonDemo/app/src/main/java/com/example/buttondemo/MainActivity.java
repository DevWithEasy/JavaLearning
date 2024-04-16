package com.example.buttondemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button loginBtnView,logoutBtnView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        loginBtnView = (Button) findViewById(R.id.loginBtnId);
        logoutBtnView = (Button) findViewById(R.id.logoutBtnId);
        textView = (TextView) findViewById(R.id.textViewId);
    }
    public void showMessage(View v){
        if(v.getId() == R.id.loginBtnId){
            textView.setText("Login Button Click.");
        }else{
            textView.setText("Logout Button Click.");
        }
    }
}