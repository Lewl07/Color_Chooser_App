module com.mycompany.color_chooser_app {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.color_chooser_app to javafx.fxml;
    exports com.mycompany.color_chooser_app;
}
