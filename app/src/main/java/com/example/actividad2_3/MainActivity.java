package com.example.actividad2_3;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView mivideo = findViewById(R.id.videolol);

        String videope = "android.resource://" + getPackageName() + "/" + R.raw.oso;
        Uri uri = Uri.parse(videope);
        mivideo.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        mivideo.setMediaController(mediaController);
        mediaController.setAnchorView(mivideo);
    }

}