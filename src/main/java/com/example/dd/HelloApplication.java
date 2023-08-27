package com.example.dd;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;


public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {


        Stage welcomeWindow = new Stage();
        welcomeWindow.setTitle("Hi");
        welcomeWindow.setWidth(400);
        welcomeWindow.setHeight(100);


        Label label = new Label("Welcome to the game of childhood and all smart people");
        label.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        label.setStyle("-fx-background-color: yellow; -fx-padding: 6px;");
        label.setTextFill(Color.RED);

        Button okButton = new Button("OK");

        FlowPane flowPane = new FlowPane(label, okButton);

        flowPane.setAlignment(Pos.CENTER);

        Scene welcomeScene = new Scene(flowPane);
        welcomeWindow.setScene(welcomeScene);
        welcomeWindow.show();

        // Second window
        Stage mainWindow = new Stage();
        mainWindow.setTitle("Cities");
        mainWindow.setWidth(400);
        mainWindow.setHeight(500);
        label.setMaxWidth(400);
        label.setMaxHeight(500);

        Label queryLabel = new Label("Enter name of Cities:");
        TextField queryTextField = new TextField();

        Label queryLabel2 = new Label("Computer:");
        Button submitQueryButton = new Button("Make a move ");


        VBox mainVBox = new VBox(queryLabel, queryTextField, queryLabel2, submitQueryButton);

        Scene mainScene = new Scene(mainVBox);

        mainWindow.setScene(mainScene);
        mainWindow.show();
    }

}

