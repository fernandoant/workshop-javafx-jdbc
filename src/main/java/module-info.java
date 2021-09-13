module application.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens application.workshopjavafxjdbc to javafx.fxml;
    exports application.workshopjavafxjdbc;
}