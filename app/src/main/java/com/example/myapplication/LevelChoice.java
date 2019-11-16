package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class LevelChoice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_choice);
    }

    public void goStartBtn(View v){
        Intent intent = new Intent(
                       LevelChoice.this,
                        StartAlgo.class);
                startActivity(intent);

    }

}
