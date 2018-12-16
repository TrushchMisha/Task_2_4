package com.example.compi3.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart();");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onSResume();");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause();");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop();");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy();");
    }
}
