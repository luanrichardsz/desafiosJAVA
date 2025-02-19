import javax.swing.*;
import java.util.Scanner;

public class InverterString {
        public void inverter(String frase){
                String palavraInvertida = new StringBuilder(frase).reverse().toString();
                JOptionPane.showMessageDialog(null, palavraInvertida);
        }
}