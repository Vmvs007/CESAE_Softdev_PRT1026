package FichaPratica05;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int[][] matriz = new int[3][3];

        // Leitura da matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        // Impressão da matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "  ");
            }
            System.out.println();
        }

        // Calcular o menor e o maior elemento
        int maior = matriz[0][0];
        int menor = matriz[0][0];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                if (matriz[linha][coluna] > maior) {
                    maior = matriz[linha][coluna];
                }

                if (matriz[linha][coluna] < menor) {
                    menor = matriz[linha][coluna];
                }

            }
        }

        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);

    }
}