package com.example.blackadam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class Song_Activity extends AppCompatActivity {

    @Override
    /**
     * onCreate method creates layout for Song_Activity with its components. It interacts with Genre_Activity
     * to display the correct songs for the respective genres.
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_);
        Bundle genreData = getIntent().getExtras();//get extras from Genre_Activity
        if(genreData==null){
            return;
        }
        String genreMessage = genreData.getString("genreMessage");//makes genreData into a string held in genreMessage
        songList(genreMessage);//calls songList method
        toLyric();//calls toLyrics method
        toSettings();//calls toSettings method
    }

    /**
     * The songList method checks value of genreMessage and makes sets the string within the button
     * to the respect song for genre chosen by user.
     * @param g
     */
    public void songList(String g) {
        if (g.equals("HIP-HOP")){//sets songs to Hip-Hop songs
            Button songtext1 = (Button) findViewById(R.id.song1);
            songtext1.setText("Ransom - Lil Tecca");
            Button songtext2 = (Button) findViewById(R.id.song2);
            songtext2.setText("Panini - Lil Nas X");
            Button songtext3 = (Button) findViewById(R.id.song3);
            songtext3.setText("Thotiana - Blueface");
        }
        if (g.equals("POP")){//sets songs to Pop songs
            Button songtext1 = (Button) findViewById(R.id.song1);
            songtext1.setText("Soul Sister - Train");
            Button songtext2 = (Button) findViewById(R.id.song2);
            songtext2.setText("Fireflies - Owl City");
            Button songtext3 = (Button) findViewById(R.id.song3);
            songtext3.setText("Talk - Khalid");
        }
        if (g.equals("COUNTRY")){//sets songs to Country songs
            Button songtext1 = (Button) findViewById(R.id.song1);
            songtext1.setText("Old Town Road - Lil Nas X");
            Button songtext2 = (Button) findViewById(R.id.song2);
            songtext2.setText("Old Town Road (Remix) - Lil Nas X ft. Billy Ray Cyrus");
            Button songtext3 = (Button) findViewById(R.id.song3);
            songtext3.setText("Old Town Road (Remix) - Lil Nas X ft. Billy Ray Cyrus, Young Thug, and Mason Ramsey");
        }
    }

    /**
     * ToLyric method gets the values of the buttons from Song_Activity and packages it so that it can be
     * used by the LyricDisplay activity. It also transports the user to LyricDisplay activity if any of the buttons are clicked.
     */
    public void toLyric(){
        final Button songtext1 = (Button) findViewById(R.id.song1);//creates objects for each button to be used
        final Button songtext2 = (Button) findViewById(R.id.song2);
        final Button songtext3 = (Button) findViewById(R.id.song3);
        final Intent i = new Intent(this, LyricDisplay.class);//creates intent to go to LyricDisplay activity
        songtext1.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                String a = songtext1.getText().toString();
                i.putExtra("songMessage", a);//sets the string of the buttons as extras
                startActivity(i);//starts activity
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
    /**
     * toSettings method is called to start the Settings activity
     */
    public void toSettings(){
        final Button settings = (Button) findViewById(R.id.settings);//creates object Button for settings
        final Intent i = new Intent(this, SettingsActivity.class);//creates object Intent for i
        settings.setOnClickListener(new Button.OnClickListener(){//if settings button clicked it will start settings activity
            public void onClick(View view){
                startActivity(i);
            }
        });
    }

}
