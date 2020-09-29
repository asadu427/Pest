package com.example.pest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class Insects extends AppCompatActivity {
    VideoView vid;
     Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_insects);
        getSupportActionBar().hide();            vid = (VideoView)findViewById(R.id.videoView);
        MediaController m = new MediaController(this);
        vid.setMediaController(m);
        b1 = findViewById(R.id.search);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.vid);
        vid.setVideoURI(uri);
        vid.start();vid.start();
        b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(Insects.this,totalin.class);
        startActivity(intent);
    }
});

    }

    }

