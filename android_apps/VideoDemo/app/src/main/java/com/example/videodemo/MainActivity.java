package com.example.videodemo;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        video = (VideoView) findViewById(R.id.video_id);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.demo_video);
        video.setVideoURI(uri);
        MediaController mediaController = new MediaController(MainActivity.this);
        video.setMediaController(mediaController);
        video.start();
    }
}