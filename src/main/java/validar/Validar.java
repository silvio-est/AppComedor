package validar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Validar {

    public static boolean esValidoID(JTextField textFild) {
        String regex = "^[1-9]\\d*$";
        Pattern pattern = Pattern.compile(regex);

        String textoValidar = textFild.getText();

        Matcher matcher = pattern.matcher(textoValidar);

        if (matcher.matches()) {
            return true;

        } else {
            JOptionPane.showMessageDialog(null, "Debe de introducir un ID valido", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    public static boolean esValidoNombre(JTextField textFild) {
        String regex = "^([A-Za-z]+|)$";
        Pattern pattern = Pattern.compile(regex);

        String textoValidar = textFild.getText();

        Matcher matcher = pattern.matcher(textoValidar);

        if (matcher.matches()) {
            return true;

        } else {
            JOptionPane.showMessageDialog(null, "Debe de introducir un Nombre valido", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
}
