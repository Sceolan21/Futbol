package com.sceolan21.futbol;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class Video extends AppCompatActivity {
    VideoView video;
    MediaController mediaController;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        Bundle bundle = getIntent().getExtras();
        String fraseimportada=bundle.getString("tituloVideo");
        String textoPasado = fraseimportada;
        textView = (TextView)findViewById(R.id.texto);
        textView.setText(textoPasado);

        video = (VideoView)findViewById(R.id.video);
        mediaController = new MediaController(this);
        video.requestFocus();

        String videoPath= bundle.getString("rutaVideo");
        Uri uri = Uri.parse(videoPath);
        video.setVideoURI(uri);
        video.setMediaController(mediaController);
        video.start();
    }
}
