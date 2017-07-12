package com.phenix.ci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((TextView) findViewById(R.id.tv_message)).setText(R.string.master);
        if (BuildConfig.DEBUG) {
            Log.d(TAG, "add something");
            Log.d(TAG, "testing ding ding notification!");
            Log.d(TAG, "message#1");
        }
    }
}
