package com.example.lubaba_midterm_12022;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int playing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(R.string.activity1);

        MediaPlayer catPlayer= MediaPlayer.create(this,R.raw.track1);
        final ImageView catImage= (ImageView) findViewById(R.id.catImage);
        final Button mainButton3 = (Button) findViewById(R.id.activity3);
        final Button mainButton4 = (Button) findViewById(R.id.activity4);

        mainButton3.setOnClickListener(e-> startActivity(new Intent(MainActivity.this,MainActivity2.class)));
        mainButton4.setOnClickListener(e-> startActivity(new Intent(MainActivity.this,MainActivity3.class)));
        catImage.setOnClickListener(e-> {
            switch (playing) {
                case 0:
                    catPlayer.start();
                    playing = 1;
                    break;
                case 1:
                    catPlayer.pause();
                    playing = 0;
                    break;
            }
        });
    }
}