/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces_and_Controllers.chinese;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import runningApplication.HelpingClass;
import runningApplication.NumberTheoryApplication;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class SolveChinese implements Initializable {

    @FXML
    private TextArea Input;
    @FXML
    private TextField Result;

    @FXML
    private void handlebacktomain(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getMainScene());
    }

    @FXML
    private void handlesolvechinese(ActionEvent event) {
        try {
            Result.setText(numberTheory.NumberTheoryUtil.chineseRemainderSolve(HelpingClass.input2ArrayListofArrayOfLongs(Input))[0] + "  (mod " + numberTheory.NumberTheoryUtil.chineseRemainderSolve(HelpingClass.input2ArrayListofArrayOfLongs(Input))[1] + ")");

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
