package FichaPratica05;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[6];
        boolean crescente = true;

        // Leitura dos valores
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] <= vetor[i - 1]) {
                crescente = false;
                // break;
            }
        }

        if (crescente) {
            System.out.println("Crescente");
        } else {
            System.out.println("Não crescente");
        }


    }
}
