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
import javafx.stage.Stage;

public class MainWindow {

    public static void show() {
        Stage mainWindow = new Stage();
        mainWindow.setTitle("Cities");
        mainWindow.setWidth(400);
        mainWindow.setHeight(500);
        Label label = new Label();
        label.setMaxWidth(400);
        label.setMaxHeight(500);


        StyledLabel citiesLabelStyle = new StyledLabel();
        Label cityLabel = citiesLabelStyle.createStyledLabel("Enter the City's name:");
        TextField cityTextField = new TextField();


        StyledLabel computerLabelStyle = new StyledLabel();
        Label computerLabel = computerLabelStyle.createStyledLabel("Computer:");


        StyledLabel computerAnswerLabelStyle = new StyledLabel();
        Label computerAnswerLabel = computerLabelStyle.createStyledLabel(null);
        Label hintLabel = new Label();
        Button loseButton = new Button("I give up");
        //loseButton.setOnAction(e -> TotalAccountWindow.show(new ScoreBoard()));
        Button submitQueryButton = new Button("Make a move ");
        ScoreBoard scoreBoard = new ScoreBoard();

        submitQueryButton.setOnAction(new OnMoveButtonEventHandler(cityTextField, computerAnswerLabel, hintLabel, scoreBoard));
        loseButton.setOnAction(e -> TotalAccountWindow.show(scoreBoard));

        HBox hbox = new HBox(submitQueryButton, loseButton);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(10);

        HBox hBoxComputerAnswer = new HBox(computerLabel, computerAnswerLabel);
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