package Control;

import JTextFieldPersonalizado.JCTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class Validaciones {

    public void SoloNumeros(JTextField campo) {
        try {
            campo.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    char c = e.getKeyChar();
                    if (!Character.isDigit(c)) {
                        e.consume();
                    }
                }
            });
        } catch (Exception e) {
        }
    }

    public void LimitarCaracteres(JTextField campo, int cantidad) {
        try {
            campo.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    char c = e.getKeyChar();
                    int tamaño = campo.getText().length();
                    if (tamaño >= cantidad) {
                        e.consume();
                    }
                }
            });
        } catch (Exception e) {
        }
    }
}
