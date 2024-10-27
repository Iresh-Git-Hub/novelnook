module lk.edu.project.novelnook {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.mail;
    requires java.sql;

    opens lk.edu.project.novelnook.controller to javafx.fxml;
    opens lk.edu.project.novelnook to javafx.fxml;
    exports lk.edu.project.novelnook;
}