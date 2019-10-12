package com.example.blackadam;

import android.graphics.Color;
import android.os.Bundle;
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
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        TextView textView =  findViewById(R.id.textView4);

        FrameLayout li =findViewById(R.id.settings);

        Switch switch2 = (Switch) findViewById(R.id.switch2);
        Boolean switchState = switch2.isChecked();
        if (switchState){
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