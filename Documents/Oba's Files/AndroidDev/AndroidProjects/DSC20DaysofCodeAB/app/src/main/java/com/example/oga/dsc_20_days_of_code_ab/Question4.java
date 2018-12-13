package com.example.oga.dsc_20_days_of_code_ab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Question4 extends AppCompatActivity {

    RadioButton q4option2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);

        q4option2 = findViewById(R.id.q4option2);
    }

    public void next(View view) {
        Intent intent = new Intent(this, Question5.class);

        if (q4option2.isChecked()) {
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            int score = getIntent().getIntExtra("score",0);
            intent.putExtra("score", score + 1);
            startActivity(intent);
        }else {
            Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }
    }

    public void back(View view) {
        this.finish();
    }

}
