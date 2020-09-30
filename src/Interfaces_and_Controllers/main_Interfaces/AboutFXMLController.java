/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces_and_Controllers.main_Interfaces;

import runningApplication.NumberTheoryApplication;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class AboutFXMLController implements Initializable {

    @FXML
    private void handlebacktomain(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getMainScene());
    }

    @FXML
    private void handleopengithublink(ActionEvent event) {
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://github.com/WaleedMortaja/Elementary-Number-Theory"));
        } catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    private void open(String link) {
    }

}
