package com.example.zoomcontroldemo;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ZoomControls;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageView image;
    private ZoomControls zoom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        image = (ImageView) findViewById(R.id.image_id);
        zoom = (ZoomControls) findViewById(R.id.zoom_id);

        zoom.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float x = image.getScaleX();
                float y = image.getScaleY();
                image.setScaleX((float) (x+1));
                image.setScaleX((float) (y+1));
            }
        });
        zoom.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float x = image.getScaleX();
                float y = image.getScaleY();
                image.setScaleX((float) (x-1));
                image.setScaleX((float) (y-1));
            }
        });
    }
}