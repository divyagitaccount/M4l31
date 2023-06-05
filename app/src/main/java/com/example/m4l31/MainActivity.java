package com.example.m4l31;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView ques;
    EditText givens;
    String ans;
    Button submit;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ques =  findViewById(R.id.t1);
        givens = findViewById(R.id.editTextTextPersonName);
        submit =  findViewById(R.id.button);

        custom[] d = new custom[5];
        d[0] = new custom("What is currency of India","rupee");
        d[1] = new custom("What is capital of Pakistan","islamabad");
        d[2] = new custom("What is capital of India","Delhi");
        d[3] = new custom("What is currency of India","rupee");
        d[4] = new custom("What is currency of India","rupee");

        Random randomNumber = new Random();

        int numberGenerated = randomNumber.nextInt(5);
        ques.setText(d[numberGenerated].quizquestion);
        ans =  d[numberGenerated].quizans;

        submit.setOnClickListener(view -> {
            if(givens.getText().toString().toLowerCase().equals(ans))
            {
                int numberGenerated1;
                numberGenerated1 = randomNumber.nextInt(5);
                ques.setText(d[numberGenerated1].quizquestion);
                ans =  d[numberGenerated1].quizans;
                Toast.makeText(MainActivity.this, "Correct!! Answer!!",
                        Toast.LENGTH_LONG).show();
                givens.setText("");
            }
        });

    }
}