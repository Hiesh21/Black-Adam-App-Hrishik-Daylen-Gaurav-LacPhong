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
            setContentView(R.layout.activity_lyric_display);


            Intent intent = getIntent();
            int da_choice = var2.getIntExtra("da_song", 0);

            if (da_choice == 2) {

                System.out.println("Hello world");
        }

    }

    public void onClick(View view) {
        Intent i = new Intent(this,Genre_Activity.class);
        startActivity(i);
    }
}

