package com.example.user.testapp;

import android.app.Application;
import android.widget.TextView;

import com.example.user.testapp.DataObject.Clue;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by USER on 6/11/2016.
 */
public class MyApplication extends Application {
    Clue[] clues1;
    public void onCreate() {
        super.onCreate();

        String[] clues = getResources().getStringArray(R.array.clues);
        ArrayList<Clue> arr = new ArrayList<Clue>();
        clues1 = new Clue[clues.length];

        for (int i = 0; i < clues1.length; i++) {
            String clueString = clues[i];
            final Clue clueToAdd = new Clue(clueString, i);
            clues1[i] = clueToAdd;

        }

    }
    public Clue[] getClues(){
        return clues1;
    }

}