package com.example.dd;

import CityGetter.*;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class OnMoveButtonEventHandler implements EventHandler {
    private Label answerLabel;
    private Label hintLabel;
    private TextField userTextField;
    private CityGetter cityGetter;
    public ScoreBoard scoreBoard;




    //public OnMoveButtonEventHandler(ScoreBoard scoreBoard){
//        this.scoreBoard = scoreBoard;
//    }
    public OnMoveButtonEventHandler(TextField userTextField,Label answerLabel, Label hintLabel, ScoreBoard scoreBoard) {
        this.userTextField = userTextField;
        this.answerLabel = answerLabel;
        this.cityGetter = new CityGetterByFile();
        this.hintLabel = hintLabel;
        this.answerLabel.setText(cityGetter.getLastCityByComputer());
        this.scoreBoard = scoreBoard;


    }
    @Override
    public void handle(Event event) {
        String cityByUser = userTextField.getText();
        if(cityGetter.validateCity(cityByUser)) {
            if(!cityGetter.isCityUsed(cityByUser)) {
                cityGetter.addProcessedCity(userTextField.getText());
                String cityByComputer = cityGetter.getCity(cityByUser.charAt(cityByUser.length()-1));
                if(cityByComputer.equals("")) {
                    TotalAccountWindow.show(scoreBoard);
                }
                else {
                    answerLabel.setText(cityByComputer);
                    scoreBoard.incrementUserScore();
                    hintLabel.setText("");
                    userTextField.setText("");
                }
            }
            else {
                hintLabel.setText("City already used.");
            }

        }
        else {
            hintLabel.setText("Incorrect city name");
        }
        scoreBoard.incrementComputerScore();
    }
}
