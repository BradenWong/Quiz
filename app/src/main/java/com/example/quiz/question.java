package com.example.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.quiz.question;
import com.google.gson.Gson;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class question{
    private String question;
    private boolean answer;

    public question(){
        question = "";
        answer = false;
    }
    public question (String question, boolean answer){

        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }
    public boolean checkAnswer(boolean useAnswer){
        return useAnswer == isAnswer();
    }

}
