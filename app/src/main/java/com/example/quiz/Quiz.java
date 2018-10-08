package com.example.quiz;

import android.content.Context;
import android.nfc.Tag;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;


public class Quiz extends AppCompatActivity {
public static final String TAG = "mainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        InputStream XmlFileInputStream = getResources().openRawResource(R.raw.questons);
        String jsonstring = readTextFile(XmlFileInputStream);
        Log.d(TAG, "onCreate: " + jsonstring);

        Gson gson = new Gson();
        Question[] questions = gson.fromJson((jsonstring, Question[].class));

        List<Questions> questionsList = Arrays.asList(questions);


    }
    public String readTextFile(InputStream inputStream) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        byte buf[] = new byte[1024];
        int len;
        try {
            while ((len = inputStream.read(buf)) != -1) {
                outputStream.write(buf, 0, len);
            }
            outputStream.close();
            inputStream.close();
        } catch (IOException e) {

        }
        return outputStream.toString();
    }



}
