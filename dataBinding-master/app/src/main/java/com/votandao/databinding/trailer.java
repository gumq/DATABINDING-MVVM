package com.votandao.databinding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class trailer extends AppCompatActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    private static final String EITGUIDE_URL = "https://.m.youtube.com/results?search_query=";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trailer);
//         youTubePlayerView = findViewById ( R.id.youtubePlayer );
//
//         onInitializedListener = new YouTubePlayer.OnInitializedListener () {
//             @Override
//             public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
//                 youTubePlayer.loadVideo ( " VQttXb6qE6k" );
//                 youTubePlayer.setFullscreen(true);
//                 youTubePlayerView.initialize ( "AIzaSyBR24e2HNGPb1G7vDA6LSEs17Ph2G8g7S4" ,onInitializedListener);
//             }
//
//             @Override
//             public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
//
//             }
//         };

         WebView  webView =(WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient ());
        webView.getSettings().setJavaScriptEnabled(true);

        Intent intent = getIntent();
        String titleM = intent.getStringExtra("title");
        webView.loadUrl(EITGUIDE_URL+titleM.toString ());


       webView.setOnKeyListener(new View.OnKeyListener ()
        {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event)
            {
                if(event.getAction() == KeyEvent.ACTION_DOWN)
                {
                    WebView webView = (WebView) v;

                    switch(keyCode)
                    {
                        case KeyEvent.KEYCODE_BACK:
                            if(webView.canGoBack())
                            {
                                webView.goBack();
                                return true;
                            }
                            break;
                    }
                }

                return false;
            }
        });
    }


}