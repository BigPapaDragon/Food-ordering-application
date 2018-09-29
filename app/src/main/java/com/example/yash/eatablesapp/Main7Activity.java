package com.example.yash.eatablesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main7Activity extends AppCompatActivity {

    EditText et1;
    EditText et2;
    EditText et3;

    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        et3 = (EditText)findViewById(R.id.et3);

        b = (Button)findViewById(R.id.b);

        Bundle bun = getIntent().getExtras();
        int a = bun.getInt("a");
        int b = bun.getInt("b");
        int c = a+b;

        et1.setText(Integer.toString(a));
        et2.setText(Integer.toString(b));
        et3.setText(Integer.toString(c));
    }

    public void place(View v)
    {
        Intent i = new Intent(getApplication(),Main8Activity.class);
        startActivity(i);
    }

}
