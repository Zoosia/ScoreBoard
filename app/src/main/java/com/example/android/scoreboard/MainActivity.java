package com.example.android.scoreboard;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    int ScoreA = 0;
    int ScoreB = 0;
    int AceA = 0;
    int AceB = 0;
    int SpikeA = 0;
    int SpikeB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void OnePointForTeamA(View v) {
        ScoreA = ScoreA + 1;
        displayForTeamA(ScoreA);
    }


    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addOnePointForTeamB(View v) {
        ScoreB = ScoreB + 1;
        displayForTeamB(ScoreB);
    }

    public void addAceForTeamA(View view) {
        AceA = AceA + 1;

    }

    public void addSpikeForTeamA(View view) {
        SpikeA = SpikeA + 1;

    }

    public void addAceForTeamB(View view) {
        AceB = AceB + 1;

    }

    public void addSpikeForTeamB(View view) {
        SpikeB = SpikeB + 1;

    }

    public void showStats(View view) {
        Context context = getApplicationContext();
        CharSequence text = "ACES FOR TEAM A: " + AceA + " || SPIKES FOR TEAM A: " + SpikeA + "\nACES FOR TEAM B: " + AceB + " || SPIKES FOR TEAM B " + SpikeB;
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();


    }


    public void RESET(View v) {
        displayForTeamA(0);
        displayForTeamB(0);
    }


}


