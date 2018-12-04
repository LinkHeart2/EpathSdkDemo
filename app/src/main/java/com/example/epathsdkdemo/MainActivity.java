package com.example.epathsdkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.shitu.epathmap.EpathMapSDK;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jumpEpath(View view) {
        new Thread(){
            @Override
            public void run() {
                EpathMapSDK.openEpathMapActivity(MainActivity.this,"vf4sbrBYP9");

            }
        }.start();
    }
}
