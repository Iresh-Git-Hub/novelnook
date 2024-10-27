package lk.edu.project.novelnook;

import javafx.application.Application;
import javafx.stage.Stage;
import lk.edu.project.novelnook.utils.WindowUtil;

import java.io.IOException;

public class AppInitializer extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        new WindowUtil().setStage("MainView");
    }

    public static void main(String[] args) {
        launch();
    }
}