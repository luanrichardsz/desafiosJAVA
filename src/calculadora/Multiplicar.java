package calculadora;

import javax.swing.*;

public class Multiplicar {
    public void multiplicar(int n1, int n2, int resultado){
        resultado = n1 * n2;
        JOptionPane.showMessageDialog(null, "O número: " + n1 + " \n multiplicado com o numero: " + n2 + "\n ficou: " + resultado);
    }
}
