package com.example.romitha.machinelearningcloudservicesapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

     Button nextPageButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        nextPageButton2 = (Button) findViewById(R.id.addButton);
        nextPageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondActivity();
            }
        });
    }
    public void SecondActivity(){
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);

    }

}