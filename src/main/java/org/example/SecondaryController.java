package org.example;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class SecondaryController {
    @FXML
    ListView<String> list;

    @FXML
    Button kategorie;

    ObservableList<String> items = FXCollections.observableArrayList (
            "Lampe", "Toilettenpapier", "Eis", "Handschuhe");


    public void showArticleByCategory() {
        if (kategorie.isArmed()) {
            list.setItems(items);
        }
    }
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}
