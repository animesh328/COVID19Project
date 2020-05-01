package com.example.covid19project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity7 extends AppCompatActivity {
Button b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);
        getSupportActionBar().setTitle("Statistics of COVID-19");

        b3=findViewById(R.id.b3);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte=new Intent(Activity7.this,com.example.covid19project.HomeActivity.class);
                startActivity(inte);
            }
        });
    }
    public void browser1(View view)
    {
        Intent broweserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://news.google.com/covid19/map?hl=en-IN&gl=IN&ceid=IN:en"));
        startActivity(broweserIntent);
    }
    public void browser2(View view)
    {
        Intent broweserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.covid19india.org/"));
        startActivity(broweserIntent);
    }
}
