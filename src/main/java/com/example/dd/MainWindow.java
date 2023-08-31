package com.example.dd;


import com.example.dd.style.StyledLabel;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;

public class MainWindow {

    public static void show() {
        Stage mainWindow = new Stage();
        mainWindow.setTitle("Cities");
        mainWindow.setWidth(400);
        mainWindow.setHeight(500);
        Label label = new Label();
        label.setMaxWidth(400);
        label.setMaxHeight(500);


        StyledLabel citiesLabelStyle = new StyledLabel(Color.TAN, Color.BLUE);
        Label cityLabel = citiesLabelStyle.createStyledLabel("Enter name of Cities:");
        TextField cityTextField = new TextField();


        StyledLabel computerLabelStyle = new StyledLabel(Color.ORCHID, Color.BLUE);
        Label computerLabel = computerLabelStyle.createStyledLabel("Computer:");


        StyledLabel computerUnswerLabelStyle = new StyledLabel(Color.CORAL, Color.BLUE);
        Label computerUnswerLabel = computerLabelStyle.createStyledLabel(null);
        Label hintLabel = new Label();
        Button loseButton = new Button("I give up");
        loseButton.setOnAction(e -> TotalAccountWindow.show());
        Button submitQueryButton = new Button("Make a move ");

        submitQueryButton.setOnAction(new OnMoveButtonEventHandler(cityTextField, computerUnswerLabel, hintLabel));

        HBox hbox = new HBox(submitQueryButton, loseButton);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(10);

        HBox hBoxComputerAnswer = new HBox(computerLabel, computerUnswerLabel);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(10);

        VBox mainVBox = new VBox(cityLabel, cityTextField, hBoxComputerAnswer, hintLabel, hbox);
        mainVBox.setAlignment(Pos.TOP_CENTER);
        mainVBox.setSpacing(10);
        mainVBox.setPadding(new Insets(10, 10, 10, 10));

        Scene mainScene = new Scene(mainVBox);

        mainWindow.setScene(mainScene);
        mainWindow.show();
    }



}