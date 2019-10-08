package com.example.blackadam;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;

public class Genre_Activity extends AppCompatActivity {
    Button hiphop = (Button) findViewById(R.id.song1);
    Button pop = (Button) findViewById(R.id.song2);
    Button country = (Button) findViewById(R.id.song3);
    Intent i = new Intent(this, Song_Activity.class);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);
        hiphop.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                String a = hiphop.getText().toString();
                i.putExtra("genreMessage", a);
            }
        });
        pop.setOnClickListener(new Button.OnClickListener(){
           public void onClick(View view){
               String b = pop.getText().toString();
               i.putExtra("genreMessage", b);
           }
        });
        country.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                String c = country.getText().toString();
                i.putExtra("genreMessage", c);
            }
        });
    }
}
