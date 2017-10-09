package com.project.my.thanh.nhat.pham.dang.mediaplayerdemo;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnPlayPause, btnStop, btnResume;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlayPause = (Button) findViewById(R.id.Button_PlayPause_MainActivity);
        btnStop = (Button) findViewById(R.id.Button_Stop_MainActivity);
        btnResume = (Button) findViewById(R.id.Button_Resume_MainActivity);

        btnPlayPause.setOnClickListener(this);
        btnStop.setOnClickListener(this);
        btnResume.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Button_PlayPause_MainActivity:
                if (btnPlayPause.getText().equals("Play")){
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.haynoidi);
                    mediaPlayer.start();
                    btnPlayPause.setText("Pause");
                } else {
                    mediaPlayer.pause();
                    btnPlayPause.setText("Play");
                }
                break;

            case R.id.Button_Stop_MainActivity:
                mediaPlayer.stop();
                btnPlayPause.setText("Play");
                break;

            case R.id.Button_Resume_MainActivity:
                mediaPlayer.start();
                break;
        }
    }
}
