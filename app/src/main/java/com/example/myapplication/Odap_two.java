package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class Odap_two extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView((R.layout.activity_odap_two));
    }


    public void solveTwo(View view){
        Intent intent = new Intent(Odap_two.this, SolveOdapTwo.class);
        startActivity(intent);
    }
}
