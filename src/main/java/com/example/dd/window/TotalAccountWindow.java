package com.example.dd.window;

import com.example.dd.style.StyledLabel;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import static CityGetter.CityGetter.resetAll;

public class TotalAccountWindow {

    public static void show() {
        Stage totalWindow = new Stage();
        totalWindow.setTitle("TotalAccountWindow");
        totalWindow.setWidth(800);
        totalWindow.setHeight(400);

        StyledLabel winLabelStyle = new StyledLabel(Color.ORCHID);
        Label labelWin = winLabelStyle.createStyledLabel("YOU ARE LOSE, COMPUTER WIN");
        StyledLabel totalLabelStyle = new StyledLabel(Color.GREEN);
        Label labelTotalWin = winLabelStyle.createStyledLabel("Total Account  ");


        Button submitButton = new Button("PLAY AGAIN?");
        submitButton.setOnAction(e -> {
            totalWindow.close();
            resetAll();
            MainWindow.show();
        });

        HBox hbox = new HBox(submitButton);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(10);

        VBox vBox = new VBox(labelWin, labelTotalWin, hbox);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(10, 10, 10, 10));

        Scene mainScene = new Scene(vBox);

        totalWindow.setScene(mainScene);
        totalWindow.show();
    }
}