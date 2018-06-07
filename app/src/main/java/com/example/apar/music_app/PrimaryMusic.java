package com.example.apar.music_app;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class PrimaryMusic extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
 //   private Button start_key;
    private Button pause_key;
    private Button stop_key;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary_music);
        Button b1=(Button)findViewById(R.id.button);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer=MediaPlayer.create(PrimaryMusic.this,R.raw.sample);
                mediaPlayer.start();
            }
        });
/*
        pause_key.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();
            }
        });

        stop_key.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.stop();
            }
        });
*/



    }
    public void start(View view)
    {
        mediaPlayer=MediaPlayer.create(PrimaryMusic.this,R.raw.sample);
           mediaPlayer.start();

    }
}
