package com.mehboob.directmessageforwhatsapp.actvities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

import com.mehboob.directmessageforwhatsapp.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);



        gotoNext();
    }


    public void gotoNext() {
        new Handler().postDelayed(new Runnable() {

            public final void run() {
                Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class);
                mainIntent.putExtra("isStart", true);
                startActivity(mainIntent);
            }
        }, 600);
    }
}