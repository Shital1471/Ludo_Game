package com.sap.ludo_offline;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.airbnb.lottie.LottieAnimationView;

public class countdown extends AppCompatActivity {
    LottieAnimationView lottieCountdown;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countdown);
        lottieCountdown=findViewById(R.id.countdown);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(countdown.this,LudoActivity.class);
                startActivity(intent);
            }
        },4000);
    }
}