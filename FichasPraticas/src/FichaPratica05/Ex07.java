package FichaPratica05;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[5];

        // Leitura dos valores
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        int maiorPar = -1;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {

                if (maiorPar == -1) { // maiorPar ainda é o -1
                    maiorPar = vetor[i];
                } else if (vetor[i] > maiorPar) {
                    maiorPar = vetor[i];
                }
            }
        }

        if (maiorPar == -1) {
            System.out.println("Não há pares");
        } else {
            System.out.println("Maior par: " + maiorPar);
        }


    }
}
