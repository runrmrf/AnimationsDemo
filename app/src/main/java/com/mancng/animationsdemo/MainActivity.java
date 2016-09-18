package com.mancng.animationsdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

//    ImageView bart;
//    ImageView homer = (ImageView) findViewById(R.id.imgHomer);


    public void fade (View view) {

        ImageView bart = (ImageView) findViewById(R.id.imgBart);

            bart.animate()
                .translationXBy(1000f)
                .translationYBy(1000f)
                .rotationBy(3600)
                .setDuration(2000);

//        bart.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
//        ImageView homer = (ImageView) findViewById(R.id.imgHomer);
//        homer.animate().alpha(1f).setDuration(2000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bart = (ImageView) findViewById(R.id.imgBart);

        bart.setTranslationX(-1000f);
        bart.setTranslationY(-1000f);

    }
}
