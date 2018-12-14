package com.example.oga.dsc_20_days_of_code_ab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Question5 extends AppCompatActivity {

    RadioButton q5option1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);

        q5option1 = findViewById(R.id.q5option1);
    }

    public void next(View view) {
        Intent intent = new Intent(this, Question6.class);
        int score = getIntent().getIntExtra("score",0);
        String name = getIntent().getStringExtra("name");

        if (q5option1.isChecked()) {
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            intent.putExtra("name", name);
            intent.putExtra("score", score + 1);
            startActivity(intent);

        }else {
            Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
            intent.putExtra("name", name);
            intent.putExtra("score", score);
            startActivity(intent);
        }
    }

    public void back(View view) {
        this.finish();
    }

}
