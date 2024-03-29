package Interfaces_and_Controllers.primitiveRoots;

import runningApplication.HelpingClass;
import runningApplication.NumberTheoryApplication;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 */
public class PrimitiveRootsController implements Initializable {

    @FXML
    private Button Getalldivisors;

    @FXML
    private TextArea Result;
    @FXML
    private TextField Input;

    @FXML
    private void handlebacktomain(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getMainScene());
    }

    @FXML
    private void handlePrimitiveroots(ActionEvent event) {
        try {
            final ArrayList<Long> divisors = numberTheory.NumberTheoryUtil.primitiveRoots(HelpingClass.input2Long(Input));
            Result.setText("");
            divisors.forEach((divisor) -> {
                Result.setText(Result.getText() + divisor + "\n");
            });
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
        } finally {
            if (Result.getText().trim().isEmpty()) {
                Result.setText("There is no primitive roots for this number");
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

}
