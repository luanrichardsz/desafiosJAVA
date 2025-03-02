package calculadora;

import javax.swing.*;
import java.util.Scanner;

/**
 * Calculadora com Java
 */

public class Main {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        // Instanciando as Classes
        Dividir divide = new Dividir();
        Soma soma = new Soma();
        Subtrair subtrai = new Subtrair();
        Multiplicar multiplica = new Multiplicar();

        // Mensagem de Bem Vindo
        JOptionPane.showMessageDialog(null, "        Bem vindo a \n Calculadora Calcular");

        // Adicionar o WHILE para continuação de codigo

        // Pedindo a opção para o usuario
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite qual a operação desejada: \n 1 - Somar \n 2 - Subtrair \n 3 - Dividir \n 4 - Multiplicar"));

        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro numero: "));

        int resultado = 0;

        switch (opcao) {
            case 1:
                soma.somar(n1, n2, resultado);
                break;
            case 2:
                subtrai.subtrair(n1, n2, resultado);
                break;
            case 3:
                if (n2 == 0){
                    JOptionPane.showMessageDialog(null, "Erro: Divisão por zero!");
                } else {
                    divide.dividir(n1, n2, resultado);
                }
                break;
            case 4:
                multiplica.multiplicar(n1, n2, resultado);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Invalida");
                break;
        }
        sc.close();
    }
}
