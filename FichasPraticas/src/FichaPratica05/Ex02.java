package FichaPratica05;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double[] vetor = new double[10];
        double totalAnual = 0;

        // Leitura dos valores
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextDouble();
        }

        // Calcular a soma
        for (int i = 0; i < vetor.length; i++) {
            totalAnual += vetor[i];
        }

        System.out.println("Total Anual: " + totalAnual + " €");

    }
}
