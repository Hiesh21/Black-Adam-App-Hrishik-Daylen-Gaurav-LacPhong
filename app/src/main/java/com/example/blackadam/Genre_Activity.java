package com.example.blackadam;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;

public class Genre_Activity extends AppCompatActivity {

    @Override
    /**
     * onCreate method creates layout for Genre_Activity with its respective components.
     */
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);

        toSongs();//calls toSongs method
        toSettings();//calls toSettings method

    }

    /**
     * toSongs method sets strings so that they are accessible for Song_Activity. Also makes it so that
     * Also makes it so that if the buttons are clicked it will transport the user to the Song_Activity
     * and display the songs for given genre.
     */
    public void toSongs(){
        final Button hiphop = (Button) findViewById(R.id.hiphop);//creates objects for buttons to be used
        final Button pop = (Button) findViewById(R.id.pop);
        final Button country = (Button) findViewById(R.id.country);
        final Intent i = new Intent(this, Song_Activity.class);//creates intent for i to transport user to Song_Activity
        hiphop.setOnClickListener(new Button.OnClickListener(){//checks if button is clicked
            public void onClick(View view){//if button clicked make string of button as extra data to be used by Song_Activity and transport user to Song_Activity
                String a = hiphop.getText().toString();
                i.putExtra("genreMessage", a);
                startActivity(i);
            }
        });
        pop.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                String b = pop.getText().toString();
                i.putExtra("genreMessage", b);
                startActivity(i);
            }
        });
        country.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                String c = country.getText().toString();
                i.putExtra("genreMessage", c);
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

