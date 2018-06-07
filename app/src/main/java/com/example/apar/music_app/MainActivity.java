package com.example.apar.music_app;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }
    public void sampleMusic(View view)
    {

     //   mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.sample);
     //   mediaPlayer.start();


        Intent i=new Intent(MainActivity.this,PrimaryMusic.class);
        startActivity(i);

    }

}
