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
        songList(genreMessage);
    }
    public void songList(String g) {
        if (g.equals("HIPHOP")){
            Button songtext1 = (Button) findViewById(R.id.song1);
            songtext1.setText("Ransom - Lil Tecca");
            Button songtext2 = (Button) findViewById(R.id.song2);
            songtext2.setText("Panini - Lil Nas X");
            Button songtext3 = (Button) findViewById(R.id.song3);
            songtext3.setText("Thotiana - Blue Face");
        }
        if (g.equals("POP")){
            Button songtext1 = (Button) findViewById(R.id.song1);
            songtext1.setText("Soul Sister - Train");
            Button songtext2 = (Button) findViewById(R.id.song2);
            songtext2.setText("Fireflies - Owl City");
            Button songtext3 = (Button) findViewById(R.id.song3);
            songtext3.setText("Talk - Khalid");
        }
        if (g.equals("COUNTRY")){
            Button songtext1 = (Button) findViewById(R.id.song1);
            songtext1.setText("Old Town Road - Lil Nas X");
            Button songtext2 = (Button) findViewById(R.id.song2);
            songtext2.setText("Old Town Road (Remix) - Lil Nas X ft. Billy Ray Cyrus");
            Button songtext3 = (Button) findViewById(R.id.song3);
            songtext3.setText("Old Town Road (Remix) - Lil Nas X ft. Billy Ray Cyrus, Young Thug, and Mason Ramsey");
        }
    }

}
