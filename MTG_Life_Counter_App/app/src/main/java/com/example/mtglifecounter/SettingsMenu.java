/**
 * Created by Mickey on 2017-09-25.
 */
package com.example.mtglifecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.TextView;


import static com.example.mtglifecounter.R.*;

public class SettingsMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

    }

    public void SaveNames(View view)
    {
     /*   TextView textPlayer1 = (TextView) findViewById(id.Player1Name);
        TextView textPlayer2 = (TextView) findViewById(id.Player2Name);
        TextView textPlayer3 = (TextView) findViewById(id.Player3Name);
        TextView textPlayer4 = (TextView) findViewById(id.Player4Name);


        MainActivity.prefs.edit().putString( MainActivity.Player1NameKey ,textPlayer1.toString()).apply();
        MainActivity.prefs.edit().putString( MainActivity.Player2NameKey ,textPlayer2.toString()).apply();
        MainActivity.prefs.edit().putString( MainActivity.Player3NameKey ,textPlayer3.toString()).apply();
        MainActivity.prefs.edit().putString( MainActivity.Player4NameKey ,textPlayer4.toString()).apply();*/
    }

}
