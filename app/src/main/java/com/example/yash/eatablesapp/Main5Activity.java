package com.example.yash.eatablesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main5Activity extends AppCompatActivity {

    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
    }

    public void clickadd1(View v)
    {
        Intent i1 = new Intent(getApplication(),Main11Activity.class);
        i1.putExtra("val",100);
        startActivity(i1);
    }

    public void clickadd2(View v)
    {
        Intent i2 = new Intent(getApplication(),Main11Activity.class);
        i2.putExtra("val",120);
        startActivity(i2);
    }

    public void clickadd3(View v)
    {
        Intent i3 = new Intent(getApplication(),Main11Activity.class);
        i3.putExtra("val",150);
        startActivity(i3);
    }
}
