package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {


    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("test");
        Text text = new Text(400, 100, "Welcome to the game of childhood And all the smarties");
        text.setFont(new Font(40));
        BorderPane pane = new BorderPane();
        pane.setCenter(button);
        pane.setTop(text);
        Scene scene = new Scene(pane, 400, 500);
        primaryStage.setTitle("JavaFx Title");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
