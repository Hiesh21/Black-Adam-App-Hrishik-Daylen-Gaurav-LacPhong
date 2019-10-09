package com.example.blackadam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;

public class Song_Activity extends AppCompatActivity {
    boolean genreHip = false;
    boolean genrePop = false;
    boolean genreCountry = false;
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
            genreHip = true;
        }
        if (g.equals("POP")){
            Button songtext1 = (Button) findViewById(R.id.song1);
            songtext1.setText("Soul Sister - Train");
            Button songtext2 = (Button) findViewById(R.id.song2);
            songtext2.setText("Fireflies - Owl City");
            Button songtext3 = (Button) findViewById(R.id.song3);
            songtext3.setText("Talk - Khalid");
            genrePop = true;
        }
        if (g.equals("COUNTRY")){
            Button songtext1 = (Button) findViewById(R.id.song1);
            songtext1.setText("Old Town Road - Lil Nas X");
            Button songtext2 = (Button) findViewById(R.id.song2);
            songtext2.setText("Old Town Road (Remix) - Lil Nas X ft. Billy Ray Cyrus");
            Button songtext3 = (Button) findViewById(R.id.song3);
            songtext3.setText("Old Town Road (Remix) - Lil Nas X ft. Billy Ray Cyrus, Young Thug, and Mason Ramsey");
            genreCountry = true;
        }

    }

    public void toLyric(View view){
        final Button songtext1 = (Button) findViewById(R.id.song1);
        final Button songtext2 = (Button) findViewById(R.id.song2);
        final Button songtext3 = (Button) findViewById(R.id.song3);
        final Intent i = new Intent(this, LyricDisplay.class);
        songtext1.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                String a = songtext1.getText().toString();
                i.putExtra("songMessage", a);
                startActivity(i);
            }
        });
        songtext2.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                String b = songtext2.getText().toString();
                i.putExtra("songMessage", b);
                startActivity(i);
            }
        });
        songtext3.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                String c = songtext3.getText().toString();
                i.putExtra("songMessage", c);
                startActivity(i);
            }
        });

    }
}