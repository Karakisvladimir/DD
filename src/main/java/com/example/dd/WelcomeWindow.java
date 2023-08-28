package com.example.dd;

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
    public static void show() {
        Stage welcomeWindow = new Stage();
        welcomeWindow.show();
        welcomeWindow.setTitle("Hi");
        welcomeWindow.setWidth(400);
        welcomeWindow.setHeight(100);

        Label label = new Label("Welcome to the game of childhood and all smart people");
        label.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        label.setStyle("-fx-background-color: yellow; -fx-padding: 6px;");
        label.setTextFill(Color.RED);

        Button okButton = new Button("OK");
        okButton.setOnAction(e ->

        {
            welcomeWindow.close();

            // Второе окно
            MainWindow.show();
        });

        FlowPane flowPane = new FlowPane(label, okButton);
        flowPane.setAlignment(Pos.CENTER);

        Scene welcomeScene = new Scene(flowPane);
        welcomeWindow.setScene(welcomeScene);
        welcomeWindow.show();
    }
}