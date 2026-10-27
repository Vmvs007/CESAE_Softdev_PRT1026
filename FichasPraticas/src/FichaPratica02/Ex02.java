package FichaPratica02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double salario, taxa;

        // Leitura dos valores
        System.out.print("Insira o seu salário anual: ");
        salario = input.nextDouble();

        if (salario <= 15000) {
            taxa = salario * 0.2;
            System.out.println("Taxa 20%: " + taxa + " €");
        } else {
            taxa = salario * 0.3;
            System.out.println("Taxa 30%: " + taxa + " €");
        }

    }
}
