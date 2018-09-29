package com.example.yash.eatablesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        Toast.makeText(getApplicationContext(),"YOUR ORDER WILL BE DILIVERED IN 30 mins",Toast.LENGTH_LONG).show();
    }
}
