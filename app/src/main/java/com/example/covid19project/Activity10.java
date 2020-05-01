package com.example.covid19project;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity10 extends AppCompatActivity {
Button mt1,mt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10);
        getSupportActionBar().setTitle("Thanks");
        mt2=findViewById(R.id.mt2);
        mt1=findViewById(R.id.mt1);

        mt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte=new Intent(Activity10.this,com.example.covid19project.HomeActivity.class);
                startActivity(inte);
            }
        });
    }
    public void bro(View view)
    {
        Intent broweserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://animesh328.github.io/WEBSITE/"));
        startActivity(broweserIntent);
    }
    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to exit the app?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        moveTaskToBack(true);
                        android.os.Process.killProcess(android.os.Process.myPid());
                        //finish();
                        System.exit(1);
                        //HomeActivity.super.onBackPressed();
                    }
                })

                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.cancel();

                    }
                });

        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }
}
