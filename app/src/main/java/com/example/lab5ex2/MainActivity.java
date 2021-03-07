package com.example.lab5ex2;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;



public class MainActivity  extends AppCompatActivity {

MediaPlayer player = new MediaPlayer();
int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player=MediaPlayer.create(this,R.raw.azan);
        Button bttn=(Button)findViewById(R.id.button);

        TextView tv =(TextView)findViewById(R.id.textView1);

        bttn.setOnClickListener(new View.OnClickListener());



        player = new MediaPlayer();
         player = MediaPlayer.create(this,R.raw.azan);
        playing = 0 ;


        switch(playing)

        {
            case 0:
                player.start();
                tv.setText("Azan is playing");
                playing = 1;

            case 1:
                player.pause();
                tv.setText("Azan is paused");
                playing = 0;
        }


    }

}