package com.example.basket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score_A = 0;

    public void Three_Team_A(View v) {
        score_A = score_A + 3;
        displayTeamA(score_A);

    }

    public void two_Team_A(View v){
        score_A=score_A+2;
        displayTeamA(score_A);

    }
     public void one_Team_A(View v){
         score_A=score_A+1;
        displayTeamA(score_A);

    }

    private void displayTeamA(int score){
        TextView scoreView_a= (TextView) findViewById(R.id.team_a_score);
        scoreView_a.setText(String.valueOf(score));
    }

    int score_B = 0;

    public void Three_Team_B(View v) {
        score_B = score_B + 3;
        displayTeamB(score_B);

    }

    public void two_Team_B(View v){
        score_B=score_B+2;
        displayTeamB(score_B);

    }
    public void one_Team_B(View v){
        score_B=score_B+1;
        displayTeamB(score_B);

    }

    private void displayTeamB(int score){
        TextView scoreView_b= (TextView) findViewById(R.id.team_b_score);
        scoreView_b.setText(String.valueOf(score));
    }

    public void resetBotton(View v){
        score_A=0;
        score_B=0;
        displayTeamA(score_A);
        displayTeamB(score_B);
    }

}