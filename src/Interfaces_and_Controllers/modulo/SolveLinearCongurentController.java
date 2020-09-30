/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces_and_Controllers.modulo;

import runningApplication.HelpingClass;
import runningApplication.NumberTheoryApplication;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class SolveLinearCongurentController implements Initializable {

    @FXML
    private TextField Input1;
    @FXML
    private TextField Input2;
    @FXML
    private TextField Input3;
    @FXML
    private TextField Output1;
    @FXML
    private TextField Output2;
    @FXML
    private Label N_O_S;

    @FXML
    private void handlebacktomain(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getMainScene());
    }

    @FXML
    private void handlesolvelinearcongurent(ActionEvent event) {
        try {
            Output1.setText("");
            Output2.setText("");
            if (numberTheory.NumberTheoryUtil.linearCongurentSolve(HelpingClass.input2Long(Input1), HelpingClass.input2Long(Input2), HelpingClass.input2Long(Input3)).isEmpty()) {
                throw new UnknownError();
            } else {
                Output1.setText(numberTheory.NumberTheoryUtil.linearCongurentSolve(HelpingClass.input2Long(Input1), HelpingClass.input2Long(Input2), HelpingClass.input2Long(Input3)) + "");
                Output2.setText(Input3.getText());
                N_O_S.setText("Number of solutions: " + numberTheory.NumberTheoryUtil.linearCongurentSolve(HelpingClass.input2Long(Input1), HelpingClass.input2Long(Input2), HelpingClass.input2Long(Input3)).size());
            }

        } catch (NumberFormatException nfe) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("You entered an invalid number");
            alert.showAndWait();
        } catch (NullPointerException npe) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText(npe.getMessage());
            alert.showAndWait();
        } catch (IllegalArgumentException illex) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText(illex.getMessage());
            alert.showAndWait();
        } catch (UnknownError ue) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("There is no solution for x");
            alert.showAndWait();
        } catch (Exception ex) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText(ex.getMessage());
            alert.showAndWait();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

}
