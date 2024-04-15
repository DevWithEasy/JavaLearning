package com.example.fruitsinformation;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class DetailsActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_details);

        imageView = (ImageView) findViewById(R.id.image_id);
        textView = (TextView) findViewById(R.id.text_id);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            String value = bundle.getString("name");

            if(value.equals("apple")){
                imageView.setImageResource(R.drawable.apple);
                textView.setText(R.string.apple_details);
            }else if(value.equals("orange")){
                imageView.setImageResource(R.drawable.orange);
                textView.setText(R.string.orange_details);
            }else if(value.equals("guava")){
                imageView.setImageResource(R.drawable.guava);
                textView.setText(R.string.guava_details);
            }else if(value.equals("lemon")){
                imageView.setImageResource(R.drawable.lemon);
                textView.setText(R.string.lemon_details);
            }
        }
    }
}