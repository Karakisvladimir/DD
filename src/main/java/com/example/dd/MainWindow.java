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

public class MainWindow {

    public static void show() {
        Stage mainWindow = new Stage();
        mainWindow.setTitle("Cities");
        mainWindow.setWidth(400);
        mainWindow.setHeight(500);
        Label label = new Label(); //Label взят из javafx.scene.control
        label.setMaxWidth(400);
        label.setMaxHeight(500);

        Label queryLabel = new Label("Enter name of Cities:");
        TextField queryTextField = new TextField();

        Label queryLabel2 = new Label("Computer:");
        Button loseButton = new Button("I give up");
        loseButton.setOnAction(e -> TotalAccountWindow.show());
        Button submitQueryButton = new Button("Make a move ");

        HBox hbox = new HBox(submitQueryButton, loseButton);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(10);

        VBox mainVBox = new VBox(queryLabel, queryTextField, queryLabel2, hbox);
        mainVBox.setAlignment(Pos.TOP_CENTER);
        mainVBox.setSpacing(10);
        mainVBox.setPadding(new Insets(10, 10, 10, 10));

        Scene mainScene = new Scene(mainVBox);

        mainWindow.setScene(mainScene);
        mainWindow.show();
    }
}