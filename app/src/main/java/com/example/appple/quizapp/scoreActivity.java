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
        intent.getIntExtra("message1",correct);
        finalScore .setText("Your final result is" + correct + "/2");
        restartOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(in);
            }
        });

    }

    public void onStart(){
        super.onStart();
    }
   // public void initControls(){
        //finalscore = (TextView)findViewById(R.id.final_score);
       // finalscore = 0;
        //final SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(this);
        //int q1answer = app_preferences.getInt("answer_Value",0);
        //int q2answer = app_preferences.getInt("answer_Value1",0);
       // if(q1answer == 1){
        //    finalscore++;
       // }
       // if(q2answer == 1){
        //    finalscore++;
       // }
       // final_score.setText(finalscore + "/2");

   // }

}
