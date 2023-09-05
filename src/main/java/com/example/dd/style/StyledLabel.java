package com.example.dd.style;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class StyledLabel {

    private static Color textColor;


    public StyledLabel(Color textColor) {
        this.textColor = textColor;

    }

    public static Label createStyledLabel(String text) {
        Label label = new Label(text);
        label.setFont(Font.font("Verdana", FontWeight.BOLD, 13));
        label.setTextFill(textColor);
        return label;
    }
}


