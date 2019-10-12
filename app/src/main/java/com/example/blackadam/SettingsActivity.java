package com.example.blackadam;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import androidx.appcompat.app.ActionBar;
import android.widget.FrameLayout;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceFragmentCompat;


public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.settings, new SettingsFragment())
                .commit();
        ActionBar actionBar = getSupportActionBar();
        Bundle genreData1 = getIntent().getExtras();
        if(genreData1==null){
            return;
        }
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        backtoGenres();
        settingsswitch();
    }
    public void backtoGenres(){
        final Button backtogenres = (Button) findViewById(R.id.button);
        final Intent fromSettingsintent = new Intent(this, Genre_Activity.class);
        backtogenres.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view2){
                startActivity(new Intent(SettingsActivity.this, Genre_Activity.class));
            }
        });

    }
    public void settingsswitch() {
        TextView textView = findViewById(R.id.textView4);
        FrameLayout li = findViewById(R.id.settings);

        Switch switch2 = (Switch) findViewById(R.id.switch2);
        Boolean switchState = switch2.isChecked();
        if (switchState) {
            textView.setTextColor(0xFFD6A621);
            switch2.setTextColor(0xFFD6A621);
            li.setBackgroundColor(Color.parseColor("#000000"));
        }
    }

        public static class SettingsFragment extends PreferenceFragmentCompat {
            @Override
            public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
                setPreferencesFromResource(R.xml.root_preferences, rootKey);
            }


        }
    }