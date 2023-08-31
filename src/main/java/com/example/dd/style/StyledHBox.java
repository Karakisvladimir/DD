package com.example.dd.style;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
public class StyledHBox {

        public static HBox createStyledHBox(Button button) {
            HBox hbox = new HBox(button);
            hbox.setAlignment(Pos.CENTER);
            hbox.setSpacing(10);
            return hbox;
        }
    }

