package com.example.dd;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
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

        Label queryLabel = new Label("Enter name of Cities:");
        TextField queryTextField = new TextField();

        Label computerLabel = new Label("Computer:");
        Label computerAnswer = new Label();
        Label hintLabel = new Label();
        Button loseButton = new Button("I give up");
        loseButton.setOnAction(e -> TotalAccountWindow.show());
        Button submitQueryButton = new Button("Make a move ");
        //submitQueryButton.setOnAction(e -> queryAction(queryTextField, queryLabel2));

        submitQueryButton.setOnAction(new OnMoveButtonEventHandler(queryTextField,computerAnswer,hintLabel));

        HBox hbox = new HBox(submitQueryButton, loseButton);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(10);

        HBox hBoxComputerAnswer = new HBox(computerLabel, computerAnswer);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(10);

        VBox mainVBox = new VBox(queryLabel, queryTextField, hBoxComputerAnswer,hintLabel, hbox);
        mainVBox.setAlignment(Pos.TOP_CENTER);
        mainVBox.setSpacing(10);
        mainVBox.setPadding(new Insets(10, 10, 10, 10));

        Scene mainScene = new Scene(mainVBox);

        mainWindow.setScene(mainScene);
        mainWindow.show();
    }

    private static void queryAction(TextField queryTextField, Label queryLabel2) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("list.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                if(line.equals(queryTextField.getText())) {
                    queryLabel2.setText("Correct Word");
                    return;
                }
            }
            queryLabel2.setText("Incorrect Word");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}