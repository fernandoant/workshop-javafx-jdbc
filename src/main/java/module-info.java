module application.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens application.workshopjavafxjdbc to javafx.fxml;
    exports application.workshopjavafxjdbc;
    exports application.workshopjavafxjdbc.gui;
    opens application.workshopjavafxjdbc.gui to javafx.fxml;
    exports application.workshopjavafxjdbc.gui.util;
    opens application.workshopjavafxjdbc.gui.util to javafx.fxml;
}