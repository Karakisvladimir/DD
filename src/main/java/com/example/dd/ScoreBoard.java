package com.example.dd;

public class ScoreBoard {
    private int userScore;
    private int computerScore;

    public int getUserScore() {
        return userScore;
    }

    public void setUserScore(int userScore) {
        this.userScore = userScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public void setComputerScore(int computerScore) {
        this.computerScore = computerScore;
    }

    public void incrementUserScore() {
        userScore = userScore + 1;
    }

    public void incrementComputerScore() {
        computerScore = computerScore + 1;
    }
}
