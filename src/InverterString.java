import javax.swing.*;

public class InverterString {
        public void inverter(){
                // Solicita ao usuário uma frase ou palavra para inverter
                String frase = JOptionPane.showInputDialog("Digite sua frase ou uma palavra: ");

                // Invertendo  frase ou palavra e colocando na variavel
                String palavraInvertida = new StringBuilder(frase).reverse().toString();

                // Imprimindo a palavra invertida
                JOptionPane.showMessageDialog(null, palavraInvertida);
        }
}