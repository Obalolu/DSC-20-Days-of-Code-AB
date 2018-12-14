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


    public void submit(View view) {
        int finalScore;
        int score = getIntent().getIntExtra("score", 0);

        if (q10option1.isChecked()) {
            finalScore = score + 1;
        } else {
            finalScore = score;
        }

        String name = getIntent().getStringExtra("name");

        Toast.makeText(this, "You Scored " + finalScore + " out of 10, " + name, Toast.LENGTH_SHORT).show();
    }

}
