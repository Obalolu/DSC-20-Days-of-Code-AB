package com.example.oga.dsc_20_days_of_code_ab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Question9 extends AppCompatActivity {

    RadioButton q9option3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question9);

        q9option3 = findViewById(R.id.q9option3);
    }

    public void next(View view) {
        Intent intent = new Intent(this, Question10.class);

        if (q9option3.isChecked()) {
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
