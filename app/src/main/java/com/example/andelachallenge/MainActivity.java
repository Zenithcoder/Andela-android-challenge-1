package com.example.andelachallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("ALC PHASE 1");
    }

    public void onButtonClick(View v){
        Intent myIntent = new Intent(getBaseContext(),   ActivityB.class);
        startActivity(myIntent);
    }

    public void onButtonClick2(View v){
        Intent myIntent = new Intent(getBaseContext(),   ActivityC.class);
        startActivity(myIntent);
    }
}
