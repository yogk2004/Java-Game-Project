package com.example.stickherogame_ap_project_deadline1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.application.Platform;


import java.io.IOException;
import java.util.Objects;

public class HelloController {

    private Stage stage;
    private Scene scene;
    private Parent root;
    public void switchToScene2(ActionEvent e) throws Exception {
        // Use the provided ActionEvent parameter to get the source
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/stickherogame_ap_project_deadline1/Level1.fxml")));
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToExit(ActionEvent e) throws Exception {
        // Use the provided ActionEvent parameter to get the source
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/stickherogame_ap_project_deadline1/ExitScreen.fxml")));
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void exit(ActionEvent e) throws  Exception{
        javafx.application.Platform.exit();
    }
    public void moveToNextPlatform(ActionEvent e) throws IOException {

    }
}
