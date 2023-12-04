
import javax.swing.JTextField;
import static org.junit.Assert.*;
import org.junit.Test;
import validar.Validar;

public class ValidarJUnitTest {

    public class TuClaseTest {

        @Test
        public void testEsValidoID_CasoValido() {
            JTextField textField = new JTextField("123");

            boolean resultado = Validar.esValidoID(textField);

            assertTrue(resultado);
        }

        @Test
        public void testEsValidoID_CasoInvalidoLetras() {
            JTextField textField = new JTextField("abc");

            boolean resultado = Validar.esValidoID(textField);

            assertFalse(resultado);
        }

        @Test
        public void testEsValidoID_CasoInvalidoCero() {
            JTextField textField = new JTextField("0");

            boolean resultado = Validar.esValidoID(textField);

            assertFalse(resultado);
        }

        @Test
        public void testEsValidoID_CasoInvalidoVacio() {
            JTextField textField = new JTextField("");

            boolean resultado = Validar.esValidoID(textField);

            assertFalse(resultado);
        }

    }

}
