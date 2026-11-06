package FichaPratica05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[6];
        int somatorio = 0, media;

        // Leitura dos valores
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            somatorio += vetor[i];
        }

        media = somatorio / vetor.length;
        System.out.println("Média: " + media);


    }
}
