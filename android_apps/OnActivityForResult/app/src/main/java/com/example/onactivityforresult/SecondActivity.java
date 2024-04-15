package com.example.onactivityforresult;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        button = (Button) findViewById(R.id.second_button_id);
        editText = (EditText) findViewById(R.id.second_text_id);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText.getText().toString();

                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                intent.putExtra("key",value);
                setResult(1,intent);
                finish();
            }
        });
    }
}