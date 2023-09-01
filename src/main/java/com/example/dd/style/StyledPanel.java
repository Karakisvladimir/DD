package com.example.dd.style;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class StyledPanel {
    private Button button;

    public StyledPanel(Button button) {
        this.button = button;
    }

    public HBox createStyledHBox() {
        HBox hbox = new HBox(button);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(10);
        return hbox;
    }

    public VBox createStyledVBox(Label labelResult, Label labelTotalAccount, HBox hbox) {
        VBox vBox = new VBox(labelResult,labelTotalAccount, hbox);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(10, 10, 10, 10));
        return vBox;
    }
}

