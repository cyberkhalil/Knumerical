package Interfaces_and_Controllers.primitiveRoots;

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
 */
public class OrderController implements Initializable {

    @FXML
    private TextField Result;
    @FXML
    private TextField a;
    @FXML
    private TextField n;

    @FXML
    private void handlebacktomain(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getMainScene());
    }

    @FXML
    private void handlegetorder(ActionEvent event) {
        try {
            Result.setText(numberTheory.NumberTheoryUtil.order(HelpingClass.input2Long(a), HelpingClass.input2Long(n)) + "");

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
