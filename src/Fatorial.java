import javax.swing.*;

public class Fatorial {
    public void fatorar(){
        int number = Integer.parseInt(JOptionPane.showInputDialog(" Digite o número para fatorar: "));

        int fatorial = 1;

        for (int i = 1; i <= number; i++){
            fatorial *= i;
        }

        JOptionPane.showMessageDialog(null," O número " + number + " fatorial é: " + fatorial);
    }
}
