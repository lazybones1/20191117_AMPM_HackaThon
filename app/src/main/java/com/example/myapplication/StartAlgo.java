package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class StartAlgo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_algo);
    }

    public void today(View v){
        Intent intent = new Intent(
                StartAlgo.this,
                AlgorithQ1.class);
        startActivity(intent);
    }
}
