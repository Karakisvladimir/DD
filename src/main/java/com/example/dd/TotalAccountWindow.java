package com.example.dd;

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
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class TotalAccountWindow {

    public static void show() {
        Stage window = new Stage();
        window.setTitle("TotalAccountWindow");
        window.setWidth(800);
        window.setHeight(400);


        Label label = new Label("YOU ARE LOSE, COMPUTER WIN");
        label.setFont(Font.font("Verdana", FontWeight.BOLD, 16));
        label.setStyle("-fx-background-color: blue; -fx-padding: 6px;");
        label.setTextFill(Color.YELLOW);
        Label label4 = new Label("Total Account  1 : 0");
        label.setMaxWidth(300);
        Button submitButton = new Button("PLAY AGAIN?");
        submitButton.setOnAction( e -> {
            window.close();
        });

        HBox hbox = new HBox(submitButton);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(10);

        VBox vBox = new VBox(label, label4, hbox);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(10, 10, 10, 10));

        Scene mainScene = new Scene(vBox);

        window.setScene(mainScene);
        window.show();
    }
}