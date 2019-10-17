package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.io.InvalidClassException;

public class MainActivity extends AppCompatActivity {

    public static final String LOG_TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOG_TAG, "Hello world");
        Log.e(LOG_TAG,"ERROR MESSAGE", new InvalidClassException(""));

    }
}
