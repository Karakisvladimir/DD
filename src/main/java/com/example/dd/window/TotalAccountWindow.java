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
import static com.example.dd.window.MainWindow.WELCOME_WINDOW_HEIGHT;
import static com.example.dd.window.MainWindow.WELCOME_WINDOW_WIDTH;


public class TotalAccountWindow {

    public static void show(GameScore gameScore) {
        Stage totalWindow = new Stage();
        totalWindow.setTitle("TotalAccountWindow");
        totalWindow.setWidth(WELCOME_WINDOW_WIDTH);
        totalWindow.setHeight(WELCOME_WINDOW_HEIGHT);
        StyledLabel winLabelStyle = new StyledLabel(Color.GREEN);
        Label labelWin = winLabelStyle.createStyledLabel("  ");

        if (gameScore.getHumanScore() == gameScore.getComputerScore()) {
            labelWin.setText("YOU WON, COMPUTER LOST");
        } else {
            labelWin.setText("YOU LOST, COMPUTER WON");
        }
        StyledLabel winTotalLabelStyle = new StyledLabel(Color.BLUEVIOLET);
        Label labelTotalWin = winTotalLabelStyle.createStyledLabel("Total Account: Player score: " + gameScore.getHumanScore() + " / Computer score: " + gameScore.getComputerScore());
        Button submitButton = new Button("PLAY AGAIN?");
        submitButton.setOnAction(e -> {
            totalWindow.close();

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

    }
}