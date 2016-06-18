package com.example.user.testapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FindClueActivity extends AppCompatActivity {
    Button b;
    String lastPath;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_clue);

        Intent intent = getIntent();
        Uri uri = intent.getData();
        lastPath = uri.getLastPathSegment();
        TextView Clue = (TextView)findViewById(R.id.foundClue);
        Clue.setText("found clue " + lastPath);
        
    }
    public void onClick(View v) {
    if(lastPath.equals("0")) {
        Intent i = new Intent(this, WinActivity.class);
        startActivity(i);
    }
    else{
            Intent i = new Intent(this,StartDescriptionActivity.class);
            startActivity(i);
        }

    }
}


