package com.example.blackadam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Genre_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);
    }

    public void onClick(View view) {
        Intent i = new Intent(this,LyricDisplay.class);
        i.putExtra(var2, 2);
        startActivity(i);
    }

}
