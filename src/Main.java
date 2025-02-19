/** Treinando minhas praticas em Java
 * @author Luan Richard
 * @version 0.1
 *
 */

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        InverterString inverterString = new InverterString();

        String frase = JOptionPane.showInputDialog("Digite sua frase ou uma palavra: ");

        /**
         * Método para inverter a String e retornar na tela
         */
        inverterString.inverter(frase);
    }
}