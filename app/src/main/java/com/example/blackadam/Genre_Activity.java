package com.example.blackadam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Genre_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);

        toSongs();
    }

    public void toSongs() {
        final Button hiphop = findViewById(R.id.hiphop);
        final Button pop = findViewById(R.id.pop);
        final Button country = findViewById(R.id.country);
        final Intent i = new Intent(this, Song_Activity.class);
        hiphop.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                String a = hiphop.getText().toString();
                i.putExtra("genreMessage", a);
                startActivity(i);
            }
        });
        pop.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                String b = pop.getText().toString();
                i.putExtra("genreMessage", b);
                startActivity(i);
            }
        });
        country.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                String c = country.getText().toString();
                i.putExtra("genreMessage", c);
                startActivity(i);
            }
        });
    }
}
