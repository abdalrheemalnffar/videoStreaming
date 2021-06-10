package com.example.videostreaming;

import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;

public class vedio44 extends AppCompatActivity {

    String videoURL="https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4";
    PlayerView playerView;
    SimpleExoPlayer player;

    private boolean playwhenReady = true;
    private int currentWindow = 0;
    private long playBackPosition=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vediofour);

        playerView = findViewById(R.id.videoFour);

    }

    public void initVideo(){
        player = ExoPlayerFactory.newSimpleInstance(this);
        playerView.setPlayer(player);
        Uri uri = Uri.parse(videoURL);
        DataSource.Factory dataSourceFactory= new DefaultDataSourceFactory(this,"exoplayer-codelab");
        MediaSource mediaSource = new ProgressiveMediaSource.Factory(dataSourceFactory).createMediaSource(uri);

        player.setPlayWhenReady(playwhenReady);
        player.seekTo(currentWindow,playBackPosition);
        player.prepare(mediaSource,false,false);
    }

    public void releaseVideo(){
        if(player != null){
            playwhenReady    = player.getPlayWhenReady();
            playBackPosition = player.getCurrentPosition();
            currentWindow    = player.getCurrentWindowIndex();
            player.release();
            player= null;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        initVideo();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(player != null) {
            initVideo();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        releaseVideo();
    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseVideo();
    }

}
