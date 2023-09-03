package com.example.dd.app.impl;

import CityGetter.*;
import com.example.dd.window.TotalAccountWindow;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class OnMoveButtonEventHandler implements EventHandler {
    private Label answerLabel;
    private Label hintLabel;
    private TextField userTextField;
    private CityGetter cityGetter;
    private GameScore gameScore;
    private Stage mainWindow;

    public GameScore getGameScore() {
        return gameScore;
    }

    public OnMoveButtonEventHandler() {
    }

    public OnMoveButtonEventHandler(TextField userTextField, Label answerLabel, Label hintLabel, GameScore gameScore, Stage mainWindow) {
        this.userTextField = userTextField;
        this.answerLabel = answerLabel;
        this.cityGetter = new CityGetterByFile();
        this.hintLabel = hintLabel;
        this.answerLabel.setText(cityGetter.getLastCityByComputer());
        this.gameScore = new GameScore();
        this.gameScore.incrementComputerScore();
        this.mainWindow = mainWindow;
    }

    @Override
    public void handle(Event event) {

        String cityByUser = userTextField.getText();
        if (cityGetter.validateCity(cityByUser)) {
            if (!cityGetter.isCityUsed(cityByUser)) {
                gameScore.incrementHumanScore();
                cityGetter.removeCityToProcess(userTextField.getText());
                cityGetter.addProcessedCity(userTextField.getText());
                String cityByComputer = cityGetter.getCity(cityByUser.charAt(cityByUser.length() - 1));
                if (cityByComputer.equals("")) {
                    TotalAccountWindow.show(gameScore);
                    mainWindow.close();
                } else {
                    answerLabel.setText(cityByComputer);
                    cityGetter.removeCityToProcess(cityByComputer);
                    cityGetter.addProcessedCity(cityByComputer);
                    hintLabel.setText("");
                    gameScore.incrementComputerScore();
                    userTextField.setText("");
                }
            } else {
                hintLabel.setText("City already used.");
            }

        } else {
            hintLabel.setText("Incorrect city name");
        }
    }
}