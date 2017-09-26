package com.example.mtglifecounter;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.mtglifecounter.R.*;

public class MainActivity extends AppCompatActivity {


    public int life1;
    public int life2;
    public int life3;
    public int life4;

    private boolean Player1 ;
    private boolean Player2;
    private boolean Player3;
    private boolean Player4;

    public static SharedPreferences prefs;

    private static String Player1Key;
    private static String Player2Key;
    private static String Player3Key;
    private static String Player4Key;

    public static String Player1NameKey;
    public static String Player2NameKey;
    public static String Player3NameKey;
    public static String Player4NameKey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        prefs = this.getSharedPreferences("com.example.app", Context.MODE_PRIVATE);

        Player1Key = "com.example.app.player1life";
        Player2Key = "com.example.app.player2life";
        Player3Key = "com.example.app.player3life";
        Player4Key = "com.example.app.player4life";

        Player1NameKey = "com.example.app.player1name";
        Player2NameKey = "com.example.app.player2name";
        Player3NameKey = "com.example.app.player3name";
        Player4NameKey = "com.example.app.player4name";

        Player1 = false;
        Player2 = false;
        Player3 = false;
        Player4 = false;

        life1 = prefs.getInt(Player1Key, 40);
        life2 = prefs.getInt(Player2Key, 40);
        life3 = prefs.getInt(Player3Key, 40);
        life4 = prefs.getInt(Player4Key, 40);

        DisplayLife();
        DisplayNames();
    }

    public void IncreaseLife(View view)
    {
        ChangeLifeBy(1);
    }
    public void IncreaseLife5(View view)
    {
        ChangeLifeBy(5);
    }
    public void IncreaseLife10(View view)
    {
        ChangeLifeBy(10);
    }
    public void DecreaseLife(View view)
    {
        ChangeLifeBy(-1);
    }
    public void DecreaseLife5(View view)
    {
        ChangeLifeBy(-5);
    }
    public void DecreaseLife10(View view)
    {
        ChangeLifeBy(-10);
    }

    public void ChangeLifeBy(int LifeChangeValue)
    {
        if  (Player1 == true)
        {
            life1 = life1 + LifeChangeValue;
            prefs.edit().putInt(Player1Key, life1).apply();
        }

        if  (Player2 == true)
        {
            life2 = life2 + LifeChangeValue;
            prefs.edit().putInt(Player2Key, life2).apply();
        }

        if  (Player3 == true)
        {
            life3 = life3 + LifeChangeValue;
            prefs.edit().putInt(Player3Key, life3).apply();
        }
        if  (Player4 == true)
        {
            life4 = life4 + LifeChangeValue;
            prefs.edit().putInt(Player4Key, life4).apply();
        }

        DisplayLife();
    }
    public void DisplayLife()
    {
        TextView lifePlayer1 = (TextView) findViewById(id.lifePlayer1);
        TextView lifePlayer2 = (TextView) findViewById(id.lifePlayer2);
        TextView lifePlayer3 = (TextView) findViewById(id.lifePlayer3);
        TextView lifePlayer4 = (TextView) findViewById(id.lifePlayer4);

        lifePlayer1.setText("" + life1);
        lifePlayer2.setText("" + life2);
        lifePlayer3.setText("" + life3);
        lifePlayer4.setText("" + life4);
    }
    public void DisplayNames()
    {
        TextView textPlayer1 = (TextView) findViewById(id.textPlayer1);
        TextView textPlayer2 = (TextView) findViewById(id.textPlayer2);
        TextView textPlayer3 = (TextView) findViewById(id.textPlayer3);
        TextView textPlayer4 = (TextView) findViewById(id.textPlayer4);

        textPlayer1.setText(prefs.getString(Player1NameKey,"Player 1"));
        textPlayer2.setText(prefs.getString(Player2NameKey,"Player 2"));
        textPlayer3.setText(prefs.getString(Player3NameKey,"Player 3"));
        textPlayer4.setText(prefs.getString(Player4NameKey,"Player 4"));
    }
    public void PlayerSelect1(View view)
    {
        TextView textPlayer1 = (TextView) findViewById(id.textPlayer1);
        TextView lifePlayer1 = (TextView) findViewById(id.lifePlayer1);

        if (Player1 == true)
        {
            Player1 = false;

            textPlayer1.setTextColor(getResources().getColor(color.White));
            lifePlayer1.setTextColor(getResources().getColor(color.White));
        }
        else
        {
            Player1 = true;

            textPlayer1.setTextColor(getResources().getColor(color.HiLite));
            lifePlayer1.setTextColor(getResources().getColor(color.HiLite));
        }
    }
    public void PlayerSelect2(View view)
    {
        TextView textPlayer2 = (TextView) findViewById(id.textPlayer2);
        TextView lifePlayer2 = (TextView) findViewById(id.lifePlayer2);

        if (Player2 == true)
        {
            Player2 = false;

            textPlayer2.setTextColor(getResources().getColor(color.White));
            lifePlayer2.setTextColor(getResources().getColor(color.White));
        }
        else
        {
            Player2 = true;

            textPlayer2.setTextColor(getResources().getColor(color.HiLite));
            lifePlayer2.setTextColor(getResources().getColor(color.HiLite));
        }
    }
    public void PlayerSelect3(View view)
    {
        TextView textPlayer3 = (TextView) findViewById(id.textPlayer3);
        TextView lifePlayer3 = (TextView) findViewById(id.lifePlayer3);

        if (Player3 == true)
        {
            Player3 = false;

            textPlayer3.setTextColor(getResources().getColor(color.White));
            lifePlayer3.setTextColor(getResources().getColor(color.White));
        }
        else
        {
            Player3 = true;

            textPlayer3.setTextColor(getResources().getColor(color.HiLite));
            lifePlayer3.setTextColor(getResources().getColor(color.HiLite));
        }
    }
    public void PlayerSelect4(View view)
    {
        TextView textPlayer4 = (TextView) findViewById(id.textPlayer4);
        TextView lifePlayer4 = (TextView) findViewById(id.lifePlayer4);

        if (Player4 == true)
        {
            Player4 = false;

            textPlayer4.setTextColor(getResources().getColor(color.White));
            lifePlayer4.setTextColor(getResources().getColor(color.White));
        }
        else
        {
            Player4 = true;

            textPlayer4.setTextColor(getResources().getColor(color.HiLite));
            lifePlayer4.setTextColor(getResources().getColor(color.HiLite));
        }
    }
    public void set_text_white(View view)
    {
        TextView textPlayer1 = (TextView) findViewById(id.textPlayer1);
        TextView textPlayer2 = (TextView) findViewById(id.textPlayer2);
        TextView textPlayer3 = (TextView) findViewById(id.textPlayer3);
        TextView textPlayer4 = (TextView) findViewById(id.textPlayer4);

        TextView lifePlayer1 = (TextView) findViewById(id.lifePlayer1);
        TextView lifePlayer2 = (TextView) findViewById(id.lifePlayer2);
        TextView lifePlayer3 = (TextView) findViewById(id.lifePlayer3);
        TextView lifePlayer4 = (TextView) findViewById(id.lifePlayer4);

        textPlayer1.setTextColor(getResources().getColor(color.White));
        lifePlayer1.setTextColor(getResources().getColor(color.White));

        textPlayer2.setTextColor(getResources().getColor(color.White));
        lifePlayer2.setTextColor(getResources().getColor(color.White));

        textPlayer3.setTextColor(getResources().getColor(color.White));
        lifePlayer3.setTextColor(getResources().getColor(color.White));

        textPlayer4.setTextColor(getResources().getColor(color.White));
        lifePlayer4.setTextColor(getResources().getColor(color.White));
    }
    public void set_text_HiLite(View view)
    {
        TextView textPlayer1 = (TextView) findViewById(id.textPlayer1);
        TextView textPlayer2 = (TextView) findViewById(id.textPlayer2);
        TextView textPlayer3 = (TextView) findViewById(id.textPlayer3);
        TextView textPlayer4 = (TextView) findViewById(id.textPlayer4);

        TextView lifePlayer1 = (TextView) findViewById(id.lifePlayer1);
        TextView lifePlayer2 = (TextView) findViewById(id.lifePlayer2);
        TextView lifePlayer3 = (TextView) findViewById(id.lifePlayer3);
        TextView lifePlayer4 = (TextView) findViewById(id.lifePlayer4);

        textPlayer1.setTextColor(getResources().getColor(color.HiLite));
        lifePlayer1.setTextColor(getResources().getColor(color.HiLite));

        textPlayer2.setTextColor(getResources().getColor(color.HiLite));
        lifePlayer2.setTextColor(getResources().getColor(color.HiLite));

        textPlayer3.setTextColor(getResources().getColor(color.HiLite));
        lifePlayer3.setTextColor(getResources().getColor(color.HiLite));

        textPlayer4.setTextColor(getResources().getColor(color.HiLite));
        lifePlayer4.setTextColor(getResources().getColor(color.HiLite));
    }
    public void reset_player_select(View view)
    {
        Player1 = false;
        Player2 = false;
        Player3 = false;
        Player4 = false;
        set_text_white(view);
    }
    public void player_select_all(View view)
    {
        Player1 = true;
        Player2 = true;
        Player3 = true;
        Player4 = true;
        set_text_HiLite(view);
    }
    public void reset_game(View view)
    {
        life1 = 40;
        life2 = 40;
        life3 = 40;
        life4 = 40;

        prefs.edit().putInt(Player1Key, life1).apply();
        prefs.edit().putInt(Player2Key, life2).apply();
        prefs.edit().putInt(Player3Key, life3).apply();
        prefs.edit().putInt(Player4Key, life4).apply();

        DisplayLife();
        reset_player_select(view);


    }

    public void LaunchSettings(View view)
    {
        Intent Settings = new Intent(this, UserSettings.class);
        startActivity(Settings);
    }
}
