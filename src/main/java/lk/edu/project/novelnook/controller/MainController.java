package lk.edu.project.novelnook.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import lk.edu.project.novelnook.utils.WindowUtil;

public class MainController {
    @FXML
    private AnchorPane mainPane;

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

    public void closeWindow(MouseEvent mouseEvent) {
        this.mainPane.getScene().getWindow().hide();
    }

    public void letsStartButtonClick(ActionEvent actionEvent) {
        this.mainPane.getScene().getWindow().hide();
        new WindowUtil().setStage("MainView");
    }
}
