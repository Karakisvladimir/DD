package com.example.dd;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
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

        Button okButton = new Button("OK");
        Button startButton = new Button("Start");

        HBox hBox = new HBox(okButton, startButton);

        VBox vBox = new VBox(label, hBox);

        Scene welcomeScene = new Scene(vBox);

        welcomeWindow.setScene(welcomeScene);
        welcomeWindow.show();


        Stage mainWindow = new Stage();
        mainWindow.setTitle("Cities");
        mainWindow.setWidth(400);
        mainWindow.setHeight(500);
        label.setMaxWidth(100);
        label.setMaxHeight(100);

        Label queryLabel = new Label("Enter name of Cities:");
        TextField queryTextField = new TextField();
        Label queryLabel2 = new Label("Enter name of Cities:");
        Button submitQueryButton = new Button("Computer: ");

        VBox mainVBox = new VBox(queryLabel, queryTextField, submitQueryButton);

        Scene mainScene = new Scene(mainVBox);

        mainWindow.setScene(mainScene);
        mainWindow.show();
    }

}


