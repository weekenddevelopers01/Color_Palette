package com.weekenddevelopers.colorpalette;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener {

    TextView name;
    ImageView logo;
    Animation animFade;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        logo = findViewById(R.id.logo);


        animFade = AnimationUtils.loadAnimation(getBaseContext(), R.anim.fade);
        animFade.setAnimationListener(this);

        logo.startAnimation(animFade);
        name.startAnimation(animFade);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(MainActivity.this, HomePage.class);
                startActivity(in);
                finish();
            }
        },2000);

    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
logo.animate().alpha(0f);
name.animate().alpha(0f);
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}