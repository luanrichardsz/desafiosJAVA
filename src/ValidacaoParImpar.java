import javax.swing.*;

public class ValidacaoParImpar {
    public void ImparOuPar(){
        // Solicita ao usuário um número
        int number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        // Verificando e imprimindo
        if (number % 2 == 0) {
            JOptionPane.showMessageDialog(null,"Esse número é par");
        } else {
            JOptionPane.showMessageDialog(null, "Esse número é impar!");
        }
    }
}
