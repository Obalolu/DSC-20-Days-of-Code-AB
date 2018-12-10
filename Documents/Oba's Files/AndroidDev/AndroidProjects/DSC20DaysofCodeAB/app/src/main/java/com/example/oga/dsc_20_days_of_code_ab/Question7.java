package com.example.oga.dsc_20_days_of_code_ab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Question7 extends AppCompatActivity {

    RadioButton q7option2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question7);

        q7option2 = findViewById(R.id.q7option2);
    }

    public void next(View view) {
        if (q7option2.isChecked()) {
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            int score = PreferenceUtils.getScore(this);
            PreferenceUtils.updateScore(this, score + 1);
        }else {
            Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
        }

        Intent intent = new Intent(this, Question8.class);
        startActivity(intent);

    }

    public void back(View view) {
        Intent intent = new Intent(this, Question6.class);
        startActivity(intent);
    }

}
