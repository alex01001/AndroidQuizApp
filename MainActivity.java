package com.example.android.quizapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void processCorrectAnswer(TextView ans){
        ans.setText(String.valueOf("Correct!"));
        ans.setTextColor(Color.GREEN);
    }

    /**
     * Check all answers
     */
    public void submit(View view) {

        //question 1
        RadioButton rb = (RadioButton) findViewById(R.id.question1_option3);
        TextView ans = (TextView) findViewById(R.id.answer1);

        if(rb.isChecked())
            processCorrectAnswer(ans);
        else{
            ans.setText(String.valueOf("Wrong. Correct answer is 200"));
            ans.setTextColor(Color.RED);
        }

        //question 2

        rb = (RadioButton) findViewById(R.id.question2_option4);
        ans = (TextView) findViewById(R.id.answer2);

        if(rb.isChecked())
            processCorrectAnswer(ans);
        else
            ans.setText(String.valueOf("Wrong. Correct answer is 225"));

        //question 3
        TextView ans3 = (TextView) findViewById(R.id.question3_answer);
        ans  = (TextView) findViewById(R.id.answer3);

        String answer_str =  ans3.getText().toString().trim();
        if((answer_str.equals("10201"))||(answer_str.equals("10,201")))
            processCorrectAnswer(ans);
        else
            ans.setText(String.valueOf("Wrong. Correct answer is 10,201"));

        //question 4
        CheckBox cb1 = (CheckBox) findViewById(R.id.question4_option1);
        CheckBox cb2 = (CheckBox) findViewById(R.id.question4_option2);
        CheckBox cb3 = (CheckBox) findViewById(R.id.question4_option3);

        ans  = (TextView) findViewById(R.id.answer4);

        if((cb1.isChecked())&&(cb2.isChecked())&&(!cb3.isChecked()))
            processCorrectAnswer(ans);
        else
            ans.setText(String.valueOf("Wrong. Mean and median will change only."));

    }

    //clears all answers
    public void reset(View view) {
        TextView ans = (TextView) findViewById(R.id.answer1);
        ans.setText(String.valueOf(""));
        ans.setTextColor(Color.RED);
        ans = (TextView) findViewById(R.id.answer2);
        ans.setTextColor(Color.RED);
        ans.setText(String.valueOf(""));
        ans = (TextView) findViewById(R.id.answer3);
        ans.setTextColor(Color.RED);
        ans.setText(String.valueOf(""));
        ans = (TextView) findViewById(R.id.answer4);
        ans.setText(String.valueOf(""));
        ans.setTextColor(Color.RED);

        ans = (TextView) findViewById(R.id.question3_answer);
        ans.setText(String.valueOf(""));

        RadioButton rb = (RadioButton) findViewById(R.id.question1_option1);
        rb.setChecked(false);
        rb = (RadioButton) findViewById(R.id.question1_option2);
        rb.setChecked(false);
        rb = (RadioButton) findViewById(R.id.question1_option3);
        rb.setChecked(false);
        rb = (RadioButton) findViewById(R.id.question1_option4);
        rb.setChecked(false);
        rb = (RadioButton) findViewById(R.id.question1_option5);
        rb.setChecked(false);

        rb = (RadioButton) findViewById(R.id.question2_option1);
        rb.setChecked(false);
        rb = (RadioButton) findViewById(R.id.question2_option2);
        rb.setChecked(false);
        rb = (RadioButton) findViewById(R.id.question2_option3);
        rb.setChecked(false);
        rb = (RadioButton) findViewById(R.id.question2_option4);
        rb.setChecked(false);
        rb = (RadioButton) findViewById(R.id.question2_option5);
        rb.setChecked(false);

        CheckBox cb1 = (CheckBox) findViewById(R.id.question4_option1);
        CheckBox cb2 = (CheckBox) findViewById(R.id.question4_option2);
        CheckBox cb3 = (CheckBox) findViewById(R.id.question4_option3);

        cb1.setChecked(false);
        cb2.setChecked(false);
        cb3.setChecked(false);

    }
}


