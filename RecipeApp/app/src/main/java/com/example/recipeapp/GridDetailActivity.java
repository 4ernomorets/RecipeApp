package com.example.recipeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


public class GridDetailActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener, YouTubePlayer.PlaybackEventListener, YouTubePlayer.PlayerStateChangeListener {

    int position;
    private ImageView imageView;
    private TextView textView;
    private TextView dtextView;
    private TextView titletextView;
    YouTubePlayerView playerView;

    String API_KEY="AIzaSyDNuszrV_3bVLx4IjROl_6JNb36m6DwUsA";

    public  String[] VIDEO_ID ={
            "5__wUabM0y8",
            "MIuXxozpbAU",
            "tfK03JgZjBE",
            "EGzH5Bt5ibk",
            "VXPsd-9had4",
            "-7qe_JaXwyKE",
            "_KXyR_MMP2Q",
            "N38UF2z_BIk",
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_detail);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_detail);
        playerView = (YouTubePlayerView) findViewById(R.id.playerview);
        playerView.initialize(API_KEY, this);






        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Вы оценили", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });



        setTitle(" Grid Details Activity ");


        Intent i = getIntent();
        position = i.getExtras().getInt("id");

        MyGridAdapter gridAdapter = new MyGridAdapter(this);


        List<ImageView> mItems = new ArrayList<ImageView>();


        for (int position = 0; position < gridAdapter.getCount(); position++) {
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(gridAdapter.mThumbIds[position]);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);




            mItems.add(imageView);
        }


        imageView = (ImageView)findViewById(R.id.image_grddetails);
        imageView.setImageResource(gridAdapter.mThumbIds[position]);

        textView = (TextView)findViewById(R.id.description_TextView);
        textView.setText(gridAdapter.mDescriptionTXT[position]);

        dtextView = (TextView)findViewById(R.id.details_text);
        dtextView.setText(gridAdapter.Ingredients[position]);

        titletextView = (TextView)findViewById(R.id.restitle);
        titletextView.setText(gridAdapter.mRecipeTitle[position]);




    }




    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        youTubePlayer.setPlayerStateChangeListener(this);
        youTubePlayer.setPlaybackEventListener(this);
        if(!b){
            youTubePlayer.cueVideo(VIDEO_ID[position]);
            Log.e("POSITION", ""+VIDEO_ID[position]);
        }

    }

    @Override
    public void onPlaying() {

    }

    @Override
    public void onLoaded(String s) {

    }

    @Override
    public void onLoading() {

    }

    @Override
    public void onVideoStarted() {

    }

    @Override
    public void onVideoEnded() {

    }

    @Override
    public void onError(YouTubePlayer.ErrorReason errorReason) {

    }

    @Override
    public void onAdStarted() {

    }

    @Override
    public void onBuffering(boolean b) {

    }

    @Override
    public void onStopped() {

    }

    @Override
    public void onPaused() {

    }

    @Override
    public void onSeekTo(int i) {

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }


}
