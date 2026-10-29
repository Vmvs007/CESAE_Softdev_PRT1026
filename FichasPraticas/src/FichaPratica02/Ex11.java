package FichaPratica02;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double saldo, movimento;

        // Ler valores
        System.out.print("Insira o saldo: ");
        saldo = input.nextDouble();

        System.out.print("Movimento: ");
        movimento = input.nextDouble();

        if (saldo + movimento >= 0) { // Saldo suficiente
            System.out.println("Operação concluída com sucesso.");
            saldo = saldo + movimento;
        } else {
            System.out.println("Operação inválida. Saldo insuficiente.");
        }

        System.out.println("Saldo final: " + saldo + " €");

    }
}
