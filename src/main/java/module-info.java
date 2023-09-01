module com.example.dd {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.example.dd to javafx.fxml;
    exports com.example.dd;
    exports com.example.dd.window;
    opens com.example.dd.window to javafx.fxml;
    exports com.example.dd.app.impl;
    opens com.example.dd.app.impl to javafx.fxml;
}