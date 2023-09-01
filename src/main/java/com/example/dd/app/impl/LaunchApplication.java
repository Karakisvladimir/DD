package com.example.dd.app.impl;

import com.example.dd.window.WelcomeWindow;
import javafx.application.Application;
import javafx.stage.Stage;


public class LaunchApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        WelcomeWindow.show();
    }
}