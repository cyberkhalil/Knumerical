package runningApplication;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NumberTheoryApplication extends Application {

    private static Scene mainScene;
    private static Scene CaesarScene;
    private static Scene aboutScene;
    private static Stage stage;
    private static Scene allDivisorsScene;
    private static Scene primeDivisorsScene;
    private static Scene primeFactorizationScene;
    private static Scene gcdScene;
    private static Scene lcmScene;
    private static Scene GcdAsLinearCombinationScene;
    private static Scene SolveDiophantineScene;
    private static Scene DivisionAlgorithmScene;
    private static Scene IsPrimeScene;
    private static Scene IsRelativePrimeScene;
    private static Scene IsCongurentScene;
    private static Scene SolveLinearCongurentScene;
    private static Scene ModuloScene;
    private static Scene SolveChineseScene;
    private static Scene GetPhiScene;
    private static Scene GetTauScene;
    private static Scene GetSigmaScene;
    private static Scene numOfPrimitiveRootsScene;
    private static Scene primitiveRootsScene;
    private static Scene orderScene;

    public static void main(String[] args) {
        launch(args);
    }

    /**
     * @return the mainScene
     */
    public static Scene getMainScene() {
        return mainScene;
    }

    /**
     * @param aMainScene the mainScene to set
     */
    public static void setMainScene(Scene aMainScene) {
        mainScene = aMainScene;
    }

    /**
     * @return the CaesarScene
     */
    public static Scene getCaesarScene() {
        return CaesarScene;
    }

    /**
     * @param aCaesarScene the CaesarScene to set
     */
    public static void setCaesarScene(Scene aCaesarScene) {
        CaesarScene = aCaesarScene;
    }

    /**
     * @return the aboutScene
     */
    public static Scene getAboutScene() {
        return aboutScene;
    }

    /**
     * @param aAboutScene the aboutScene to set
     */
    public static void setAboutScene(Scene aAboutScene) {
        aboutScene = aAboutScene;
    }

    /**
     * @return the stage
     */
    public static Stage getStage() {
        return stage;
    }

    /**
     * @param aStage the stage to set
     */
    public static void setStage(Stage aStage) {
        stage = aStage;
    }

    /**
     * @return the orderScene
     */
    public static Scene getOrderScene() {
        return orderScene;
    }

    /**
     * @param aOrderScene the orderScene to set
     */
    public static void setOrderScene(Scene aOrderScene) {
        orderScene = aOrderScene;
    }

    /**
     * @return the primitiveRootsScene
     */
    public static Scene getPrimitiveRootsScene() {
        return primitiveRootsScene;
    }

    /**
     * @param aPrimitiveRootsScene the primitiveRootsScene to set
     */
    public static void setPrimitiveRootsScene(Scene aPrimitiveRootsScene) {
        primitiveRootsScene = aPrimitiveRootsScene;
    }

    /**
     * @return the numOfPrimitiveRootsScene
     */
    public static Scene getNumOfPrimitiveRootsScene() {
        return numOfPrimitiveRootsScene;
    }

    /**
     * @param aNumOfPrimitiveRootsScene the numOfPrimitiveRootsScene to set
     */
    public static void setNumOfPrimitiveRootsScene(Scene aNumOfPrimitiveRootsScene) {
        numOfPrimitiveRootsScene = aNumOfPrimitiveRootsScene;
    }

    /**
     * @return the allDivisorsScene
     */
    public static Scene getAllDivisorsScene() {
        return allDivisorsScene;
    }

    /**
     * @param aAllDivisorsScene the allDivisorsScene to set
     */
    public static void setAllDivisorsScene(Scene aAllDivisorsScene) {
        allDivisorsScene = aAllDivisorsScene;
    }

    /**
     * @return the primeDivisorsScene
     */
    public static Scene getPrimeDivisorsScene() {
        return primeDivisorsScene;
    }

    /**
     * @param aPrimeDivisorsScene the primeDivisorsScene to set
     */
    public static void setPrimeDivisorsScene(Scene aPrimeDivisorsScene) {
        primeDivisorsScene = aPrimeDivisorsScene;
    }

    /**
     * @return the primeFactorizationScene
     */
    public static Scene getPrimeFactorizationScene() {
        return primeFactorizationScene;
    }

    /**
     * @param aPrimeFactorizationScene the primeFactorizationScene to set
     */
    public static void setPrimeFactorizationScene(Scene aPrimeFactorizationScene) {
        primeFactorizationScene = aPrimeFactorizationScene;
    }

    /**
     * @return the gcdScene
     */
    public static Scene getGcdScene() {
        return gcdScene;
    }

    /**
     * @param aGcdScene the gcdScene to set
     */
    public static void setGcdScene(Scene aGcdScene) {
        gcdScene = aGcdScene;
    }

    /**
     * @return the lcmScene
     */
    public static Scene getLcmScene() {
        return lcmScene;
    }

    /**
     * @param aLcmScene the lcmScene to set
     */
    public static void setLcmScene(Scene aLcmScene) {
        lcmScene = aLcmScene;
    }

    /**
     * @return the GcdAsLinearCombinationScene
     */
    public static Scene getGcdAsLinearCombinationScene() {
        return GcdAsLinearCombinationScene;
    }

    /**
     * @param aGcdAsLinearCombinationScene the GcdAsLinearCombinationScene to
     * set
     */
    public static void setGcdAsLinearCombinationScene(Scene aGcdAsLinearCombinationScene) {
        GcdAsLinearCombinationScene = aGcdAsLinearCombinationScene;
    }

    /**
     * @return the SolveDiophantineScene
     */
    public static Scene getSolveDiophantineScene() {
        return SolveDiophantineScene;
    }

    /**
     * @param aSolveDiophantineScene the SolveDiophantineScene to set
     */
    public static void setSolveDiophantineScene(Scene aSolveDiophantineScene) {
        SolveDiophantineScene = aSolveDiophantineScene;
    }

    /**
     * @return the DivisionAlgorithmScene
     */
    public static Scene getDivisionAlgorithmScene() {
        return DivisionAlgorithmScene;
    }

    /**
     * @param aDivisionAlgorithmScene the DivisionAlgorithmScene to set
     */
    public static void setDivisionAlgorithmScene(Scene aDivisionAlgorithmScene) {
        DivisionAlgorithmScene = aDivisionAlgorithmScene;
    }

    /**
     * @return the IsPrimeScene
     */
    public static Scene getIsPrimeScene() {
        return IsPrimeScene;
    }

    /**
     * @param aIsPrimeScene the IsPrimeScene to set
     */
    public static void setIsPrimeScene(Scene aIsPrimeScene) {
        IsPrimeScene = aIsPrimeScene;
    }

    /**
     * @return the IsRelativePrimeScene
     */
    public static Scene getIsRelativePrimeScene() {
        return IsRelativePrimeScene;
    }

    /**
     * @param aIsRelativePrimeScene the IsRelativePrimeScene to set
     */
    public static void setIsRelativePrimeScene(Scene aIsRelativePrimeScene) {
        IsRelativePrimeScene = aIsRelativePrimeScene;
    }

    /**
     * @return the IsCongurentScene
     */
    public static Scene getIsCongurentScene() {
        return IsCongurentScene;
    }

    /**
     * @param aIsCongurentScene the IsCongurentScene to set
     */
    public static void setIsCongurentScene(Scene aIsCongurentScene) {
        IsCongurentScene = aIsCongurentScene;
    }

    /**
     * @return the SolveLinearCongurentScene
     */
    public static Scene getSolveLinearCongurentScene() {
        return SolveLinearCongurentScene;
    }

    /**
     * @param aSolveLinearCongurentScene the SolveLinearCongurentScene to set
     */
    public static void setSolveLinearCongurentScene(Scene aSolveLinearCongurentScene) {
        SolveLinearCongurentScene = aSolveLinearCongurentScene;
    }

    /**
     * @return the ModuloScene
     */
    public static Scene getModuloScene() {
        return ModuloScene;
    }

    /**
     * @param aModuloScene the ModuloScene to set
     */
    public static void setModuloScene(Scene aModuloScene) {
        ModuloScene = aModuloScene;
    }

    /**
     * @return the SolveChineseScene
     */
    public static Scene getSolveChineseScene() {
        return SolveChineseScene;
    }

    /**
     * @param aSolveChineseScene the SolveChineseScene to set
     */
    public static void setSolveChineseScene(Scene aSolveChineseScene) {
        SolveChineseScene = aSolveChineseScene;
    }

    /**
     * @return the GetPhiScene
     */
    public static Scene getGetPhiScene() {
        return GetPhiScene;
    }

    /**
     * @param aGetPhiScene the GetPhiScene to set
     */
    public static void setGetPhiScene(Scene aGetPhiScene) {
        GetPhiScene = aGetPhiScene;
    }

    /**
     * @return the GetTauScene
     */
    public static Scene getGetTauScene() {
        return GetTauScene;
    }

    /**
     * @param aGetTauScene the GetTauScene to set
     */
    public static void setGetTauScene(Scene aGetTauScene) {
        GetTauScene = aGetTauScene;
    }

    /**
     * @return the GetSigmaScene
     */
    public static Scene getGetSigmaScene() {
        return GetSigmaScene;
    }

    /**
     * @param aGetSigmaScene the GetSigmaScene to set
     */
    public static void setGetSigmaScene(Scene aGetSigmaScene) {
        GetSigmaScene = aGetSigmaScene;
    }

    @Override
    public void start(Stage stage) throws IOException {
        /**
         * Those Fxml's is the main interface
         */
        Parent Main_Parent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/main_Interfaces/NumTheoryFXML.fxml"));
        Parent aboutrootParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/main_Interfaces/AboutFXML.fxml"));
        setAboutScene(new Scene(aboutrootParent, 520, 330));
        setMainScene(new Scene(Main_Parent, 540, 390));

        /**
         * Those Fxml's is the Divisors interface
         */
        Parent allDivisorsParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/divisors/AllDivisors.fxml"));
        Parent primeDivisorsParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/divisors/PrimeDivisors.fxml"));
        Parent primeFactorizationParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/divisors/PrimeFactorization.fxml"));
        setAllDivisorsScene(new Scene(allDivisorsParent, 530, 300));
        setPrimeDivisorsScene(new Scene(primeDivisorsParent, 535, 330));
        setPrimeFactorizationScene(new Scene(primeFactorizationParent, 640, 320));

        /**
         * Those Fxml's is the GCD interface
         */
        Parent GcdParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/GCD/Gcd.fxml"));
        Parent LCMParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/GCD/LCM.fxml"));
        Parent GcdAsLinearCombinationParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/GCD/GcdAsLinearCombination.fxml"));
        setGcdScene(new Scene(GcdParent, 570, 270));
        setLcmScene(new Scene(LCMParent, 570, 260));
        setGcdAsLinearCombinationScene(new Scene(GcdAsLinearCombinationParent, 660, 245));

        /**
         * Those Fxml's is the primes interface
         */
        Parent IsPrimeParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/primes/IsPrime.fxml"));
        Parent IsRelativePrimeParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/primes/IsRelativePrime.fxml"));
        setIsPrimeScene(new Scene(IsPrimeParent, 530, 240));
        setIsRelativePrimeScene(new Scene(IsRelativePrimeParent, 600, 230));
        // done before in the same method
        //Parent primeDivisorsParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/divisors/PrimeDivisors.fxml"));
        /**
         * Those Fxml's is the diophantine interface
         */
        Parent SolveDiophantineParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/diophantine/SolveDiophantine.fxml"));
        Parent DivisionAlgorithmParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/diophantine/DivisionAlgorithm.fxml"));
        setSolveDiophantineScene(new Scene(SolveDiophantineParent, 570, 280));
        setDivisionAlgorithmScene(new Scene(DivisionAlgorithmParent, 680, 280));

        /**
         * Those Fxml's is the modulo interface
         */
        Parent IsCongurentParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/modulo/IsCongurent.fxml"));
        Parent SolveLinearCongurentParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/modulo/SolveLinearCongurent.fxml"));
        Parent ModuloParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/modulo/Modulo.fxml"));
        setIsCongurentScene(new Scene(IsCongurentParent, 650, 240));
        setSolveLinearCongurentScene(new Scene(SolveLinearCongurentParent, 560, 250));
        setModuloScene(new Scene(ModuloParent, 540, 220));

        /**
         * Those Fxml's is the encryption interface
         */
        Parent CaesarParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/encryption/Caesar.fxml"));
        setCaesarScene(new Scene(CaesarParent, 630, 360));

        /**
         * Those Fxml's is the chinese interface
         */
        Parent SolveChineseParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/chinese/SolveChinese.fxml"));
        setSolveChineseScene(new Scene(SolveChineseParent, 550, 370));

        /**
         * Those Fxml's is the τ_σ_𝜙 interface
         */
        Parent GetPhiParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/tau_sigma_phi/GetPhi.fxml"));
        Parent GetTauParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/tau_sigma_phi/GetTau.fxml"));
        Parent GetSigmaParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/tau_sigma_phi/GetSigma.fxml"));
        setGetPhiScene(new Scene(GetPhiParent, 480, 210));
        setGetTauScene(new Scene(GetTauParent, 480, 210));
        setGetSigmaScene(new Scene(GetSigmaParent, 470, 220));

        /**
         * Those Fxml's is the primitiveRoots interface
         */
        Parent numOfPrimitiveRootsParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/primitiveRoots/NumOfPrimitiveRoots.fxml"));
        Parent primitiveRootsParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/primitiveRoots/primitiveRoots.fxml"));
        Parent orderParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/primitiveRoots/order.fxml"));
        setNumOfPrimitiveRootsScene(new Scene(numOfPrimitiveRootsParent, 520, 220));
        setPrimitiveRootsScene(new Scene(primitiveRootsParent, 560, 290));
        setOrderScene(new Scene(orderParent, 470, 220));

        stage.setScene(getMainScene());
        stage.show();

        stage.setResizable(false);
        NumberTheoryApplication.setStage(stage);
    }

}
