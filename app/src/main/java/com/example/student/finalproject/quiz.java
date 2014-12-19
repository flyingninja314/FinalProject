package com.example.student.finalproject;

import android.content.Context;
import android.widget.Toast;

public class quiz {

    public String q1;
    public String q2;
    public String q3;
    public boolean a1;
    public boolean a2;
    public boolean a3;
    public int score;

    public quiz() {

        q1 = "Mr. Lee is in Peru.";
        q2 = "I don't care.";
        q3 = "I am morbid.";
        a1 = true;
        a2 = true;
        a3 = true;
        score = 0;

    }

//    I was going to have three xml files. The first on was a start screen. The user would click "start quiz" and then would be taken to activity_question_1, where they would be given the first question. If they answered correctly, their score would increase by 1. A toast would tell the user if they were right or wrong. They would be taken to the next question (using the same layout) and would go through the same process for questions 2 and 3. When they finished the quiz, they would be taken to the results screen, where they were told their score and give the option to play again.

    public void startQuiz() {

    }

    public void q1(boolean userAnswer) {

        if(userAnswer == a1){
            score++;
        }
        else {
//            it should be noted that I thought I knew what I was doing, and then an hour and a half in, I got lost and I think I really messed up.
//            but, seeing as this is a performance test, not a completion check, I will continue to search the API and stackedoverflow.com for help.
        }

    }

}