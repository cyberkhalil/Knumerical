/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces_and_Controllers.encryption;

import runningApplication.NumberTheoryApplication;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class CaesarController implements Initializable {

    @FXML
    private TextArea plainText;
    @FXML
    private TextArea EncryptedText;

    @FXML
    private void handlebacktomain(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getMainScene());
    }

    @FXML
    private void Encrypt_text(ActionEvent event) {

        EncryptedText.setText(new String(numberTheory.NumberTheoryUtil.caesarEncypt(plainText.getText())));

    }

    @FXML
    private void Decrypt_text(ActionEvent event) {

        plainText.setText(new String(numberTheory.NumberTheoryUtil.caesarDecrypt(EncryptedText.getText())));

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

}
