package com.example.dd.app.impl;

public class GameScore {
    private int humanScore = 0;
    private int computerScore = 0;

    public void incrementHumanScore() {
        humanScore++;
    }

    public void incrementComputerScore() {
        computerScore++;
    }

    public int getHumanScore() {
        return humanScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public void resetScore() {
        humanScore = 0;
        computerScore = 0;
    }
}
