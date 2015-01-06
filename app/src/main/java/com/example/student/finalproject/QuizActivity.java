package com.example.student.finalproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class QuizActivity extends Activity{

    public TextView questionText;
    public Button falseButton;
    public Button trueButton;

    public ArrayList<Question> questions = new ArrayList<Question>();

    public int index = 0;
    public int questionCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        questions.add(new Question("This statement is false.", "false"));
        questions.add(new Question("George Washington had wooden teeth", "true"));

        questionCount = questions.size();

        questionText = (TextView)findViewById(R.id.questionText);
        falseButton = (Button)findViewById(R.id.buttonFalse);
        trueButton = (Button)findViewById(R.id.buttonTrue);

        falseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questions.get(index).answer.equals("false")) {
                    Toast toast = Toast.makeText(getApplication(), "Correct.", Toast.LENGTH_SHORT);
                    toast.show();
                }
                else {
                    Toast toast = Toast.makeText(getApplication(), "Correct.", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        trueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questions.get(index).answer.equals("false")) {
                    Toast toast = Toast.makeText(getApplication(), "Correct.", Toast.LENGTH_SHORT);
                    toast.show();
                }
                else {
                    Toast toast = Toast.makeText(getApplication(), "Correct.", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

    }

    public void updateQuestion() {

    }

}