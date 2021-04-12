package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
       int PlayerPosition = calculateHighScorePosition(1500);
        displayHighScorePosition("harsh",PlayerPosition);
    }
    public static void displayHighScorePosition(String Player,int Position)
    {
        System.out.println("Name - "+ Player);
        System.out.println("High Score Postion = " + Position);
    }

    public static int calculateHighScorePosition(int PlayerScore)
    {
        if(PlayerScore >= 1000)
            return 1;
        else if(PlayerScore >= 500)
            return 2;
        else if(PlayerScore >=100)
            return 3;
        else
            return 4;
    }
}
