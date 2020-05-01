package com.example.covid19project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity9 extends AppCompatActivity {
Button bt2,bt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_9);
        getSupportActionBar().setTitle("Precautions");
        bt2=findViewById(R.id.bt2);
        bt3=findViewById(R.id.bt3);

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte=new Intent(Activity9.this,com.example.covid19project.HomeActivity.class);
                startActivity(inte);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte=new Intent(Activity9.this,com.example.covid19project.Activity10.class);
                startActivity(inte);
            }
        });
    }
    public void brow(View view)
    {
        Intent broweserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.who.int/emergencies/diseases/novel-coronavirus-2019/advice-for-public"));
        startActivity(broweserIntent);
    }
}
