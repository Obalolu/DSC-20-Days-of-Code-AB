package com.example.oga.dsc_20_days_of_code_ab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Question4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
    }

    public void next(View view) {
        Intent intent = new Intent(this, Question5.class);
        startActivity(intent);

    }

    public void back(View view) {
        Intent intent = new Intent(this, Question3.class);
        startActivity(intent);
    }

}
