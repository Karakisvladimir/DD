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

public class TotalAccountWindow {

    public static void show() {
        Stage window = new Stage();
        window.setTitle("TotalAccountWindow");
        window.setWidth(800);
        window.setHeight(400);

        Label label = new Label("Total Account");
        label.setMaxWidth(300);
        TextField textField = new TextField();
        textField.setMaxWidth(250);

        Button submitButton = new Button("Submit");
        submitButton.setOnAction( e -> {
            window.close();
        });

        HBox hbox = new HBox(submitButton);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(10);

        VBox vBox = new VBox(label, textField, hbox);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(10, 10, 10, 10));

        Scene mainScene = new Scene(vBox);

        window.setScene(mainScene);
        window.show();
    }
}