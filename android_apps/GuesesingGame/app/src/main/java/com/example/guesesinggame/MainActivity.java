package com.example.guesesinggame;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private EditText guessNumberView;
    private Button guessButtonView;
    private TextView resultView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        guessNumberView = (EditText) findViewById(R.id.guess_number_id);
        guessButtonView = (Button) findViewById(R.id.check_btn_id);
        resultView = (TextView) findViewById(R.id.result_view_id);

        LayoutInflater inflater = getLayoutInflater();
        View toastView = inflater.inflate(R.layout.custom_toast,(ViewGroup) findViewById(R.id.custom_toast_id));

        guessButtonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String guessString = guessNumberView.getText().toString();

                Random random = new Random();
                int randomNumber = random.nextInt(5)+1;

                if(guessString.isEmpty()){
                    errorMessage();
                    Toast toast = new Toast(getApplicationContext());
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                    toast.setView(toastView);
                    toast.show();
                }else{
                    int guess = Integer.parseInt(guessString);
                    if(guess > 5){
                        errorMessage();
                    }else{
                        if(guess == randomNumber){
                            resultView.setText("Congratulations!. You are Won");
                        }else{
                            resultView.setText("Sorry!. You are Loss. Guess Number "+ randomNumber);
                        }
                    }
                }
            }
        });
    }

    public void errorMessage(){
        guessNumberView.setError("Please Enter A valid Number");
        guessNumberView.requestFocus();
        return;
    }
}