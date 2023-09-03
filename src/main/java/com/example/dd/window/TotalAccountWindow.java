package com.example.dd.window;

import com.example.dd.app.impl.GameScore;
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


public class TotalAccountWindow {

    public static void show(GameScore gameScore) {
        Stage totalWindow = new Stage();
        totalWindow.setTitle("TotalAccountWindow");
        totalWindow.setWidth(800);
        totalWindow.setHeight(400);
        StyledLabel winLabelStyle = new StyledLabel(Color.GREEN);
        Label labelWin = winLabelStyle.createStyledLabel(" ");
        if (gameScore.getHumanScore() != gameScore.getComputerScore()) {
            labelWin.setText(" YOU ARE WIN, COMPUTER LOSE");
        } else {
            labelWin.setText("YOU ARE LOSE, COMPUTER WIN");
        }
<<<<<<<<< Temporary merge branch 1

        Label labelTotalWin = new Label("Total Account: Player score: " + gameScore.getHumanScore() + " / Computer score: " + gameScore.getComputerScore());
=========
        StyledLabel labelTotalWinLabelStyle = new StyledLabel(Color.DARKBLUE);
        Label labelTotalWin = labelTotalWinLabelStyle.createStyledLabel("Total Account: Player score: " + gameScore.getHumanScore() + " / Computer score: " + gameScore.getComputerScore());

>>>>>>>>> Temporary merge branch 2

        Button submitButton = new Button("PLAY AGAIN?");
        submitButton.setOnAction(e -> {
            totalWindow.close();
<<<<<<<<< Temporary merge branch 1
            gameScore.resetScore();
=========


            gameScore.resetScore();

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
>>>>>>>>> Temporary merge branch 2

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