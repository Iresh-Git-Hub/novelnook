package lk.edu.project.novelnook.controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public ImageView closeButton;
    public AnchorPane mainLoginPane;
    public Label emailIncorrect;
    public Label passIncorrect;
    public PasswordField passTxt;
    public TextField emailTxt;

    public void closeWindow(MouseEvent mouseEvent) {
        this.closeButton.getScene().getWindow().hide();
    }

    public void gotoDashboard(ActionEvent actionEvent) {
        try {

            // methana gahanna thiyeno

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.emailIncorrect.setVisible(false);
        this.passIncorrect.setVisible(false);
    }
}
