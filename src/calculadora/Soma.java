package calculadora;

import javax.swing.*;

public class Soma {
    public void somar(int n1, int n2, int resultado){
        resultado = n1 + n2;

        JOptionPane.showMessageDialog(null, "A soma do numero:  "+ n1 + " \n com o numero: " + n2 + " \n ficou: " + resultado );
    }
}
