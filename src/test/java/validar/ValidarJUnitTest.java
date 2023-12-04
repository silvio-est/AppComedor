package validar;

import javax.swing.JTextField;
import static org.junit.Assert.*;
import org.junit.Test;

public class ValidarJUnitTest {

    @Test
    public void testEsValidoID_CasoValido() {
        // Arrange
        JTextField textField = new JTextField("123");

        // Act
        boolean resultado = Validar.esValidoID(textField);

        // Assert
        assertTrue(resultado);
    }

    @Test
    public void testEsValidoID_CasoInvalidoLetras() {
        // Arrange
        JTextField textField = new JTextField("abc");

        // Act
        boolean resultado = Validar.esValidoID(textField);

        // Assert
        assertFalse(resultado);
    }

    @Test
    public void testEsValidoID_CasoInvalidoCero() {
        // Arrange
        JTextField textField = new JTextField("0");

        // Act
        boolean resultado = Validar.esValidoID(textField);

        // Assert
        assertFalse(resultado);
    }

    @Test
    public void testEsValidoID_CasoInvalidoVacio() {
        // Arrange
        JTextField textField = new JTextField("");

        // Act
        boolean resultado = Validar.esValidoID(textField);

        // Assert
        assertFalse(resultado);
    }

    // Puedes agregar más casos de prueba según tus necesidades
}
