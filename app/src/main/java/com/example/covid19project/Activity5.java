package com.example.covid19project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity5 extends AppCompatActivity {
Button btn10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        getSupportActionBar().setTitle("Treatment of COVID-19");
        getSupportActionBar().setSubtitle("Confirmation Tests");

        btn10=findViewById(R.id.btn10);

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte=new Intent(Activity5.this,com.example.covid19project.Activity6.class);
                startActivity(inte);
            }
        });
    }
}
