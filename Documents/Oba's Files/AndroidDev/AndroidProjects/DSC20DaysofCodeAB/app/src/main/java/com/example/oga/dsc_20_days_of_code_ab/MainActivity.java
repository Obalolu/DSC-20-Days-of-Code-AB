package com.example.oga.dsc_20_days_of_code_ab;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton q1option3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        q1option3 = findViewById(R.id.q1option3);
    }

    public void next(View view) {
        Intent intent = new Intent(this, Question2.class);

        if (q1option3.isChecked()) {
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            intent.putExtra("score", 1);
            startActivity(intent);

        }else {
            Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }


    }

}

