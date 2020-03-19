package org.example;

import java.awt.*;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    public TextField username;

    @FXML
    public PasswordField password;

    @FXML
    public javafx.scene.control.Button loginButton;

    public void getUserName() throws IOException {
        if (loginButton.isArmed()) {
            username.getText();
            App.setRoot("configuration");
        }

    }


    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
