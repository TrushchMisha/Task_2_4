package com.example.compi3.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText txt = findViewById(R.id.root);
        Button myButton = findViewById(R.id.btn);

        myButton.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {
                CharSequence s = txt.getText().toString();
                Toast toast = Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT);
                toast.show();

            }

        });


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

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
    }
}
