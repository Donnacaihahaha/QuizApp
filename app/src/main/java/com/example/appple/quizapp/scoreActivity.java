package com.example.appple.quizapp;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class scoreActivity extends AppCompatActivity {

    int finalscore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        initControls();
    }
    public void onStart(){
        super.onStart();
    }
    public void initControls(){
        finalscore = (TextView)findViewById(R.id.final_score);
        final SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(this);
        int q1answer = app_preferences.getInt("answer_Value",0);
        int q2answer = app_preferences.getInt("answer_Value1",0);
        if(q1answer == 1){
            finalscore++;
        }
        if(q2answer == 1){
            finalscore++;
        }
        final_score.setText(finalscore + "/2");

    }
}
