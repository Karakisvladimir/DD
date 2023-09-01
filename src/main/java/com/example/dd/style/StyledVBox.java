package com.example.dd.style;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
public class StyledVBox {

        public static VBox createStyledVBox(Label labelResult, Label labelTotalAccount, Label labelWin,HBox hbox) {
            VBox vBox = new VBox(labelResult,labelTotalAccount, hbox);
            vBox.setAlignment(Pos.CENTER);
            vBox.setSpacing(10);
            vBox.setPadding(new Insets(10, 10, 10, 10));
            return vBox;
        }
    }

