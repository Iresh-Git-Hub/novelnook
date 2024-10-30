package lk.edu.project.novelnook;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;
import lk.edu.project.novelnook.controller.LoginController;
import lk.edu.project.novelnook.utils.WindowUtil;

import java.io.IOException;

public class AppInitializer extends Application {
    public ImageView closeButton;
    public AnchorPane mainPane;

    @Override
    public void start(Stage stage) throws IOException {
        new WindowUtil().setStage("HomeView");
    }

    public static void main(String[] args) {
        launch();
    }

    public void closeWindow(MouseEvent mouseEvent) {
        this.closeButton.getScene().getWindow().hide();
    }

    public void gotoHomeView(MouseEvent mouseEvent) {
        this.mainPane.getScene().getWindow().hide();
        new WindowUtil().setStage("HomeView");
    }

    public void gotoServiceView(MouseEvent mouseEvent) {
        this.mainPane.getScene().getWindow().hide();
        new WindowUtil().setStage("ServiceView");
    }

    public void gotoAboutView(MouseEvent mouseEvent) {
        this.mainPane.getScene().getWindow().hide();
        new WindowUtil().setStage("AboutView");
    }

    public void gotoLoginView(ActionEvent actionEvent) throws IOException {
        //this.mainPane.getScene().getWindow().hide();
        new WindowUtil().setStage("LoginView");
    }
}