package FichaPratica05;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];

        // Leitura dos valores
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        System.out.println("___________________________________");

        // Impressão dos valores
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor[" + i + "]: " + vetor[i]);
        }
    }
}
