package com.example.ayaravoy.beeline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button Test;
    Button PushMe;
    TextView Android;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button PushMe = (Button) findViewById(R.id.btPushMe);
        TextView Android = (TextView) findViewById(R.id.tvAndroid);
    }
}
