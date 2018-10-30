package com.example.quiz;

import android.content.Context;
import android.nfc.Tag;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.quiz.QuizActivity;
import com.google.gson.Gson;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Quiz {
    private List<question> questionArrayList;
    private int score;
    private int currentQuestion;

    Quiz(List<question> questions) {
        this.questionArrayList = questions;

    }
    public Quiz(){
        questionArrayList = null;
        score= 0;
        currentQuestion =0;
    }
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getCurrentQuestion() {
        return currentQuestion;
    }

    public void setCurrentQuestion(int number) {
        this.currentQuestion=number;

    }

    public void nextQuestion(){
        if(isThereAnotherQuestion()) {
            currentQuestion += 1;
        }
    }
    public boolean isThereAnotherQuestion(){
        if(currentQuestion < questionArrayList.size()){
            return true;
        }
        else{
            return false;
        }
    }


    }

