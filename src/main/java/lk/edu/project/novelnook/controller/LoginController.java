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
            if (emailTxt.getText().isEmpty()) {
                emailIncorrect.setVisible(true);
                emailTxt.setStyle(emailTxt.getStyle() + ";-fx-border-color: red;-fx-border-radius: 8px;-fx-background-radius: 8px;-fx-border-width: 2px");
            }else{
                if (passTxt.getText().isEmpty()) {
                    emailIncorrect.setVisible(false);
                    emailTxt.setStyle(emailTxt.getStyle()+";-fx-border-color: e5e7eb;-fx-border-width: 2px;-fx-border-radius: 8px;-fx-background-radius: 8px;-fx-background-color: fafafb");
                    passIncorrect.setVisible(true);
                    passTxt.setStyle(passIncorrect.getStyle()+";-fx-border-color: red;-fx-border-radius: 8px;-fx-border-width: 2px;-fx-background-radius: 8px;");
                }else{
                    emailIncorrect.setVisible(false);
                    passIncorrect.setVisible(false);
                    emailTxt.setStyle(emailTxt.getStyle()+";-fx-border-color: e5e7eb;-fx-border-width: 2px;-fx-border-radius: 8px;-fx-background-radius: 8px;-fx-background-color: fafafb");
                    passTxt.setStyle(passTxt.getStyle()+";-fx-border-color: e5e7eb;-fx-border-width: 2px;-fx-border-radius: 8px;-fx-background-radius: 8px;-fx-background-color: fafafb");
                }

            }

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
