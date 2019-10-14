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
    /**
     * onCreate method creates layout of the settings activity with title "Settings" and a switch
     * that is supposed to invert the colors of the app, however this version does not have ot working
     * at the moment.
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//creates layout
        setContentView(R.layout.settings_activity);//sets layout to xml file named settings_activity
        //getSupportFragmentManager()
                //.beginTransaction()
                //.replace(R.id.settings, new SettingsFragment())
                //.commit();
        ActionBar actionBar = getSupportActionBar();//creates object actionBar
        if (actionBar != null) {//if actionBar is enabled
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        TextView textView =  findViewById(R.id.textView4);//creates object textView set to textView4

        FrameLayout li =findViewById(R.id.settings);//creates FrameLayout li set to settings

        Switch switch2 = (Switch) findViewById(R.id.switch2);//creates object switch2 set to switch2
        Boolean switchState = switch2.isChecked();//checks if switch2 is switched on or off
        if (switchState){//if switched on it will invert colors of activity
            textView.setTextColor(0xFFD6A621);
            switch2.setTextColor(0xFFD6A621);
            li.setBackgroundColor(Color.parseColor("#000000"));

        }


    }

    /*public static class SettingsFragment extends PreferenceFragmentCompat {
        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey);
        }


    }*/
}