package com.example.mtglifecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class UserSettings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_settings);
    }

    public void SaveNames()
    {
        TextView textPlayer1 = (TextView) findViewById(R.id.Player1Name);
        TextView textPlayer2 = (TextView) findViewById(R.id.Player2Name);
        TextView textPlayer3 = (TextView) findViewById(R.id.Player3Name);
        TextView textPlayer4 = (TextView) findViewById(R.id.Player4Name);


        MainActivity.prefs.edit().putString( MainActivity.Player1NameKey ,textPlayer1.toString()).apply();
        MainActivity.prefs.edit().putString( MainActivity.Player2NameKey ,textPlayer2.toString()).apply();
        MainActivity.prefs.edit().putString( MainActivity.Player3NameKey ,textPlayer3.toString()).apply();
        MainActivity.prefs.edit().putString( MainActivity.Player4NameKey ,textPlayer4.toString()).apply();
    }

}

