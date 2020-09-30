/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces_and_Controllers.GCD;

import runningApplication.HelpingClass;
import runningApplication.NumberTheoryApplication;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class GcdAsLinearCombinationController implements Initializable {

    @FXML
    private TextField Input1;
    @FXML
    private TextField Input2;
    @FXML
    private TextField Resultc;
    @FXML
    private TextField Resultgcd;

    @FXML
    private void handlebacktomain(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getMainScene());
    }

    @FXML
    private void handleGetGcdAsLinearCombination(ActionEvent event) {
        try {
            long[] array = numberTheory.NumberTheoryUtil.gcdAsLinearCombination(HelpingClass.input2Long(Input1), HelpingClass.input2Long(Input2));
            Resultc.setText(array[0] + " = " + array[1] + " * " + array[2] + " + " + array[3] + " * " + array[4]);
            Resultgcd.setText(array[0] + "");
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
