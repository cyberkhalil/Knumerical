package runningApplication;

import java.util.ArrayList;
import java.util.Arrays;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import static numberTheory.NumberTheoryUtil.strPow;

public class HelpingClass {

    public static Long input2Long(TextField tf) {

        return strPow(tf.getText().trim());
    }

    public static long[] input2ArrayOfLongs(TextField tf) throws NumberFormatException {

        String[] inputs = tf.getText().trim().split("[, ]+");
        long[] result = new long[inputs.length];
        try {
            for (int i = 0; i < inputs.length; i++) {
                result[i] = strPow(inputs[i]);
            }
        } catch (NumberFormatException ex) {
            throw new NumberFormatException("Invaild Number (" + tf.getText() + ")");
        }
        return result;
    }

    public static ArrayList<Long[]> input2ArrayListofArrayOfLongs(TextArea ta) throws NumberFormatException {

        String[] lines = ta.getText().trim().split("\n");
        ArrayList<Long[]> result = new ArrayList<>(lines.length);
        for (int i = 0; i < lines.length; i++) {
            String[] inputs = lines[i].trim().split("[, ]+");
            result.add(new Long[inputs.length]);
            try {
                for (int j = 0; j < inputs.length; j++) {
                    result.get(i)[j] = strPow(inputs[j]);
                }
            } catch (NumberFormatException ex) {
                throw new NumberFormatException("Invaild Number (" + Arrays.toString(inputs) + ")");
            }
        }
        return result;
    }

    private HelpingClass() {
    }

}
