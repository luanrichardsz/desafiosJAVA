/**
 * Classe principal para executar minhas praticas em Java.
 *
 * @author Luan Richard
 * @version 0.2
 */
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /**
         * Instância da classe InverterString para processar a inversão de uma String.
         */
        InverterString inverterString = new InverterString();

        // Chama o método de inversão
        inverterString.inverter();

        /**
         * Instância da classe ValidacaoParImpar para verificar se um número é par ou ímpar.
         */
        ValidacaoParImpar validacaoParImpar = new ValidacaoParImpar();

        // Chama o método de validação
        validacaoParImpar.ImparOuPar();

        /**
         * Instância da classe Fatorial para descobrir o número fatorado
         */
        Fatorial fatorial = new Fatorial();

        fatorial.fatorar();
    }
}
