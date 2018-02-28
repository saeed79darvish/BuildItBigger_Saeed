package com.saeed.jokedisplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.saeed.jokedisplay.R;

public class JokeActivity extends AppCompatActivity {

    public static String JOKE_KEY = "Joke key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

    }
}
