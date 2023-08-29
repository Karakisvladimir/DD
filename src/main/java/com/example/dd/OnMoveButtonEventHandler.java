package com.example.dd;

import CityGetter.*;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class OnMoveButtonEventHandler implements EventHandler {
    private Label queryLabel2;
    private TextField textField;
    private CityGetter cityGetter;
    public OnMoveButtonEventHandler(){

    }
    public OnMoveButtonEventHandler(TextField textField,Label queryLabel2) {//TODO:remove later this constructor
        this.textField = textField;
        this.queryLabel2 = queryLabel2;
        this.cityGetter = new CityGetterByFile();
    }
    @Override
    public void handle(Event event) {
        String cityByUser = textField.getText();
        String cityByComputer = cityGetter.getCity(cityByUser.charAt(cityByUser.length()-1));
        queryLabel2.setText(cityByComputer);
        //label.setText("Buttton move pressed");
    }
}
