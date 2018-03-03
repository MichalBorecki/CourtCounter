package com.example.android.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView scoreViewA;
    TextView scoreViewB;
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int scoreTeamAbackup;
    int scoreTeamBbackup;
    private String SCORE_TEAM_A = "SCORE_TEAM_A";
    private String SCORE_TEAM_B = "SCORE_TEAM_B";
    private String SCORE_TEAM_A_BACKUP = "SCORE_TEAM_A_BACKUP";
    private String SCORE_TEAM_B_BACKUP = "SCORE_TEAM_B_BACKUP";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreViewA = (TextView) findViewById(R.id.team_a_score);
        scoreViewB = (TextView) findViewById(R.id.team_b_score);
    }

    //Use onSaveInstanceState(Bundle) and onRestoreInstanceState

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(SCORE_TEAM_A, scoreTeamA);
        outState.putInt(SCORE_TEAM_B, scoreTeamB);
        outState.putInt(SCORE_TEAM_A_BACKUP, scoreTeamAbackup);
        outState.putInt(SCORE_TEAM_B_BACKUP, scoreTeamBbackup);
    }

    //onRestoreInstanceState

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreTeamA = savedInstanceState.getInt(SCORE_TEAM_A);
        scoreTeamB = savedInstanceState.getInt(SCORE_TEAM_B);
        scoreTeamAbackup = savedInstanceState.getInt(SCORE_TEAM_A_BACKUP);
        scoreTeamBbackup = savedInstanceState.getInt(SCORE_TEAM_B_BACKUP);
        // displayForTeamA(scoreTeamAbackup);
        displayForTeamA(scoreTeamA);
        // displayForTeamB(scoreTeamBbackup);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Buttons for Team A
     */
    public void add5forTeamA(View view) {
        scoreTeamA = scoreTeamA + 5;
        displayForTeamA(scoreTeamA);
    }

    public void add4forTeamA(View view) {
        scoreTeamA = scoreTeamA + 4;
        displayForTeamA(scoreTeamA);
    }

    public void add3forTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void add2forTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void add1forTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        scoreViewA.setText(String.valueOf(score));
    }

    /**
     * Buttons for Team B
     */
    public void add5forTeamB(View view) {
        scoreTeamB = scoreTeamB + 5;
        displayForTeamB(scoreTeamB);
    }

    public void add4forTeamB(View view) {
        scoreTeamB = scoreTeamB + 4;
        displayForTeamB(scoreTeamB);
    }

    public void add3forTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void add2forTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void add1forTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        scoreViewB.setText(String.valueOf(score));
    }

    /**
     * Reset the score
     */
    public void reset(View view) {
        scoreTeamAbackup = scoreTeamA;
        scoreTeamA = 0;
        scoreTeamBbackup = scoreTeamB;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Bring back last scores
     */
    public void undo(View view) {
        scoreTeamA = scoreTeamAbackup;
        scoreTeamB = scoreTeamBbackup;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
