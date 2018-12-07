package com.example.oga.dsc_20_days_of_code_ab;

import android.annotation.SuppressLint;
import android.content.Intent;
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
    TextView answer;
    Button next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next = findViewById(R.id.next);

    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        next.setEnabled(true);
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.q1option1:
                if (checked)
                    count = 1;
                    break;
            case R.id.q1option2:
                if (checked)
                    count = 2;
                    break;

            case R.id.q1option3:
                if (checked)
                    count = 3;
                break;
        }
    }


    public void submit(View view) {
        if (count >= 3) {
            answer = findViewById(R.id.q1answer);
            answer.setText("Correct");
            Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show();
        }
    }

    public void next(View view) {
        Intent intent = new Intent(this, Question2.class);
        startActivity(intent);
    }

}

