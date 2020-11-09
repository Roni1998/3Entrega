package com.eist.miaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class SplashSanto extends AppCompatActivity {
    private final int CD =3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_santo);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent Intent = new Intent(SplashSanto.this,MainActivity.class);
                startActivity(Intent);
                finish();

            }
        },CD);
    }
}