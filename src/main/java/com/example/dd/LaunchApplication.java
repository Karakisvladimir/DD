package com.example.dd;

import javafx.application.Application;
import javafx.stage.Stage;


public class LaunchApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        WelcomeWindow.show();
        Stage totalAccountWindow = new Stage();
        //TotalAccountWindow.show(totalAccountWindow);




    }
}