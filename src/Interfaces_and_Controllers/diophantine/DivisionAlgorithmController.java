/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces_and_Controllers.diophantine;

import runningApplication.HelpingClass;
import runningApplication.NumberTheoryApplication;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class DivisionAlgorithmController implements Initializable {

    @FXML
    private TextField Input1;
    @FXML
    private TextField Input2;
    @FXML
    private TextField Output1;
    @FXML
    private TextField Output2;

    @FXML
    private void handlebacktomain(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getMainScene());
    }

    @FXML
    private void handleDivisionAlgorithm(ActionEvent event) {
        try {
            Long input1 = HelpingClass.input2Long(Input1);
            Long input2 = HelpingClass.input2Long(Input2);
            Output1.setText(numberTheory.NumberTheoryUtil.divisionAlgorithm(input1, input2)[1] + "");
            Output2.setText(numberTheory.NumberTheoryUtil.divisionAlgorithm(input1, input2)[3] + "");
        } catch (NumberFormatException nfe) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("You entered an invalid number");
            alert.showAndWait();
        } catch (NullPointerException | IllegalArgumentException npe) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText(npe.getMessage());
            alert.showAndWait();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

}
