package com.example.blackadam;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;

public class Genre_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);

        toSongs();
        toSettings();

    }
    public void toSongs(){
        final Button hiphop = (Button) findViewById(R.id.hiphop);
        final Button pop = (Button) findViewById(R.id.pop);
        final Button country = (Button) findViewById(R.id.country);
        final Intent i = new Intent(this, Song_Activity.class);
        hiphop.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
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
    public void toSettings(){
        final Button settings = (Button) findViewById(R.id.settings);
        final Intent i = new Intent(this, SettingsActivity.class);
        settings.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                startActivity(i);
            }
        });
    }
}

