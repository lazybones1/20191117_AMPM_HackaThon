package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class AlgorithQ1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algorith_q);



        Button b = (Button) findViewById(R.id.solveTwo);
        b.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View view) {
                EditText text = (EditText) findViewById(R.id.text_two);
                text.setText("오답입니다.");
            }
        });
    }
}
