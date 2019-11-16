package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void goLevelBtn(View view){
        Intent intent = new Intent(
                      Start.this,
                       LevelChoice.class);
               startActivity(intent);
    }

    public void goodap(View view){
        Intent intent = new Intent(Start.this, Choose_Days_Odap.class);
        startActivity(intent);
    }

}
