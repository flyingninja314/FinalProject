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