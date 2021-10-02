module application.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;


    opens application.workshopjavafxjdbc to javafx.fxml;
    exports application.workshopjavafxjdbc;
    exports application.workshopjavafxjdbc.gui;
    opens application.workshopjavafxjdbc.gui to javafx.fxml;
    opens application.workshopjavafxjdbc.model.entities to javafx.fxml, javafx.graphics, javafx.base;
    exports application.workshopjavafxjdbc.gui.util;
    opens application.workshopjavafxjdbc.gui.util to javafx.fxml;
}