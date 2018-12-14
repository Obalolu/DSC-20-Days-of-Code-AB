package com.example.oga.dsc_20_days_of_code_ab;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button startQuiz;
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startQuiz = findViewById(R.id.startQuiz);
        name = findViewById(R.id.name);
    }

    public void startQuiz(View view) {
        Intent intent = new Intent(this, Question1.class);
        String username = name.getText().toString();
        intent.putExtra("name", username);
        startActivity(intent);
    }

}

