package com.example.appple.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import layout.ImageQuestion;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAdapter = new FragmentAdapter(getSupportFragmentManager());

    }

    public void startQuiz(View V){
        Intent intent = new Intent(getApplicationContext(), ImageQuestion.class);
        startActivity(intent);

    }

}
