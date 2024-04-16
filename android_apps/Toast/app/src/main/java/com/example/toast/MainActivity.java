package com.example.toast;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button toastBtn,customToastBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        toastBtn = (Button) findViewById(R.id.toast_id);
        customToastBtn = (Button) findViewById(R.id.custom_toast_id);

        toastBtn.setOnClickListener(this);
        customToastBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.toast_id){
            Toast.makeText(this, "I am default toast", Toast.LENGTH_SHORT).show();
        }else{
            LayoutInflater inflater = getLayoutInflater();
            View customToastView = inflater.inflate(R.layout.custom_toast,(ViewGroup) findViewById(R.id.custom_toast));
            Toast toast = new Toast(this);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setView(customToastView);
            toast.show();
        }
    }
}