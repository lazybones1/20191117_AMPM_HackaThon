package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class Choose_Days_Odap extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_days_odap);
    }

    public void button16(View view){
        Intent intent = new Intent(Choose_Days_Odap.this, Odap_one.class);
        startActivity(intent);
    }

    public void button17(View view){
        Intent intent = new Intent(Choose_Days_Odap.this, Odap_two.class);
        startActivity(intent);
    }

}
