package com.example.appple.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class scoreActivity extends AppCompatActivity {


    Button restartOne;
    TextView finalScore;
    int correct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        restartOne =(Button) findViewById(R.id.restartButton);
        finalScore = (TextView)findViewById(R.id.final_score);
        Intent intent  = getIntent();
        correct = intent.getExtras().getInt("message1");/////////////////////////////////////////
        finalScore .setText("Your final result is" + correct + "/2");
        restartOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(in);
            }
        });

    }


}
