package com.example.yash.eatablesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button b1,b2,b3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
    }

    public void clickpizza(View v)
    {
        Intent i1 = new Intent(getApplication(),Main3Activity.class);
        startActivity(i1);
    }

    public void clickburgers(View v)
    {
        Intent i2 = new Intent(getApplication(),Main4Activity.class);
        startActivity(i2);
    }

    public void clickcoffee(View v)
    {
        Intent i3 = new Intent(getApplication(),Main5Activity.class);
        startActivity(i3);
    }
}
