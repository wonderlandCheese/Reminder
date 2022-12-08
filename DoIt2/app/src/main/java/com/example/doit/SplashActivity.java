package com.example.doit; // splash activity in AndroidManifest.xml is set as a LAUNCHER. delete <intent filter with main activity as a LAUNCHER
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();   // this will hide the support action bar of my activity
        //after splash activity, we need to show main activity:
        final Intent i = new Intent(SplashActivity.this, MainActivity.class);  // this launch main activity from this class activity screen
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(i);
                finish();
            }
        }, 2000);  //after 2 second we showing main activity
    }
}
