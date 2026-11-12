package FichaPratica05;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] v1 = new int[10];
        int[] v2 = new int[10];
        int[][] matriz = new int[10][2];

        // Leitura dos valores
        for (int i = 0; i < v1.length; i++) {
            System.out.print("Insira no vetor 1[" + i + "]: ");
            v1[i] = input.nextInt();
        }

        for (int i = 0; i < v2.length; i++) {
            System.out.print("Insira no vetor 2[" + i + "]: ");
            v2[i] = input.nextInt();
        }

        System.out.println("___________________________________");
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][0]=v1[i];
            matriz[i][1]=v2[i];
        }


        // Impressão da matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "  ");
            }
            System.out.println();
        }

    }
}
