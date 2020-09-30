/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces_and_Controllers.main_Interfaces;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import runningApplication.NumberTheoryApplication;

public class NumTheoryFXMLController implements Initializable {

    @FXML
    private TitledPane tp_Divisors;
    @FXML
    private TitledPane tp_GCD;
    @FXML
    private TitledPane tp_Primes;
    @FXML
    private TitledPane tp_Dioph;
    @FXML
    private TitledPane tp_Mod;
    @FXML
    private TitledPane tp_Encrypt;
    @FXML
    private TitledPane tp_Chinese;
    @FXML
    private TitledPane tp_τ_σ_𝜙;
    @FXML
    private TitledPane tp_PrimitiveR;
    @FXML
    private Label label;
    @FXML
    private Button AllDivisorsbtn;

    @FXML
    private void handleAboutAction(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getAboutScene());
    }

    @FXML
    private void openAllDivisors(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getAllDivisorsScene());
    }

    @FXML
    private void openPrimeDivisors(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getPrimeDivisorsScene());
    }

    @FXML
    private void openPrimeFactorizations(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getPrimeFactorizationScene());
    }

    @FXML
    private void openGcd(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getGcdScene());
    }

    @FXML
    private void openLcm(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getLcmScene());
    }

    @FXML
    private void openGcdAsLinearCombination(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getGcdAsLinearCombinationScene());
    }

    @FXML
    private void openSolveDiophantine(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getSolveDiophantineScene());
    }

    @FXML
    private void openDivisionAlgorithm(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getDivisionAlgorithmScene());
    }

    @FXML
    private void openIsPrime(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getIsPrimeScene());
    }

    @FXML
    private void openIsRelativePrime(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getIsRelativePrimeScene());
    }

    @FXML
    private void openIsCongurent(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getIsCongurentScene());
    }

    @FXML
    private void openSolveLinearCongurent(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getSolveLinearCongurentScene());
    }

    @FXML
    private void openModulo(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getModuloScene());
    }

    @FXML
    private void openSolveChinese(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getSolveChineseScene());
    }

    @FXML
    private void openGetPhi(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getGetPhiScene());
    }

    @FXML
    private void openGetTau(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getGetTauScene());
    }

    @FXML
    private void openGetSigma(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getGetSigmaScene());
    }

    @FXML
    private void openNumOfPrimitiveRoots(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getNumOfPrimitiveRootsScene());
    }

    @FXML
    private void openPrimitiveroots(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getPrimitiveRootsScene());
    }

    @FXML
    private void Computetheorder(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getOrderScene());
    }

    @FXML
    private void openCaesar(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getCaesarScene());
    }

    @FXML
    private void do_Animation(ActionEvent event) {
        System.out.println("here");
//        boolean isAnimated = tp_PrimitiveR.isExpanded() && tp_τ_σ_𝜙.isExpanded() && tp_Chinese.isExpanded() && tp_Encrypt.isExpanded() && tp_Mod.isExpanded() && tp_Dioph.isExpanded() && tp_Divisors.isExpanded() && tp_GCD.isExpanded() && tp_Primes.isExpanded();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

}
