package com.example.appple.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import layout.ImageQuestion;

public class startQuiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_quiz);
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.container, new ImageQuestion())
                .commit();
    }
}
