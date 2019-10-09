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
import android.os.Bundle;

public class LyricDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyric_display);
        Bundle songData = getIntent().getExtras();

        if (songData == null) {
            return;
        }
        String songMessage = songData.getString("songMessage");
        setLyrics(songMessage);
        }

        public void setLyrics(String choice) {
        if (choice.equals("Ransom - Lil Tecca")) {

        }
        }

    public void onClick(View view) {
        Intent i = new Intent(this,Song_Activity.class);
        startActivity(i);
    }
}

