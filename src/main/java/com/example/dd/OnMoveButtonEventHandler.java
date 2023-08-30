package com.example.dd;

import CityGetter.*;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class OnMoveButtonEventHandler implements EventHandler {
    private Label answerLabel;
    private TextField userTextField;
    private CityGetter cityGetter;
    public OnMoveButtonEventHandler(){

    }
    public OnMoveButtonEventHandler(TextField userTextField,Label answerLabel) {//TODO:remove later this constructor
        this.userTextField = userTextField;
        this.answerLabel = answerLabel;
        this.cityGetter = new CityGetterByFile();
    }
    @Override
    public void handle(Event event) {
        String cityByUser = userTextField.getText();
        if(cityGetter.validateCity(cityByUser)) {
            cityGetter.addProcessedCity(userTextField.getText());
            String cityByComputer = cityGetter.getCity(cityByUser.charAt(cityByUser.length()-1));
            if(cityByComputer.equals("")) {
                TotalAccountWindow.show();
            }
            else {
                answerLabel.setText(cityByComputer);
            }
        }
        else {
            answerLabel.setText("Incorrect city name");
        }
        //label.setText("Buttton move pressed");
    }
}
