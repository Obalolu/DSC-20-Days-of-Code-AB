package com.example.oga.dsc_20_days_of_code_ab;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    int count;
    RadioButton q1option3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        q1option3 = findViewById(R.id.q1option3);
        PreferenceUtils.resetScore(this);
    }

    public void next(View view) {
        if (q1option3.isChecked()) {
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            int score = PreferenceUtils.getScore(this);
            PreferenceUtils.updateScore(this, score + 1);
        }else {
            Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
        }

        Intent intent = new Intent(this, Question2.class);
        startActivity(intent);
    }

}

