package Interfaces_and_Controllers.diophantine;

import runningApplication.HelpingClass;
import runningApplication.NumberTheoryApplication;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class SolveDiophantineController implements Initializable {

    @FXML
    private TextField Input1;
    @FXML
    private TextField Input2;
    @FXML
    private TextField Input3;
    @FXML
    private TextField output1;
    @FXML
    private TextField output2;

    @FXML
    private void handlebacktomain(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getMainScene());
    }

    @FXML
    private void handleSolveDiophantine(ActionEvent event) {
        try {
            Long input1 = HelpingClass.input2Long(Input1);
            Long input2 = HelpingClass.input2Long(Input2);
            Long input3 = HelpingClass.input2Long(Input3);
            long[] array = numberTheory.NumberTheoryUtil.diophantineSolve(input1, input2, input3);
            {
                if (array[1] == 0) {
                    output1.setText(array[0] + "");
                } else if (array[1] == 1) {
                    if (array[0] == 0 && Long.signum(array[1]) == 1 /* 1 means positive*/) {
                        output1.setText(" t ");
                    } else if (array[0] == 0) {
                        output1.setText(array[1] + " t ");
                    } else {
                        output1.setText(array[0] + String.format(Locale.UK, " %+d", array[1]) + " t ");
                    }
                } else {
                    if (array[0] == 0) {
                        output1.setText(array[1] + " t");
                    } else {
                        output1.setText(array[0] + String.format(Locale.UK, " %+d", array[1]) + " t");
                    }
                }
            }
            {
                if (array[3] == 0) {
                    output2.setText(array[2] + "");
                } else if (array[3] == 1) {
                    if (array[2] == 2 && Long.signum(array[3]) == 1 /* 1 means positive*/) {
                        output2.setText(" t ");
                    } else if (array[2] == 0) {
                        output2.setText(array[3] + " t ");
                    } else {
                        output2.setText(array[2] + String.format(Locale.UK, " %+d", array[3]) + " t ");
                    }
                } else {
                    if (array[2] == 0) {
                        output2.setText(array[3] + " t");
                    } else {
                        output2.setText(array[2] + String.format(Locale.UK, " %+d", array[3]) + " t");
                    }
                }
            }
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
