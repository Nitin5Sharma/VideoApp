package com.example.videoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.media2.session.MediaController;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        VideoView videoView;
        String videoPath = "android.resource://"+getPackageName()+"/"+ R.raw.hi_live_login_video_final_480 ;

       videoView=findViewById(R.id.loginvideo);
        Uri uri =Uri.parse(videoPath);
        videoView.setVideoURI(uri);

     videoView.requestFocus();
        videoView.start();

    }
}