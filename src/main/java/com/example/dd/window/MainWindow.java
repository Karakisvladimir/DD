package com.example.dd.window;


import com.example.dd.app.impl.GameScore;
import com.example.dd.app.impl.OnMoveButtonEventHandler;
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
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class MainWindow {
    public static final int WELCOME_WINDOW_WIDTH = 450;
    public static final int WELCOME_WINDOW_HEIGHT = 500;
    public static void show() {
        Stage mainWindow = new Stage();
        mainWindow.setTitle("Cities");
        mainWindow.setWidth(WELCOME_WINDOW_WIDTH);
        mainWindow.setHeight(WELCOME_WINDOW_HEIGHT);
        Label label = new Label();
        label.setMaxWidth(400);
        label.setMaxHeight(500);
        GameScore gameScore = new GameScore();

        StyledLabel citiesLabelStyle = new StyledLabel(Color.TAN);
        Label cityLabel = citiesLabelStyle.createStyledLabel("Enter the City's name: ");
        TextField cityTextField = new TextField();

        StyledLabel computerLabelStyle = new StyledLabel(Color.ORCHID);
        Label computerLabel = computerLabelStyle.createStyledLabel("Computer: ");

        StyledLabel computerAnswerLabelStyle = new StyledLabel(Color.CORAL);
        Label computerAnswerLabel = computerAnswerLabelStyle.createStyledLabel(null);
        Label hintLabel = new Label();

        Button submitQueryButton = new Button("Make a move ");
        OnMoveButtonEventHandler onMoveButtonEventHandler = new OnMoveButtonEventHandler(cityTextField,
                computerAnswerLabel, hintLabel, gameScore, mainWindow);
        submitQueryButton.setOnAction(onMoveButtonEventHandler);

        StyledLabel sorryLabelStyle = new StyledLabel(Color.DARKBLUE);
        Label sorryLabel = sorryLabelStyle.createStyledLabel("If you can't answer press the button\n\t\t  " +
                "<<I give up>> ");
        Button loseButton = new Button("I give up");
        loseButton.setOnAction(e -> {
            TotalAccountWindow.show(onMoveButtonEventHandler.getGameScore());
            mainWindow.close();
        });

        HBox hbox = new HBox(submitQueryButton, loseButton);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(10);

        HBox hBoxComputerAnswer = new HBox(computerLabel, computerAnswerLabel);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(10);

        VBox mainVBox = new VBox(cityLabel, cityTextField, hBoxComputerAnswer, hintLabel, sorryLabel, hbox);
        mainVBox.setAlignment(Pos.TOP_CENTER);
        mainVBox.setSpacing(10);
        mainVBox.setPadding(new Insets(10, 10, 10, 10));

        sorryLabel.setFont(Font.font(12));
        Scene mainScene = new Scene(mainVBox);

        mainWindow.setScene(mainScene);
        mainWindow.show();
    }
}