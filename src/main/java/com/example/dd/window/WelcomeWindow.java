package com.example.dd.window;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class WelcomeWindow {

    public static final int WELCOME_WINDOW_WIDTH = 400;
    public static final int WELCOME_WINDOW_HEIGHT = 100;
    public static void show() {
        Stage welcomeWindow = new Stage();
        welcomeWindow.show();
        welcomeWindow.setTitle("Welcome");
        welcomeWindow.setWidth(WELCOME_WINDOW_WIDTH);
        welcomeWindow.setHeight(WELCOME_WINDOW_HEIGHT);

        Label labelWelcome = new Label("Welcome to the game of your childhood and all smarties");
        labelWelcome.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        labelWelcome.setStyle("-fx-background-color: yellow; -fx-padding: 6px;");
        labelWelcome.setTextFill(Color.RED);

        Button okButton = new Button("OK");
        okButton.setOnAction(e ->

        {
            welcomeWindow.close();

            MainWindow.show();
        });

        FlowPane flowPane = new FlowPane(labelWelcome, okButton);
        flowPane.setAlignment(Pos.CENTER);
        flowPane.setPrefWidth(400);
        flowPane.setPrefHeight(100);

        Scene welcomeScene = new Scene(flowPane);
        welcomeWindow.setScene(welcomeScene);
        welcomeWindow.centerOnScreen();
        welcomeWindow.show();
    }
}