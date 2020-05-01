package com.example.covid19project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity6 extends AppCompatActivity {
Button btn11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);
        getSupportActionBar().setTitle("Treatment of COVID-19");
        getSupportActionBar().setSubtitle("Medicine and Vaccine");
        btn11=findViewById(R.id.btn11);

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte=new Intent(Activity6.this,com.example.covid19project.HomeActivity.class);
                startActivity(inte);
            }
        });

    }
}
