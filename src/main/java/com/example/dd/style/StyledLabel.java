package com.example.dd.style;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class StyledLabel {
    public static Label createStyledLabel(String text) {
        Label label = new Label(text);
        label.setFont(Font.font("Verdana", FontWeight.BOLD, 16));
        label.setStyle("-fx-background-color: blue; -fx-padding: 6px;");
        label.setTextFill(Color.YELLOW);
        return label;
    }
}


