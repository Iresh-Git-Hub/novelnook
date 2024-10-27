package lk.edu.project.novelnook.controller;

import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import lk.edu.project.novelnook.utils.WindowUtil;

import java.net.URL;
import java.util.ResourceBundle;

public class ContactController implements Initializable {

    public AnchorPane mainPane;
    public TextField reciverEmailTxt;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        reciverEmailTxt.setDisable(true);
        System.out.println(reciverEmailTxt.getText());
    }

    public void gotoHomeView(MouseEvent mouseEvent) {
        this.mainPane.getScene().getWindow().hide();
        new WindowUtil().setStage("MainView");
    }

    public void gotoServiceView(MouseEvent mouseEvent) {
        this.mainPane.getScene().getWindow().hide();
        new WindowUtil().setStage("ServiceView");
    }

    public void gooAboutView(MouseEvent mouseEvent) {
        this.mainPane.getScene().getWindow().hide();
        new WindowUtil().setStage("AboutView");
    }

    public void gotoContactView(MouseEvent mouseEvent) {
        this.mainPane.getScene().getWindow().hide();
        new WindowUtil().setStage("ContactView");
    }

    public void closeWindow(MouseEvent mouseEvent) {
        this.mainPane.getScene().getWindow().hide();
    }
}
