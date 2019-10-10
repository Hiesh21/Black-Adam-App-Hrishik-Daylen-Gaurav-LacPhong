package com.example.blackadam;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;

public class Song_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_);
        Bundle genreData = getIntent().getExtras();
        if(genreData==null){
            return;
        }
        String genreMessage = genreData.getString("genreMessage");
        if (genreMessage == "Hip Hop"){
            Button songtext1 = (Button) findViewById(R.id.song1);
            songtext1.setText("Ransom - Lil Tecca");
            Button songtext2 = (Button) findViewById(R.id.song2);
            songtext1.setText("Panini - Lil Nas X");
            Button songtext3 = (Button) findViewById(R.id.song3);
            songtext1.setText("Thotiana - Blue Face");
        }
        if (genreMessage == "Pop"){
            Button songtext1 = (Button) findViewById(R.id.song1);
            songtext1.setText("Soul Sister - Train");
            Button songtext2 = (Button) findViewById(R.id.song2);
            songtext1.setText("Fireflies - Owl City");
            Button songtext3 = (Button) findViewById(R.id.song3);
            songtext1.setText("Talk - Khalid");
        }
        if (genreMessage == "Country"){
            Button songtext1 = (Button) findViewById(R.id.song1);
            songtext1.setText("Old Town Road - Lil Nas X");
            Button songtext2 = (Button) findViewById(R.id.song2);
            songtext1.setText("Old Town Road (Remix) - Lil Nas X ft. Billy Ray Cyrus");
            Button songtext3 = (Button) findViewById(R.id.song3);
            songtext1.setText("Old Town Road (Remix) - Lil Nas X ft. Billy Ray Cyrus, Young Thug, and Mason Ramsey");
        }
    }

}
