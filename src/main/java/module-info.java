module com.example.dd {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.example.dd to javafx.fxml;
    exports com.example.dd;
}