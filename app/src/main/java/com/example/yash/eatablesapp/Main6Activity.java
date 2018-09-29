package com.example.yash.eatablesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Main6Activity extends AppCompatActivity {

    CheckBox cb1,cb2,cb3;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        cb1 = (CheckBox)findViewById(R.id.cb1);
        cb2 = (CheckBox)findViewById(R.id.cb2);
        cb3 = (CheckBox)findViewById(R.id.cb3);

        b = (Button)findViewById(R.id.b);
    }

    public void proceed(View v)
    {
        if(cb1.isChecked())
        {
            Intent i = new Intent(getApplication(),Main7Activity.class);
            Bundle bun = getIntent().getExtras();
            int a  = bun.getInt("val");
            int b  = 20;
            i.putExtra("a",a);
            i.putExtra("b",b);
            startActivity(i);
        }

        else if(cb2.isChecked())
        {
            Intent i = new Intent(getApplication(),Main7Activity.class);
            Bundle bun = getIntent().getExtras();
            int a  = bun.getInt("val");
            int b  = 50;
            i.putExtra("a",a);
            i.putExtra("b",b);
            startActivity(i);
        }

        else if(cb3.isChecked())
        {
            Intent i = new Intent(getApplication(),Main7Activity.class);
            Bundle bun = getIntent().getExtras();
            int a  = bun.getInt("val");
            int b  = 70;
            i.putExtra("a",a);
            i.putExtra("b",b);
            startActivity(i);
        }

        else
        {
            Intent i = new Intent(getApplication(),Main7Activity.class);
            Bundle bun = getIntent().getExtras();
            int a  = bun.getInt("val");
            int b  = 0;
            i.putExtra("a",a);
            i.putExtra("b",b);
            startActivity(i);
        }
    }
}
