package com.example.oga.dsc_20_days_of_code_ab;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Debug;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Question10 extends AppCompatActivity {

    RadioButton q10option1;
    int q1answer, q2answer, q3answer, q4answer, q5answer, q6answer, q7answer, q8answer, q9answer, q10answer;
    int q1score, q2score, q3score, q4score, q5score, q6score, q7score, q8score, q9score, q10score;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question10);

        q10option1 = findViewById(R.id.q10option1);
    }

    public void back(View view) {
        Intent intent = new Intent(this, Question9.class);
        startActivity(intent);
    }

    public void reset(View view) {
        PreferenceUtils.resetScore(this);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onRadioButtonClicked(View view) {
        if (q10option1.isChecked()) {
            score = PreferenceUtils.getScore(this);
            PreferenceUtils.updateScore(this, score + 1);
        }
    }

    public void submit(View view) {

        int finalScore = PreferenceUtils.getScore(this);

        q1score = q1answer + q2answer + q3answer + q4answer + q5answer + q6answer + q7answer + q8answer + q9answer + q10answer;

        Toast.makeText(this, "You Scored " + finalScore + "/10", Toast.LENGTH_SHORT).show();
    }

}
