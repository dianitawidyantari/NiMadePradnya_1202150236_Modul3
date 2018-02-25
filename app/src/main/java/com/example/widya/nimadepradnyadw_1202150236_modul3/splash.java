package com.example.widya.nimadepradnyadw_1202150236_modul3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //akan pindah ke activity lain sesuai waktu yang ditentukan
                Intent ganti = new Intent(splash.this,login.class);
                startActivity(ganti);
            //digunakan untuk menentukan waktu splash
            }
        }, 2000);
    }
}

