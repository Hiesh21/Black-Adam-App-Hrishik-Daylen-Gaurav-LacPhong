package com.example.blackadam;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;
import android.graphics.Color;
import android.widget.Button;

public class LyricDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



            }

    public void onClick(View view) {
        Intent i = new Intent(this,Genre_Activity.class);
        startActivity(i);
    }
}

