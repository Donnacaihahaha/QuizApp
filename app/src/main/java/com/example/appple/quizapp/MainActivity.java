package com.example.appple.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button startButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    startButton =(Button) findViewById(R.id.beginButton);
    startButton.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            Intent in = new Intent(getApplicationContext(), startQuiz.class);
            startActivity(in);

        }
    });
    }

}
