package com.example.project2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;


public class MainController {

    private Stage stage;
    private Scene scene;
    private Parent root;


    @FXML
    private Button CustomerLogin;

    @FXML
    public void customerLogin(ActionEvent event)throws IOException {

            Parent root = FXMLLoader.load(getClass().getResource("customerLogin.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("ABC");
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

    }

}
