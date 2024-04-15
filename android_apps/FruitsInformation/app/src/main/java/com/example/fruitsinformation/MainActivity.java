package com.example.fruitsinformation;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button apple,orange,guava,lemon;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        apple = (Button) findViewById(R.id.apple_btn);
        orange = (Button) findViewById(R.id.orange_btn);
        guava = (Button) findViewById(R.id.guava_btn);
        lemon = (Button) findViewById(R.id.lemon_btn);

        apple.setOnClickListener(this);
        orange.setOnClickListener(this);
        guava.setOnClickListener(this);
        lemon.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.apple_btn){
            intent = new Intent(MainActivity.this,DetailsActivity.class);
            intent.putExtra("name","apple");
            startActivity(intent);
        }if(v.getId() == R.id.orange_btn){
            intent = new Intent(MainActivity.this,DetailsActivity.class);
            intent.putExtra("name","orange");
            startActivity(intent);
        }if(v.getId() == R.id.guava_btn){
            intent = new Intent(MainActivity.this,DetailsActivity.class);
            intent.putExtra("name","guava");
            startActivity(intent);
        }if(v.getId() == R.id.lemon_btn){
            intent = new Intent(MainActivity.this,DetailsActivity.class);
            intent.putExtra("name","lemon");
            startActivity(intent);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        AlertDialog.Builder alertDialogBuilder;
        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setTitle("Are you sure?");
        alertDialogBuilder.setMessage("Close the application");
        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}