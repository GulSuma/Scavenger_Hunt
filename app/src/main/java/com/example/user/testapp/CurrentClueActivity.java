package com.example.user.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.user.testapp.DataObject.Clue;

import java.util.ArrayList;

public class CurrentClueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_clue);


        String[] clues = getResources().getStringArray(R.array.clues);
        ArrayList<Clue> array = new ArrayList();

        for (int i = 0; i <array.size(); i++) {
            Clue ci = new Clue("clue cycling", i);
            array.add(ci);
            Clue Current = array.get(i);
        }
    }
}
